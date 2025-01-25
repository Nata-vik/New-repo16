package ru.netology;

public class Radio {

    private int currentVolume;         // текущий уровень громкости
    private int currentRadioStation;   // текущая радиостанция


    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
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
        if (currentRadioStation != 9) {
            currentRadioStation++;
            return;
        }
            currentRadioStation = 0;
    }


    public void prev() {                // предыдущая радиостанция
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }
}
