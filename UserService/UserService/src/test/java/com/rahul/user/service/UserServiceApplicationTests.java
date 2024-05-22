package com.rahul.user.service;

import com.rahul.user.service.entities.Rating;
import com.rahul.user.service.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private RatingService ratingService;

//	@Test
//	void createRating() {
//		Rating rating = Rating.builder()
//				.rating(10)
//				.userId("")
//				.hotelId("")
//				.feedback("this is created using Feign client.")
//				.build();
//		Rating savedRating = ratingService.createRating(rating);
//		System.out.println("new rating created");
//	}

}
