package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {              // увеличение громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }


    public void decreaseVolume() {              // уменьшение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public void next() {                // следущая радиостанция
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }


    public void prev() {                // предыдущая радиостанция
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}
