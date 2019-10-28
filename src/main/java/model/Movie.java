package model;
/*   RajUser created on 10/26/2019 
inside the package - model  */

public class Movie {
    public Movie(String movieID, String movieName) {
        this.movieID = movieID;
        this.movieName = movieName;
    }
 public Movie()
 {

 }

    private String movieID;
    private String movieName;

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
