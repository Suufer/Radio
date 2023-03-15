public class Radio {
    private final int MIN_STATION = 0;
    private int maxStation;
    private int currentStation;
    private int volume;

    public Radio() {
        this.maxStation = 10;
        this.currentStation = 0;
        this.volume = 0;
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
        this.currentStation = 0;
        this.volume = 0;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= MIN_STATION && currentStation < maxStation) {
            this.currentStation = currentStation;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void nextStation() {
        currentStation = (currentStation + 1) % maxStation;
    }

    public void prevStation() {
        currentStation = currentStation == 0 ? maxStation - 1 : currentStation - 1;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
