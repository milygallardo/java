/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Materia {

    String nombre;
    public ArrayList<String> correlativas = new ArrayList<>();

    public Materia() {
    }

    public Materia(String nombre) {
        this.nombre = nombre;
            }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<String> correlativas) {
        this.correlativas = correlativas;
    }


}
