package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

public class ReviewRepositoryTest {

    private ReviewRepository repositoryTest;
    private Review reviewOne = new Review(1L, "review one title", "image url", "second image url", "review one category", "review one content", "review date", "review description");
    private Review reviewTwo = new Review(2L, "review two title", "image url", "second image url", "review two category", "review two content", "review date", "review description");

    @Test
    public void shouldFindReviewOne() {
        repositoryTest = new ReviewRepository(reviewOne);
        Review foundReview = repositoryTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo() {
        repositoryTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = repositoryTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}
