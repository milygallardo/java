/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inscripciones;

import Alumno.Alumno;
import java.util.Date;
import materias.Materia;

/**
 *
 * @author Diego
 */
public class Inscripcion {

    Alumno alumno;
    Materia materia;
    Date fecha = new Date();

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean validarInscripcion() {
        boolean aprobada = true;
        if (alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas())) {
            System.out.println(alumno + "puede inscribirse");
        } else {
            System.out.println(alumno + " no poseee las correlativas necesarias para inscribirse");
            aprobada = false;
        }
        return aprobada;
    }
}
