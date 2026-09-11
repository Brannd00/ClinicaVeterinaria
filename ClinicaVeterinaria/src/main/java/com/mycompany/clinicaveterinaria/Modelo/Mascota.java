/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Modelo;

/**
 *
 * @author brann
 */
public class Mascota extends Animal {

    private String raza;
    private String numeroChip;
    protected Propietario propietario;

    public Mascota(String nombre, String especie, int edad, String colorPelaje,
                    String raza, String numeroChip, Propietario propietario) {
        super(nombre, especie, edad, colorPelaje);
        this.raza = raza;
        this.numeroChip = numeroChip;
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(String numeroChip) {
        this.numeroChip = numeroChip;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String describir() {
        return super.describir() + ", raza " + raza;
    }
}
