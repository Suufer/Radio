public class Radio {
    private int stationCount;
    private int currentStation;
    private int volume;

    public Radio() {
        this.stationCount = 10;
        this.currentStation = 0;
        this.volume = 0;
    }

    public Radio(int stationCount) {
        this.stationCount = stationCount;
        this.currentStation = 0;
        this.volume = 0;
    }

    public int getStationCount() {
        return stationCount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation >= stationCount) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void nextStation() {
        currentStation = (currentStation + 1) % stationCount;
    }

    public void prevStation() {
        currentStation = (currentStation - 1 + stationCount) % stationCount;
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

