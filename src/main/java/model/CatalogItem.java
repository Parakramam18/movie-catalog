package model;
/*   RajUser created on 10/26/2019 
inside the package - model  */

public class CatalogItem {

    private String name;

    public CatalogItem(String name, String desc, String rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }

    private String desc;
    private String rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
