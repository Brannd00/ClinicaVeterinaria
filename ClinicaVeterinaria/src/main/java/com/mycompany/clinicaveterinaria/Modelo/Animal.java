/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public abstract class Animal {

    private String nombre;
    protected String especie;
    int edad;              
    public String colorPelaje;

    
    public Animal(String nombre, String especie, int edad, String colorPelaje) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.colorPelaje = colorPelaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String describir() {
        return nombre + " (" + especie + "), " + edad + " años, pelaje " + colorPelaje;
    }
}