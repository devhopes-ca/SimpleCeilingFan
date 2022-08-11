package com.example.simpleceilingfan;

/**
 * August 10, 2022
 * @author lizg
 */

public class CeilingFan {

    /*
        Speeds:
         0 -> Off, 1 -> Slow, 2 -> Medium, 3 -> High
    */
    private int speed = 0;
    private String rotation = "Clockwise";

    // constructor ...

    public CeilingFan(int speed, String rotation) {
        this.speed = speed;
        this.rotation = rotation;
    }

    // Getters & Setters ...

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    /*
        Increases speed of fan when pulling down on Fan Cord 1 from
        Slow (1) -> Medium (2) -> High (3) -> Off (0) ...
    */

    public void increaseSpeed() {
        if (this.speed == 3) {
            this.speed = 0;
        } else {
            this.speed++;
        }
    }

    /*
        Reverses rotation of fan when pulling down on Fan Cord 2 from
        Clockwise to Counter-Clockwise  ...
    */
    public void reverseDirection() {
        if (this.rotation.equals("Clockwise")) {
            this.rotation = "Counter-Clockwise";
        } else {
            this.rotation = "Clockwise";
        }
    }

    /*
        toString() ...
    */
    @Override
    public String toString(){
        return "Speed: " + this.speed + '\t'+"Fan Rotation: " +this.rotation;
    }
}
