package catalogResources;
/*   RajUser created on 10/26/2019 
inside the package - movieResources  */

import model.CatalogItem;
import model.Movie;
import model.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalog {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello()
    {
        return  "Hello Raj";
    }


     @RequestMapping("/{userID}")
    public List<CatalogItem> getMovieCatalogItems(@PathVariable("userID") String userID)
    {
//       return Collections.singletonList(new CatalogItem("Rama","Rama","9"));

//        UserRatings userRatings = restTemplate.getForObject("http://localhost:9093/rating/" + userID, UserRatings.class);
        UserRatings userRatings = restTemplate.getForObject("http://movie-rating/rating/" + userID, UserRatings.class);

       return userRatings.getRatingDataList().stream().map(ratingData -> {

//           Movie movie = restTemplate.getForObject("http://localhost:9091/movies/" + ratingData.getMovieid(), Movie.class);
           Movie movie = restTemplate.getForObject("http://movie-info/movies/" + ratingData.getMovieid(), Movie.class);

            return new CatalogItem(movie.getMovieName(),"Desc",ratingData.getRatings());

        }).collect(Collectors.toList());


    }
}
