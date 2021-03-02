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
public class City {
    private String capital;
    private Integer habitantes;

    public City(String capital, int habitantes){
        this.capital = capital;
        this.habitantes = habitantes;
    }

    public String getCapital() {
        return capital;
    }

    public Integer getHabitantes() {
        return habitantes;
    }
}
