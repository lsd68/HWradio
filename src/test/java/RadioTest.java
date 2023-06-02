import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio condStation = new Radio(10);

    @Test
    public void StationMinimum() {

        condStation.setStationNumber(-1);

        int expected = 0;
        int actual = condStation.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationMin() {

        condStation.setStationNumber(1);
        condStation.prev();

        int expected = 0;
        int actual = condStation.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationMax() {

        condStation.setStationNumber(8);
        condStation.next();

        int expected = 9;
        int actual = condStation.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationMaximum() {

        condStation.setStationNumber(10);

        int expected = 0;
        int actual = condStation.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNext() {

        condStation.setStationNumber(5);
        condStation.next();

        int expected = 6;
        int actual = condStation.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNextMaximum() {

        condStation.setStationNumber(9);
        condStation.next();

        int expected = 0;
        int actual = condStation.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPrev() {

        condStation.setStationNumber(5);
        condStation.prev();

        int expected = 4;
        int actual = condStation.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPrevMinimum() {

        condStation.setStationNumber(0);
        condStation.prev();

        int expected = 9;
        int actual = condStation.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 11;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReduceVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(20);
        rad.reduceVolume();

        int expected = 19;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReduceVolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}