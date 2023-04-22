/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.validadorcorrelativas;

import Alumno.Alumno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import materias.Materia;

/**
 *
 * @author Diego
 */
public class ValidadorCorrelativas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Materia materia1 = new Materia();
        materia1.setNombre("Razonamiento");
        materia1.setPuedeCursar(true);

        Materia materia2 = new Materia();
        materia2.setNombre("MatematicaI");

        List<Materia> correlativasMateI = new ArrayList<>();
        correlativasMateI.add(materia1);
        materia2.setCorrelativas(correlativasMateI);

        Materia materia3 = new Materia();
        materia3.setNombre("MatematicaIII");

        List<Materia> correlativasMateII = new ArrayList<>();
        correlativasMateII.add(materia1);
        correlativasMateII.add(materia2);
        materia3.setCorrelativas(correlativasMateII);

        Collection<Materia> materias = new ArrayList<>();
        materias.add(materia1);
        materias.add(materia2);
        materias.add(materia3);

        List<Materia> materiasJose = new ArrayList<>();
        materiasJose.add(materia1);

        List<Materia> materiasRomina = new ArrayList<>();
        materiasRomina.add(materia1);
        materiasRomina.add(materia2);

        List<Materia> materiasAngelo = new ArrayList<>();
        materiasAngelo.add(materia1);
        materiasAngelo.add(materia2);
        materiasAngelo.add(materia3);

        Alumno alumno1 = new Alumno("Jose Luis", "123", materiasJose);
        Alumno alumno2 = new Alumno("Romina Isabel", "456", materiasRomina);
        Alumno alumno3 = new Alumno("Angelo Sergio", "789", materiasAngelo);

        Collection<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        boolean condMateI = true;
        if (alumno1.materiasAprobadas.contains(materia1) || alumno2.materiasAprobadas.contains(materia1) || alumno3.materiasAprobadas.contains(materia1)) {
            materia2.setPuedeCursar(condMateI);
        }

        boolean condMateII = true;
        if (alumno1.materiasAprobadas.contains(materia2) || alumno2.materiasAprobadas.contains(materia2) || alumno3.materiasAprobadas.contains(materia2)) {
            materia3.setPuedeCursar(condMateII);
        }
        
            
    }

    static String inscripcionAprobada() {
        return "Incripcion aprobada";
    }

    static String inscripcionNoAprobada() {
        return "No se cumplen requisitos para la inscripcion";
    }
}
