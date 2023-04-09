/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprueba.mamifero;

/**
 *
 * @author Diego
 */
public class Canino extends Mamifero{
    String nombre;
    String color;

    public Canino(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Canino(String nombre, String color, String dieta) {
        super(dieta);
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getDieta() {
        return dieta;
    }

    @Override
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "Canino{" + "nombre=" + nombre + ", color=" + color + " , dieta= " + dieta + '}';
    }
    
    @Override
    public void accionMamifera(){
        System.out.println("Woof!");
    }
} 
