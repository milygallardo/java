/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprueba.mamifero;

/**
 *
 * @author Diego
 */
public class PruebaInterface implements Interface{
    @Override
    public Canino crearCanino(){
        String nombre = "Obi";
        String color = "Negro";
        String dieta = "Omnivoro";
        
        return new Canino(nombre, color, dieta);
    }
}
    