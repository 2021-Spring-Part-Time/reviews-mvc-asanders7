package org.wecancoeit.reviews;

import java.util.Collection;

public class Review {

    private long id;
    private String title;
    private String imageUrl;
    private String imageUrl2;
    private String reviewCategory;
    private String content;
    private String date;
    private String description;

    public Review(long id, String title, String imageUrl, String imageUrl2, String reviewCategory, String content, String date, String description) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.imageUrl2 = imageUrl2;
        this.reviewCategory = reviewCategory;
        this.content = content;
        this.date = date;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public String getImageUrl2() {
        return imageUrl2;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
