package com.rahul.rating.services;

import com.rahul.rating.entities.Rating;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface RatingService {
    Rating create(Rating rating);
    List<Rating> getRatings();
    List<Rating> getRatingByUserId(String userId);
    List<Rating> getRatingByHotelId(String hotelId);
}
