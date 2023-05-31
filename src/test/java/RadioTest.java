import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio condStation = new Radio(10);
    Radio condVolume = new Radio(0, 100);

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
    public void VolumeMinimum() {

        condVolume.setCurrentVolume(-1);
        condVolume.small();

        int expected = 0;
        int actual = condVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMin() {

        condVolume.setCurrentVolume(0);
        condVolume.small();

        int expected = 0;
        int actual = condVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void VolumeNorm() {

        condVolume.setCurrentVolume(50);
        condVolume.big();

        int expected = 51;
        int actual = condVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeNorma() {

        condVolume.setCurrentVolume(50);
        condVolume.small();

        int expected = 49;
        int actual = condVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMax() {

        condVolume.setCurrentVolume(100);
        condVolume.big();

        int expected = 100;
        int actual = condVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMaximum() {

        condVolume.setCurrentVolume(101);
        condVolume.big();

        int expected = 100;
        int actual = condVolume.getCurrentVolume();
        
        Assertions.assertEquals(expected, actual);
    }
}