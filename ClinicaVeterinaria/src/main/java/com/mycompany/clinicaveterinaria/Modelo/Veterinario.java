/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Modelo;

/**
 *
 * @author brann
 */
import java.util.ArrayList;
import java.util.List;

public class Veterinario {

    private String nombre;
    private String licenciaProfesional;
    protected String especialidad;

    
    private List<Consulta> consultas;

    public Veterinario(String nombre, String licenciaProfesional, String especialidad) {
        this.nombre = nombre;
        this.licenciaProfesional = licenciaProfesional;
        this.especialidad = especialidad;
        this.consultas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicenciaProfesional() {
        return licenciaProfesional;
    }

    public void setLicenciaProfesional(String licenciaProfesional) {
        this.licenciaProfesional = licenciaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void asociarConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }

    
    public void recetar(Consulta consulta, Medicamento medicamento) {
        consulta.agregarMedicamento(medicamento);
    }
}