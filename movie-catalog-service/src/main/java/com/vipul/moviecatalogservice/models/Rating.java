package com.vipul.moviecatalogservice.models;

public class Rating {
    private String movieId;
    private String rating;

    public Rating(String movieId, String rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    Rating(){}

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
