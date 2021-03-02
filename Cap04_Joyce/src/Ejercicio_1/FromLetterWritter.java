/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author Admin
 */
public class FromLetterWritter {
    public void displaySalutation(String name){
        System.out.println("Sr o Sra. "+ name);
        System.out.println("Gracias por el pedido");
    }

    public void displaySalutation(String x, String y){
        System.out.println("Sr o Sra. " + x + " " + y );
        System.out.println("Gracias por el pedido");
    }
}
