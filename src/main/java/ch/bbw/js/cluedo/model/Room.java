package ch.bbw.js.cluedo.model;

public class Room {
    private int surface;
    private int numberOfDoors;
    private int numberOfWindows;
    private String wallColor;

    public Room(int surface, int numberOfDoors, int numberOfWindows, String wallColor) {
        this.surface = surface;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.wallColor = wallColor;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }
}
