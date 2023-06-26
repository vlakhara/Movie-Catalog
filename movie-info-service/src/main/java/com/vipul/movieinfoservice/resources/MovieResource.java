package com.vipul.movieinfoservice.resources;

import com.vipul.movieinfoservice.models.Movie;
import com.vipul.movieinfoservice.models.Movies;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        return new Movie(movieId,"Avengers : Infinity war");
    }

    @RequestMapping("/all")
    public Movies getMoviesInfo(){
        List<Movie> movieList = Arrays.asList(
                new Movie("1","Thor"),
                new Movie("2","Loki"),
                new Movie("3","Iron Man"),
                new Movie("4","Iron Man 2"),
                new Movie("5","Sholay"),
                new Movie("6","Thor : The Dark World")
        );
        Movies movies = new Movies();
        movies.setMoviesList(movieList);
        return movies;
    }
}
