/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Admin
 */
public class MainBilling {

    public static void main(String[] args) {
        Billing libro = new Billing();

        System.out.println(libro.computeBill(10));
        System.out.println(libro.computeBill(10,2));
        System.out.println(libro.computeBill(10,2,50));
    }
}
