import org.junit.Test;
import static org.junit.Assert.*;

public class RadioTest {

    @Test
    public void testConstructorWithoutParameters() {
        Radio radio = new Radio();
        assertEquals(10, radio.getNumberOfStations());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testConstructorWithParameters() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getNumberOfStations());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCurrentStationWithInvalidStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCurrentStationWithStationNumberGreaterThanNumberOfStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
    }

    @Test
    public void testSetCurrentStationWithValidStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testIncreaseVolumeBeyondMaximum() {
        Radio radio = new Radio();
        for (int i = 0; i < 101; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolumeBeyondMinimum() {
        Radio radio = new Radio();
        for (int i = 0; i < 101; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testNextStationAtLastStation() {
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
    public void testPrevStationAtFirstStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
}