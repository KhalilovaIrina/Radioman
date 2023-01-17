package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int amountStation = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int amountStation) {
        if (amountStation >= 1) {
            this.amountStation = amountStation;
        } else {
            amountStation = this.amountStation;
        }
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxStation() {

        int maxStation = amountStation - 1;
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        int maxStation = getMaxStation();

        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void setNextStation() {
        int maxStation = getMaxStation();
        currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        int maxStation = getMaxStation();
        currentStation = currentStation - 1;
        if (currentStation < 0) {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;

        } else {
            return;
        }
    }
}

