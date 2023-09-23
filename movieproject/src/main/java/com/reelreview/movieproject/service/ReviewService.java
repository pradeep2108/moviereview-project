package com.reelreview.movieproject.service;

import com.reelreview.movieproject.model.Review;

public interface ReviewService {

    Review saveReview(String reviewBody, String imdbId);
}
