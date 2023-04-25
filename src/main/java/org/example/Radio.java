package org.example;

public class Radio {
    private int currentStation = 10;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;

    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio() {
    }

    public Radio(int currentStation) {
        this.currentStation = currentStation;
        maxStation = currentStation - 1;
    }



    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }

        // currentStation = newCurrentStation;
        this.currentStation = currentStation;
    }


    public void nextStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void previousStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }

    public void pressVolumeUp() {
        setCurrentVolume(currentVolume + 1);

    }

    public void pressVolumeDown() {
        setCurrentVolume(currentVolume - 1);
    }


/*


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
*/

}