/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.Vista;

/**
 *
 * @author brann
 */
import com.mycompany.clinicaveterinaria.Modelo.Consulta;
import com.mycompany.clinicaveterinaria.Modelo.Mascota;
import com.mycompany.clinicaveterinaria.Modelo.Medicamento;
import com.mycompany.clinicaveterinaria.Modelo.Propietario;

import java.util.List;

public class VeterinariaVista {

    public void mostrarPropietariosConMascotas(List<Propietario> propietarios) {
        System.out.println("--- Propietarios y sus mascotas ---");
        for (Propietario p : propietarios) {
            System.out.println(p.getNombre() + ":");
            for (Mascota m : p.getMascotas()) {
                System.out.println("  - " + m.getNombre() + " (" + m.getEspecie() + ")");
            }
        }
        System.out.println();
    }

    public void mostrarConsultas(List<Consulta> consultas) {
        System.out.println("--- Consultas realizadas ---");
        for (Consulta c : consultas) {
            System.out.println("Consulta #" + c.getIdConsulta()
                    + " - Mascota: " + c.getMascota().getNombre()
                    + " - Veterinario: " + c.getVeterinario().getNombre());
        }
        System.out.println();
    }

    public void mostrarMedicamentosRecetados(List<Consulta> consultas) {
        System.out.println("--- Medicamentos recetados ---");
        for (Consulta c : consultas) {
            for (Medicamento m : c.getMedicamentos()) {
                System.out.println(c.getMascota().getNombre() + " -> " + m.getNombre());
            }
        }
        System.out.println();
    }
}