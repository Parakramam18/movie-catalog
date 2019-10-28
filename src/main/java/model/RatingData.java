package model;
/*   RajUser created on 10/27/2019 
inside the package - model  */

public class RatingData {

public RatingData()
{

}

    private String movieid;
    private String ratings;

    public RatingData(String movieid, String ratings) {
        this.movieid = movieid;
        this.ratings = ratings;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }


}
