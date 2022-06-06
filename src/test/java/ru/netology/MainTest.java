package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void findNormalRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(5);

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(0);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessLeftBorderRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(-1);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreLeftBorderRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(1);

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreRightBorderRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(10);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(8);

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(9);

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findNextRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(4);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderNextRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(0);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    void findMoreLeftBorderNextRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(1);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderNextRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(9);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderNextRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(8);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findPrevRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(4);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderPrevRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(0);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreLeftBorderPrevRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(1);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderPrevRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(9);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderPrevRadioStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(8);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void findCustomStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(5);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderCustomStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(0);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findRightLeftBorderCustomStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(1);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderCustomStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(9);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderCustomStation() {
        Main rad = new Main();

        rad.setCurrentRadioStation(8);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findNormalSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(5);

        int actual = rad.getCurrentSoundVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findLeftBorderSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(0);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreLeftBorderSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findLessLeftBorderSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(-1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findRightBorderSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(10);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findLessRightBorderSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(9);

        int actual = rad.getCurrentSoundVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreRightBorderSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(11);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findNormalIncreaseSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(5);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIncreaseSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(10);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMaxIncreaseSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(9);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findMinDecreaseSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(0);
        rad.decreaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreMinDecreaseSoundVolume() {
        Main rad = new Main();

        rad.setSoundVolume(1);
        rad.decreaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}