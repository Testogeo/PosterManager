package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void testFindAll() {
        MovieManager manager = new MovieManager();
        String movie1 = "Бладшот";
        String movie2 = "Отель Белград";
        String movie3 = "Вперед";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Отель Белград", "Вперед"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinLastWhenLimitLessSize1() {
        MovieManager manager = new MovieManager();
        String movie1 = "Бладшот";
        String movie2 = "Отель Белград";
        String movie3 = "Вперед";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] actual = manager.findLast();
        String[] expected = {"Номер один",
                "Человек-невидимка",
                "Джентельмены",
                "Вперед",
                "Отель Белград"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinLastWhenLimitLessSize2() {
        MovieManager manager = new MovieManager(3);
        String movie1 = "Бладшот";
        String movie2 = "Отель Белград";
        String movie3 = "Вперед";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] actual = manager.findLast();
        String[] expected = {
                "Номер один",
                "Человек-невидимка",
                "Джентельмены",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinLastWhenLimitMoreSize1() {
        MovieManager manager = new MovieManager(5);
        String movie1 = "Бладшот";
        String movie2 = "Отель Белград";
        String movie3 = "Вперед";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);


        String[] actual = manager.findLast();
        String[] expected = {
                "Вперед",
                "Отель Белград",
                "Бладшот",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinLastWhenLimitMoreSize2() {
        MovieManager manager = new MovieManager(4);
        String movie1 = "Бладшот";
        String movie2 = "Отель Белград";
        String movie3 = "Вперед";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);


        String[] actual = manager.findLast();
        String[] expected = {
                "Вперед",
                "Отель Белград",
                "Бладшот",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

}