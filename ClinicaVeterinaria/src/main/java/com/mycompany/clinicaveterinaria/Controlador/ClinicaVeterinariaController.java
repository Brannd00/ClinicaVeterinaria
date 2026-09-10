/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Controlador;

/**
 *
 * @author brann
 */
import com.mycompany.clinicaveterinaria.Modelo.Consulta;
import com.mycompany.clinicaveterinaria.Modelo.Medicamento;
import com.mycompany.clinicaveterinaria.Modelo.Propietario;
import com.mycompany.clinicaveterinaria.Modelo.Mascota;
import com.mycompany.clinicaveterinaria.Modelo.Veterinario;
import com.mycompany.clinicaveterinaria.Vista.VeterinariaVista;

import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinariaController {

    private final VeterinariaVista vista;

    private final List<Propietario> propietarios;
    private final List<Veterinario> veterinarios;
    private final List<Consulta> consultas;

    public ClinicaVeterinariaController() {
        this.vista = new VeterinariaVista();
        this.propietarios = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void iniciar() {
        crearDatosDePrueba();
        mostrarResultados();
    }

    private void crearDatosDePrueba() {
        Propietario p1 = new Propietario("Carlos Gomez", "1001234567", "3001112233");
        Mascota m1 = new Mascota("Rocky", "Perro", 3, "Cafe", "Labrador", "CHIP001", p1);
        Mascota m2 = new Mascota("Michi", "Gato", 2, "Negro", "Común Europeo", "CHIP002", p1);
        p1.agregarMascota(m1);
        p1.agregarMascota(m2);

        Propietario p2 = new Propietario("Laura Perez", "1009876543", "3009998877");
        Mascota m3 = new Mascota("Toby", "Perro", 5, "Blanco", "Bulldog", "CHIP003", p2);
        p2.agregarMascota(m3);

        propietarios.add(p1);
        propietarios.add(p2);

        Veterinario v1 = new Veterinario("Dra. Ana Perez", "LIC-001", "Medicina General");
        Veterinario v2 = new Veterinario("Dr. Luis Torres", "LIC-002", "Cirugia");
        veterinarios.add(v1);
        veterinarios.add(v2);

        Medicamento med1 = new Medicamento("Amoxicilinaa", "250mg cada 12h", "Antibiotico", 15000);
        Medicamento med2 = new Medicamento("Meloxicam", "0.1mg/kg cada 24h", "Antinflamatorio", 12000);
        Medicamento med3 = new Medicamento("Ivermectina", "1 dosis única", "Antiparasitario", 8000);

        Consulta c1 = new Consulta(1, "2025-06-01", "Control general", m1, v1);
        Consulta c2 = new Consulta(2, "2025-06-02", "Vacunacion y desparasitacion", m3, v2);
        Consulta c3 = new Consulta(3, "2025-06-03", "Revision por vomito", m2, v1);

        v1.asociarConsulta(c1);
        v2.asociarConsulta(c2);
        v1.asociarConsulta(c3);

        v1.recetar(c1, med1);
        v1.recetar(c1, med2);
        v2.recetar(c2, med3);
        v1.recetar(c3, med2);

        consultas.add(c1);
        consultas.add(c2);
        consultas.add(c3);
    }

    private void mostrarResultados() {
        vista.mostrarPropietariosConMascotas(propietarios);
        vista.mostrarConsultas(consultas);
        vista.mostrarMedicamentosRecetados(consultas);
    }
}
