package com.Project;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieDatabase {
    private List<Movie> movies;

    public MovieDatabase() {
        movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", 2010, 8.8));
        movies.add(new Movie("The Godfather", "Crime", 1972, 9.2));
        movies.add(new Movie("The Dark Knight", "Action", 2008, 9.0));
        movies.add(new Movie("Pulp Fiction", "Crime", 1994, 8.9));
        movies.add(new Movie("Forrest Gump", "Drama", 1994, 8.8));
        movies.add(new Movie("The Matrix", "Sci-Fi", 1999, 8.7));
    }

    public List<Movie> filterByGenre(String genre) {
        return movies.stream()
                     .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                     .collect(Collectors.toList());
    }

    public List<Movie> filterByRating(double minRating) {
        return movies.stream()
                     .filter(movie -> movie.getRating() >= minRating)
                     .collect(Collectors.toList());
    }

    public List<Movie> filterByYear(int year) {
        return movies.stream()
                     .filter(movie -> movie.getYear() == year)
                     .collect(Collectors.toList());
    }
}
