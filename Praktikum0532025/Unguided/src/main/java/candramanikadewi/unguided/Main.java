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
        myCar.drive(3);
        myCar.stopCar();
    }
}
