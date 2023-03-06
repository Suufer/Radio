import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testNextStationLast() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationFirst() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
}




