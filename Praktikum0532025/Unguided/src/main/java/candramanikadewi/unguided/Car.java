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
    private Speedometer speedometer;
    private String model;

    public Car(String model, Engine engine, Transmission transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.speedometer = new Speedometer(); // Inisialisasi speedometer
    }

    public void startCar() {
        System.out.println(model + " is starting...");
        engine.start();
    }

    public void drive(int gear, int speed) {
        System.out.println(model + " is driving...");
        transmission.shiftGear(gear);
        speedometer.setSpeed(speed); // Atur kecepatan mobil
    }

    public void stopCar() {
        speedometer.setSpeed(0); // Set kecepatan ke 0 saat berhenti
        engine.stop();
        System.out.println(model + " has stopped.");
    }
}

