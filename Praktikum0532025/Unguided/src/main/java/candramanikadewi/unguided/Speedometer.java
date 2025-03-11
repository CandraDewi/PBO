/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candramanikadewi.unguided;

/**
 *
 * @author REDMI
 */
public class Speedometer {
    private int speed;

    public Speedometer() {
        this.speed = 0; // Awal kecepatan 0
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Speed cannot be negative.");
            return;
        }
        this.speed = speed;
        System.out.println("Speed now is: " + this.speed + " km/h");
    }

    public int getSpeed() {
        return speed;
    }
}

