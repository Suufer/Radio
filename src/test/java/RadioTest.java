import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {
    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getStationCount());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testConstructorWithStationCount() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getStationCount());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(20);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());
        radio.setVolume(-1);
        assertEquals(50, radio.getVolume());
        radio.setVolume(101);
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio(3);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(2, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio(3);
        radio.prevStation();
        assertEquals(2, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(1, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void testIncreaseVolumeToMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getVolume());
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();


        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());


        for (int i = 0; i < 10; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getVolume());


        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());


        radio.setVolume(50);
        for (int i = 0; i < 50; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getVolume());
    }
}


