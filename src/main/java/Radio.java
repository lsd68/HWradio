public class Radio {
    private int numberStations = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentNumber;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int numberStations) {
        this.numberStations = numberStations;
        this.maxStation = numberStations - 1;
    }

    public Radio(int minVolume, int maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = 100;
        } else {
            currentVolume = newCurrentVolume;
        }
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

    public void big() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void small() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
            return;
        } else {
            currentVolume = minVolume;
        }
    }
}