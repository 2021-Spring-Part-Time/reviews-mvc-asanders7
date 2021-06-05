package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    //constructor to handle our database
    public ReviewRepository() {
        Review vrGameOne = new Review(1L, "BeatSaber", "/images/BeatSaber-photo1.jpg",
                "/images/BeatSaber-photo2.jpg", "Fitness/Rhythm",
                "This game is so much fun! It also gives you a great workout if you play on Expert Plus mode.",
                "May 1, 2018", "Beat Saber is a virtual reality rhythm game where the player slices " +
                "blocks representing musical beats with a pair of sabers.");
        Review vrGameTwo = new Review(2L, "The Room", "/images/the-room-photo1.jpg",
                "/images/the-room-photo2.jpg", "Puzzle/Adventure", "This game is " +
                "challenging but fun. I like how you are able to get hints if you get stuck.", "March 26, 2020",
                "The Room is game where the player has to solve puzzles to advance. Each level " +
                        "has a different theme.");
        Review vrGameThree = new Review(3L, "Synth Riders", "/images/synth-riders-photo1.jpg",
                "/images/synth-riders-photo2.jpg", "Dance/Rhythm", "This game is so much fun. " +
                "It has great music and I love the neon environment.", "June 21, 2018", "Synth Riders is " +
                "a lot like Beat Saber, but instead of slicing blocks with sabers, the player hits multicolored orbs " +
                "representing musical beats.");
        Review vrGameFour = new Review(4L, "Bigscreen", "/images/bigscreen-photo1.jpg",
                "/images/bigscreen-photo2.jpg", "Entertainment", "I love this VR game. It " +
                "feels like you are actually in the movie theater! An added bonus is that you can mute other " +
                "people in the theater if they are being too loud! I love it!", "May 21, 2019",
                "BigScreen is a virtual reality movie theater. You can watch movies (even 3D ones) " +
                        "with random people, or you can join a private theater with just you and your friends. In " +
                        "addition to movies, there are also rooms where you can watch TV shows.");

        reviewList.put(vrGameOne.getId(), vrGameOne);
        reviewList.put(vrGameTwo.getId(), vrGameTwo);
        reviewList.put(vrGameThree.getId(), vrGameThree);
        reviewList.put(vrGameFour.getId(), vrGameFour);
    }

    //constructor for testing purposes only...uses varArgs to add none or as many objects as wanted
    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd) {
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
