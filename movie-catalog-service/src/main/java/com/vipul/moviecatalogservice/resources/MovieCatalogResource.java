package com.vipul.moviecatalogservice.resources;

import com.vipul.moviecatalogservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){



        UserRatings userRatings = restTemplate.getForObject("http://localhost:8083/ratings/users/"+ userId, UserRatings.class);

        return userRatings.getUserRating()
                .stream()
                .map(Rating -> {
                    Movie movie = restTemplate.getForObject("http://localhost:8082/movies/all", Movie.class);
                    return new CatalogItem(movie.getName(),"Sci-Fi",Rating.getRating());
                })
                .collect(Collectors.toList());

    }
}
