import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {
    @Test
    public void shouldSetCurrentStationInRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetCurrentStationBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertNotEquals(-1, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetCurrentStationAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertNotEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetCurrentVolumeBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertNotEquals(-1, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertNotEquals(11, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseStationByOneWhenNextButtonPressed() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldWrapStationToZeroWhenNextButtonPressedAtStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationByOneWhenPrevButtonPressed() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldWrapStationToNineWhenPrevButtonPressedAtStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeByOne() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeBeyondMaximum() {
        Radio radio = new Radio();
        for (int i = 0; i < 11; i++) {
            radio.increaseVolume();
        }
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeByOne() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeBeyondMinimum() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}



