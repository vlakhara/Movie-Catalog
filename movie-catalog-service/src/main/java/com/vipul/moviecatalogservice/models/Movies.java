package com.vipul.moviecatalogservice.models;

import java.util.List;

public class Movies {

    private List<Movie> moviesList;

    public List<Movie> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "moviesList=" + moviesList +
                '}';
    }
}
