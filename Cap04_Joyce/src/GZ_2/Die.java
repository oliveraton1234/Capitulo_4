/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GZ_2;

/**
 *
 * @author Admin
 */
public class Die {
     private Integer numero;

    public Die() {
        this.lanzar();
    }

    public void lanzar(){
        this.numero = (int)(Math.random() * 6 + 1);
    }

    public Integer getValor() {
        return numero;
    }
}
