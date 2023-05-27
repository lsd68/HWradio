import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextRadio() {
        Radio rad = new Radio();

        rad.setCurrentNumber(10);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadio() {
        Radio rad = new Radio();

        rad.setCurrentNumber(-1);

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxRadio() {
        Radio rad = new Radio();

        rad.setCurrentNumber(9);

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinRadio() {
        Radio rad = new Radio();

        rad.setCurrentNumber(0);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void CurrentVolumeMax() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void CurrentVolumeMin() {

        Radio vol = new Radio();

        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void IncreaseCurrentVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(100);
        vol.setIncreaseVolume();


        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void DecreaseCurrentVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(0);
        vol.setDecreaseVolume();


        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}