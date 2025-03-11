/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package candramanikadewi.unguided;

/**
 *
 * @author REDMI
 */
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", 400);
        Transmission transmission = new Transmission("Automatic");
        Car myCar = new Car("Ford Mustang", engine, transmission);

        myCar.startCar();
        myCar.drive(3, 60); // Ganti ke gigi 3, kecepatan 60 km/h
        myCar.drive(4, 90); // Ganti ke gigi 4, kecepatan 90 km/h
        myCar.stopCar();
    }
}

