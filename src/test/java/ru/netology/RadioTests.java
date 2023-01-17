package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTests {

    @ParameterizedTest
    @CsvSource({
            "10, -1",
            "10, 0",
            "1, 1",
            "2, 2",
            "9, 9",
            "10,10",
            "11, 11"
    })
    public void shouldAmountStation(int expected, int amountStation) {
        Radio radio = new Radio(amountStation);
        int actual = radio.getAmountStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, -1",
            "0, 0",
            "1, 1",
            "8, 8",
            "9, 9",
            "0, 10",
            "0, 11"
    })
    public void shouldSetCurrentStation(int expected, int newCurrentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(newCurrentStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "9, 0",
            "9, -1",
            "8, 9",
            "9, 10",
            "10, 11"
    })
    public void shouldSetCurrentStationWithParamMax(int expected, int amountStation) {
        Radio radio = new Radio(amountStation);
        int max = radio.getMaxStation();
        radio.setCurrentStation(max);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "0, 2",
            "8, 0",
            "8, -1",
            "7, 9",
            "8, 10",
            "9, 11"
    })
    public void shouldSetCurrentStationWithParamBeforeMax(int expected, int amountStation) {
        Radio radio = new Radio(amountStation);
        int max = radio.getMaxStation();
        radio.setCurrentStation(max - 1);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "0, 2",
            "0, 0",
            "0, -1",
            "0, 9",
            "0, 10",
            "0, 11"
    })
    public void shouldSetCurrentStationWithParamUnderMax(int expected, int amountStation) {
        Radio radio = new Radio(amountStation);
        int max = radio.getMaxStation();
        radio.setCurrentStation(max + 1);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "1, 0",
            "1, -1",
            "1, 9",
            "1, 10",
            "1, 11"
    })
    public void shouldSetCurrentStationWithParamNewCurrent1(int expected, int amountStation) {
        Radio radio = new Radio(amountStation);
        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 1",
            "1, 0, 2",
            "0, 1, 2",
            "0, 9, 10",
            "9, 8, 10",
            "0, 10, 11"
    })
    public void shouldSetNextStationWithParam(int expected, int newCurrentStation, int amountStation) {
        Radio radio = new Radio(amountStation);
        radio.setCurrentStation(newCurrentStation);
        radio.setNextStation();

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
            "0, 0, 1",
            "1, 0, 2",
            "0, 1, 2",
            "8, 9, 10",
            "7, 8, 10",
            "9, 0, 10",
            "10, 0, 11"
    })
    public void shouldSetPreviewStationWithParam(int expected, int newCurrentStation, int amountStation) {
        Radio radio = new Radio(amountStation);
        radio.setCurrentStation(newCurrentStation);
        radio.setPrevStation();

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
            "99, 99",
            "100, 100",
            "0, 101"
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
            "100, 99",
            "100, 100"
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
            "99, 100",
            "98, 99",
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

