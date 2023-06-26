package com.vipul.ratingsdataservice.resources;


import com.vipul.ratingsdataservice.models.Rating;
import com.vipul.ratingsdataservice.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResources {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,"5");
    }

    @RequestMapping("users/{userId}")
    public UserRatings getUserRatings(@PathVariable("userId") String userId){
        List<Rating> listOfRatings = Arrays.asList(
                new Rating("1","4.5"),
                new Rating("2","4.5"),
                new Rating("3","4"),
                new Rating("4","4.5"),
                new Rating("5","5"),
                new Rating("6","5")
        );
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRating(listOfRatings);
        return userRatings;
    }
}
