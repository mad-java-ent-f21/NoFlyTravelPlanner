package com.jvjohnson1.no_fly.entity;

import java.util.Objects;

public class Review {

    private int userid;
    private int DestinationId;
    private String image;
    private String reviewText;

    public Review() {
    }

    public Review(int userid, int destinationId, String image, String reviewText) {
        this.userid = userid;
        DestinationId = destinationId;
        this.image = image;
        this.reviewText = reviewText;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getDestinationId() {
        return DestinationId;
    }

    public void setDestinationId(int destinationId) {
        DestinationId = destinationId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review)) return false;
        Review review = (Review) o;
        return getUserid() == review.getUserid() && getDestinationId() == review.getDestinationId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserid(), getDestinationId());
    }

    @Override
    public String toString() {
        return "Review{" +
                "userid=" + userid +
                ", DestinationId=" + DestinationId +
                ", image='" + image + '\'' +
                ", reviewText='" + reviewText + '\'' +
                '}';
    }
}
