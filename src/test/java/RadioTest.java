import org.junit.Test;
import static org.junit.Assert.*;

public class RadioTest {
    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testParameterizedConstructor() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getMaxStation());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(7);
        assertEquals(7, radio.getMaxStation());
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationInvalid() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(20);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testSetVolumeInvalid() {
        Radio radio = new Radio();
        radio.setVolume(-10);
        assertEquals(0, radio.getVolume());

        radio.setVolume(150);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio(4);
        radio.setCurrentStation(2);
        radio.nextStation();
        assertEquals(3, radio.getCurrentStation());

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio(4);
        radio.setCurrentStation(2);
        radio.prevStation();
        assertEquals(1, radio.getCurrentStation());

        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());

        radio.prevStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getVolume());

        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());

        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}


