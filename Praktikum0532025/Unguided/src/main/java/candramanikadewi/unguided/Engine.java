/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candramanikadewi.unguided;

/**
 *
 * @author REDMI
 */
public class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine started: " + type + " with " + horsepower + " HP.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}
