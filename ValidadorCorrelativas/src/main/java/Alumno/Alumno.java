/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

import java.util.List;
import materias.Materia;

/**
 *
 * @author Diego
 */
public class Alumno {
    String nombres;
    String legajo;
   public List<Materia> materiasAprobadas;

    public Alumno() {
    }

    public Alumno(String nombres, String legajo, List<Materia> materiasAprobadas) {
        this.nombres = nombres;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", legajo=" + legajo + ", materiasAprobadas=" + materiasAprobadas + '}';
    }
    
    }
