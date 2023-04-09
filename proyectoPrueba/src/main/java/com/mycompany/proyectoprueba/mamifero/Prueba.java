/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprueba.mamifero;

import java.util.List;

/**
 *
 * @author Diego
 */
public class Prueba {
 private List<Canino> perro;
 String nombre; 
 boolean condicion; 
 int valor;

    public Prueba() {
    }

    public Prueba(List<Canino> perro, String nombre, boolean condicion, int valor) {
        this.perro = perro;
        this.nombre = nombre;
        this.condicion = condicion;
        this.valor = valor;
    }

    public List<Canino> getPerro() {
        return perro;
    }

    public void setPerro(List<Canino> perro) {
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
 
 
}
