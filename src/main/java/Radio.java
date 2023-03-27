public class Radio {
    private int numberOfStations;
    private int currentStation;
    private int volume;

    public Radio() {
        this.numberOfStations = 10;
        this.currentStation = 0;
        this.volume = 0;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.currentStation = 0;
        this.volume = 0;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int stationNumber) {
        if (stationNumber < 0 || stationNumber >= numberOfStations) {
            throw new IllegalArgumentException("Station number should be within 0 and " + (numberOfStations - 1));
        }
        this.currentStation = stationNumber;
    }

    public int getVolume() {
        return volume;
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

    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

}