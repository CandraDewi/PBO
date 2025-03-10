/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candramanikadewi.unguided;

/**
 *
 * @author REDMI
 */
public class Transmission {
    private String type;

    public Transmission(String type) {
        this.type = type;
    }

    public void shiftGear(int gear) {
        System.out.println("Transmission shifted to gear " + gear);
    }
}
