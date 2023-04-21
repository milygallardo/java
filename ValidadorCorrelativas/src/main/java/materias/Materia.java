/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias;

import java.util.List;

/**
 *
 * @author Diego
 */
public class Materia {
    String nombre;
    public List<Materia> correlativas;
    boolean puedeCursar;

    public Materia() {
    }

    public Materia(String nombre, List<Materia> correlativas, boolean puedeCursar) {
        this.nombre = nombre;
        this.correlativas = correlativas;
        this.puedeCursar = puedeCursar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean isPuedeCursar() {
        return puedeCursar;
    }

    public void setPuedeCursar(boolean puedeCursar) {
        this.puedeCursar = puedeCursar;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", correlativas=" + correlativas + ", puedeCursar=" + puedeCursar + '}';
    }
    
    
    
}
