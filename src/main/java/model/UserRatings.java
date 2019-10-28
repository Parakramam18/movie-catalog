package model;
/*   RajUser created on 10/27/2019 
inside the package - model  */

import java.util.List;

public class UserRatings {
    public List<RatingData> getRatingDataList() {
        return ratingDataList;
    }

    public void setRatingDataList(List<RatingData> ratingDataList) {
        this.ratingDataList = ratingDataList;
    }

    private List<RatingData> ratingDataList;
}
