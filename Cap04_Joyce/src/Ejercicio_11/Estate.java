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
public class Estate {
    private String nombre;
    private Integer poblacion;
    private City capital;
    private City masPoblada;

    public Estate(String nombre,int poblacion, String cap, int poCap, String mP, int poMP ){
        this.nombre = nombre;
        this.poblacion = poblacion;
        capital = new City(cap,poCap);
        masPoblada = new City(mP,poMP);
    }

    public String getNombreMasPoblada(){
        return masPoblada.getCapital();
    }

    public Integer getHabitantesMasPoblada(){
        return masPoblada.getHabitantes();
    }

    public String getNombreCapital(){
        return capital.getCapital();
    }

    public Integer getHabitantesCapital(){
        return capital.getHabitantes();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }
}
