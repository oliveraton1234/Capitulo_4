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
public class TestBread {

   public static void main(String[] args) {
        Bread bimbo = new Bread("Blanco",125.2);
        System.out.println(Bread.MOTTO);
        System.out.println(bimbo.getPan());
        System.out.println(bimbo.getCalorias());
    }
    }
}
