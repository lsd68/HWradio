public class Radio {
    public int currentNumber;
    public int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            currentNumber = 9;
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setNextNumber() {
        if (currentNumber > 9) {
            currentNumber = 0;
        } else {
            currentNumber = currentNumber + 1;
        }

    }

    public void setPrevNumber() {
        if (currentNumber < 0) {
            currentNumber = 9;
        } else {
            currentNumber = currentNumber - 1;
        }

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

    public void setIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}