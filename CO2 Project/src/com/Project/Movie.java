package com.Project;
public class Movie {
    private String title;
    private String genre;
    private int year;
    private double rating;

    public Movie(String title, String genre, int year, double rating) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("Movie{title='%s', genre='%s', year=%d, rating=%.1f}", title, genre, year, rating);
    }
}
