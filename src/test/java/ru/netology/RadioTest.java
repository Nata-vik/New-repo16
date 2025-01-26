package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();


    @Test
    public void currentStation() {     // выбор текущей станции
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMax() {     //выбор станции больше максимальной
        Radio radio = new Radio(30);
        radio.setCurrentStation(31);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLowerMin() {    //выбор станции меньше минимальной
        Radio radio = new Radio(25);
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {             //следующая станция
        Radio radio = new Radio(30);
        radio.setCurrentStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {             //предыдущая станция
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.prev();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax() {     //станция после максимальной
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {     //станция перед минимальной
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {      //увеличить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(75);

        radio.increaseVolume();

        int expected = 76;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {      //уменьшить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(75);

        radio.decreaseVolume();

        int expected = 74;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() {   //увеличить громкость выше максимума
        Radio radio = new Radio();
        radio.setCurrentVolume(115);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLowerMin() {    //уменьшить громкость меньше мин
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
