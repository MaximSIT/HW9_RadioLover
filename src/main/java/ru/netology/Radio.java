package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int minRadioStationNumber;
    private int maxRadioStationNumber = minRadioStationNumber + 9;
    private int currentRadioStationNumber = minRadioStationNumber;

    public Radio(int numberOfStations) {
        if (numberOfStations <= 0) {
            return;
        } else {
            maxRadioStationNumber = minRadioStationNumber + numberOfStations - 1;
        }
    }

//    public Radio() {
//    }

//    public int getMaxRadioStationNumber() {
//
//        return maxRadioStationNumber;
//    }

//    public int getCurrentRadioStationNumber() {
//
//        return currentRadioStationNumber;
//    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber--;
        }
    }

    protected int volumeLevel;

//    public int getVolumeLevel() {
//        return volumeLevel;
//    }

    public void setVolumeLevel(int newVolumeLevel) {
        if ((newVolumeLevel < 0) || (newVolumeLevel > 100)) {
            return;
        } else {
            volumeLevel = newVolumeLevel;
        }
    }

    public void plusVolume() {
        if (volumeLevel == 100) {
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