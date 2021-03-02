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
public class Sandwich {
    
    private Bread pan;
    private SandwichFilling relleno;

    public Sandwich(Bread pan, SandwichFilling relleno) {
        this.pan = pan;
        this.relleno = relleno;
    }

    public void getPan() {
        System.out.println(pan.getPan());
    }

    public void setPan(Bread pan) {
        this.pan = pan;
    }
}
