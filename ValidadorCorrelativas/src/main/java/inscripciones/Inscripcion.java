/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inscripciones;

import Alumno.Alumno;
import java.time.LocalDate;
import materias.Materia;

/**
 *
 * @author Diego
 */
public class Inscripcion {
    Alumno alumno;
    Materia materia;
    LocalDate fecha;
    boolean aprobada;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, LocalDate fecha, boolean aprobada) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = fecha;
        this.aprobada = aprobada;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "alumno=" + alumno + ", materia=" + materia + ", fecha=" + fecha + ", aprobada=" + aprobada + '}';
    }
    
    
    
}
