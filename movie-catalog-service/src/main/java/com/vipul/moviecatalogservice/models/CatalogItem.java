package com.vipul.moviecatalogservice.models;

public class CatalogItem {
    private String name;
    private String desc;
    private String ratings;

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

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public CatalogItem(String name, String desc, String ratings) {
        this.name = name;
        this.desc = desc;
        this.ratings = ratings;
    }
}
