import org.example.Radio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio device = new Radio(10);

    @Test
    void shouldChangeStation() {
        device.setCurrentStation(5);
        assertEquals(5, device.getCurrentStation());
    }

    @Test
    void shouldSetStationUnderMinStation() {
        device.setCurrentStation(-1);
        assertEquals(9, device.getCurrentStation());
    }

    @Test
    void shouldSetStationOverMaxStation() {
        device.setCurrentStation(10);
        assertEquals(0, device.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        device.setCurrentStation(6);
        device.nextStation();
        assertEquals(7, device.getCurrentStation());
    }

    @Test
    void shouldMaxStation() {
        device.setCurrentStation(9);
        device.nextStation();
        assertEquals(0, device.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation() {
        device.setCurrentStation(10);
        device.nextStation();
        assertEquals(1, device.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        device.setCurrentStation(4);
        device.previousStation();
        assertEquals(3, device.getCurrentStation());
    }

    @Test
    void shouldMinStation() {
        device.setCurrentStation(0);
        device.previousStation();
        assertEquals(9, device.getCurrentStation());
    }


    @Test
    void shouldChangeVolume() {
        assertEquals(0, device.getCurrentVolume());
        device.setCurrentVolume(5);
        assertEquals(5, device.getCurrentVolume());
    }
    @Test
    void shouldOverMaxVolume() {
        device.setCurrentVolume(101);
        assertEquals(100, device.getMaxVolume());
    }

    @Test
    void shouldSetStationUnderMinVolume() {
        device.setCurrentVolume(-1);
        assertEquals(0, device.getCurrentVolume());
    }

    @Test
    void shouldPressVolumeUp(){
        device.setCurrentVolume(10);
        device.pressVolumeUp();
        assertEquals(11, device.getCurrentVolume());
    }

    @Test
    void shouldPressVolumeDown(){
        device.setCurrentVolume(20);
        device.pressVolumeDown();
        assertEquals(19, device.getCurrentVolume());
    }


        /*@Test
    void shouldIncreaseVolume() {
        device.setCurrentVolume(9);
        device.increaseVolume();
        assertEquals(10, device.getCurrentVolume());
    }

    @Test
    void shouldMaxVolume() {
        device.setCurrentVolume(100);
        device.increaseVolume();
        assertEquals(100, device.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume() {
        device.setCurrentVolume(101);
        device.increaseVolume();
        assertEquals(1, device.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        device.setCurrentVolume(6);
        device.decreaseVolume();
        assertEquals(5, device.getCurrentVolume());
    }

    @Test
    void shouldMinVolume() {
        device.setCurrentVolume(0);
        device.decreaseVolume();
        assertEquals(0, device.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume() {
        device.setCurrentVolume(-1);
        device.decreaseVolume();
        assertEquals(0, device.getCurrentVolume());
    }
*/
}