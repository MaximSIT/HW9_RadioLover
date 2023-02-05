package ru.netology;

public class Radio {
    private int currentRadioStationNumber;
    protected int volumeLevel;

    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber--;
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if ((newVolumeLevel < 0) || (newVolumeLevel > 10)) {
            return;
        } else {
            volumeLevel = newVolumeLevel;
        }
    }

    public void plusVolume() {
        if (volumeLevel == 10) {
            getVolumeLevel();
        } else {
            volumeLevel++;
        }
    }

    public void minusVolume() {
        if (volumeLevel == 0) {
            getVolumeLevel();
        } else {
            volumeLevel--;
        }
    }
}