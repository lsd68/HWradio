public class Radio {
    private int numberStations = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentNumber;
    private int currentVolume;

    public Radio(int numberStations) {
        this.numberStations = numberStations;
        this.maxStation = numberStations - 1;

    }

    public Radio() {

    }


    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < minStation) {
            return;
        }
        if (newCurrentStationNumber > maxStation) {
            return;
        }
        currentNumber = newCurrentStationNumber;
    }

    public void prev() {
        if (currentNumber > minStation) {
            currentNumber = currentNumber - 1;
            return;
        }
        currentNumber = maxStation;
    }


    public void next() {
        if (currentNumber < maxStation) {
            currentNumber = currentNumber + 1;
            return;
        }
        currentNumber = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
    }
}