/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author Admin
 */
public class TestBlood {

   public static void main(String[] args) {
        BloodData persona = new BloodData();
        System.out.println(persona.getTipoDeSangre());
        System.out.println(persona.getFactor());

        persona.setTipoDeSangre("O");
        persona.setFactor('-');

        System.out.println(persona.getTipoDeSangre());
        System.out.println(persona.getFactor());
    }
}
