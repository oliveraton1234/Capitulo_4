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
public class Billing {
    public Double computeBill(int x){
        return ((x*.08) + x);
    }

    public Double computeBill(int x, int y){
        return (((x * y)*.08) + (x*y));
    }

    public double computeBill(int x, int y, int z){
        return (((x*y)*(z/100))+((x*y)*.08) + (x*y));
    }
}
