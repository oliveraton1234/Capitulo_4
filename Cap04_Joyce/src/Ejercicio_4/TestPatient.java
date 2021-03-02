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
public class TestPatient {
    public static void main(String[] args) {
        Patiente admin = new Patiente();

        admin.getSangre();
        System.out.println(admin.getEdad());

        Patiente esteban = new Patiente(123,45,"A",'-');
        esteban.getSangre();
        System.out.println(esteban.getId());
    System.out.println(esteban.getEdad());
    }
    
}
