/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GZ_2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FiveDice {
    private ArrayList<Die> dados = new ArrayList<>();
    private Integer grande;
    private Integer repetidos;

    public FiveDice(){
        for (int i = 0; i < 5 ; i++) {
            this.dados.add(new Die());
        }

    }

    public Integer getGrande() {
        return grande;
    }

    public void setGrande(Integer grande) {
        this.grande = grande;
    }

    public Integer getRepetidos() {
        return repetidos;
    }

    public void setRepetidos(Integer repetidos) {
        this.repetidos = repetidos;
    }
}
