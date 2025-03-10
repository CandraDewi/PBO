/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candramanikadewi.unguided;

/**
 *
 * @author REDMI
 */
public class Car {
    private Engine engine;
    private Transmission transmission;
    private String model;

    public Car(String model, Engine engine, Transmission transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    public void startCar() {
        System.out.println(model + " is starting...");
        engine.start();
    }

    public void drive(int gear) {
        System.out.println(model + " is driving...");
        transmission.shiftGear(gear);
    }

    public void stopCar() {
        System.out.println(model + " has stopped.");
        engine.stop();
    }
}
