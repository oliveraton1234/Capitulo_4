/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

/**
 *
 * @author Admin
 */
public class TeastSandwich {

    public static void main(String[] args) {

        Bread bolillo = new Bread("Bolillo",132.3);
        SandwichFilling quesillo = new SandwichFilling("Quesillo",32.1);
        Sandwich chanwich = new Sandwich(bolillo,quesillo);

        chanwich.getPan();
        bolillo.setPan("Bimbo");
        chanwich.getPan();

    }
    
}
