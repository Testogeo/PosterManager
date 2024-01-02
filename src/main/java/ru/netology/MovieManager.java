package ru.netology;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
        limit = 5;
    }

    public void add(String movie) {
        String[] temp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            temp[i] = movies[i];

        }
        temp[temp.length - 1] = movie;
        movies = temp;

    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {

        int resultLength;
        if (limit < movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {

            result[i] = movies[movies.length - 1 - i];

        }
        return result;
    }
}
