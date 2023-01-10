package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTests {
    @ParameterizedTest
    @CsvSource({
            "0, -1",
            "0, 0",
            "1, 1",
            "8, 8",
            "9, 9",
            "0, 10"
    })
    public void shouldSetCurrentStation(int expected, int newCurrentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(newCurrentStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "2, 1",
            "9, 8",
            "0, 9"
    })
    public void shouldSetNextStation(int expected, int newCurrentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(newCurrentStation);
        radio.setNextStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "8, 9",
            "7, 8",
            "0, 1",
            "9, 0"
    })
    public void shouldSetPreviewStation(int expected, int newCurrentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(newCurrentStation);
        radio.setPrevStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, -1",
            "0, 0",
            "1, 1",
            "9, 9",
            "10, 10",
            "0, 11"
    })
    public void shouldSetCurrentVolume(int expected, int newCurrentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "2, 1",
            "10, 9",
            "10, 10"
    })
    public void shouldIncreaseVolume(int expected, int newCurrentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9, 10",
            "8, 9",
            "0, 1",
            "0, 0"
    })
    public void shouldDecreaseVolume(int expected, int newCurrentVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

