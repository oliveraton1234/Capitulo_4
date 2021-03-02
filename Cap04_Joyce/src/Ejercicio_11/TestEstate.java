/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_11;

/**
 *
 * @author Admin
 */
public class TestEstate {

   public static void main(String[] args) {
        Estate oaxaca = new Estate("Oaxaca",800,"Oaxaca de juarez",150,"Candiani",263);

        System.out.println(oaxaca.getNombre());
        System.out.println(oaxaca.getPoblacion());

        System.out.println(oaxaca.getNombreCapital());
        System.out.println(oaxaca.getHabitantesCapital());

        System.out.println(oaxaca.getNombreMasPoblada());
        System.out.println(oaxaca.getHabitantesMasPoblada());


    }
    
}
