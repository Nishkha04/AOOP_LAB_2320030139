package com.Project;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieDatabase movieDatabase = new MovieDatabase();

        System.out.println("Filter by Genre (Sci-Fi):");
        List<Movie> sciFiMovies = movieDatabase.filterByGenre("Sci-Fi");
        sciFiMovies.forEach(System.out::println);

        System.out.println("\nFilter by Rating (>= 9.0):");
        List<Movie> highRatedMovies = movieDatabase.filterByRating(9.0);
        highRatedMovies.forEach(System.out::println);

        System.out.println("\nFilter by Year (1994):");
        List<Movie> moviesFrom1994 = movieDatabase.filterByYear(1994);
        moviesFrom1994.forEach(System.out::println);
    }
}
