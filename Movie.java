import java.util.*;

class Movie {
    String name;
    int rating, year;

    Movie(String n, int r, int y) {
        name = n;
        rating = r;
        year = y;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> list = Arrays.asList(
            new Movie("A", 5, 2023),
            new Movie("B", 4, 2022),
            new Movie("C", 5, 2021),
            new Movie("D", 3, 2024),
            new Movie("E", 4, 2023),
            new Movie("F", 5, 2022)
        );

        list.stream()
            .sorted((a, b) -> b.rating - a.rating)
            .limit(5)
            .forEach(m -> System.out.println(m.name));
    }
}