/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.validadorcorrelativas;

import Alumno.Alumno;
import inscripciones.Inscripcion;
import java.util.ArrayList;
import java.util.Collection;
import materias.Materia;

/**
 *
 * @author Diego
 */
public class ValidadorCorrelativas {

    public static void main(String[] args) {

        Materia materia1 = new Materia("Razonamiento");
        Materia materia2 = new Materia("Resolucion");
        Materia materia3 = new Materia("Matematica");

        Collection<Materia> materias = new ArrayList<>();
        materias.add(materia1);
        materias.add(materia2);
        materias.add(materia3);

        materia3.correlativas.add(materia2);
        materia2.correlativas.add(materia1);

        Alumno alumno1 = new Alumno("Angelo", "123");
        Alumno alumno2 = new Alumno("Charlie", "456");
        Alumno alumno3 = new Alumno("Karina", "789");

        alumno1.materiasAprobadas.add(materia2);
        alumno2.materiasAprobadas.add(materia1);

        Collection<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        Inscripcion nueva = new Inscripcion(alumno1, materia3);
        Inscripcion nueva1 = new Inscripcion(alumno2, materia3);

        System.out.println(nueva.validarInscripcion());
        System.out.println(nueva1.validarInscripcion());
    }
}
