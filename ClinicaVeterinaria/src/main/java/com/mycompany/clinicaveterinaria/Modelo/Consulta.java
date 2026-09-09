/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brann
 */
public class Consulta {

    private int idConsulta;
    private String fecha;
    protected String motivo;
    private Mascota mascota;
    private Veterinario veterinario;

    // Composición: la lista de medicamentos vive y muere con la Consulta
    private final List<Medicamento> medicamentos;

    public Consulta(int idConsulta, String fecha, String motivo, Mascota mascota, Veterinario veterinario) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.medicamentos = new ArrayList<>(); // se crea internamente, no se recibe desde afuera
    }

    // Getters y setters
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    // Método clave de la composición: la Consulta es quien crea sus propios Medicamento
    public void agregarMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }
}