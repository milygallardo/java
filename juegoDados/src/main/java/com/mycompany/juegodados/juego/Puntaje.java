/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegodados.juego;

/**
 *
 * @author Diego
 */
public class Puntaje {
    int jugadorPuntos;
    int maquinaPuntos;

    public Puntaje() {
    }

    public Puntaje(int jugadorPuntos, int maquinaPuntos) {
        this.jugadorPuntos = jugadorPuntos;
        this.maquinaPuntos = maquinaPuntos;
    }

    public int getJugadorPuntos() {
        return jugadorPuntos;
    }

    public void setJugadorPuntos(int jugadorPuntos) {
        this.jugadorPuntos = jugadorPuntos;
    }

    public int getMaquinaPuntos() {
        return maquinaPuntos;
    }

    public void setMaquinaPuntos(int maquinaPuntos) {
        this.maquinaPuntos = maquinaPuntos;
    }

    @Override
    public String toString() {
        return "Puntaje{" + "jugadorPuntos=" + jugadorPuntos + ", maquinaPuntos=" + maquinaPuntos + '}';
    }

    void setmaquinaPuntos(int tirarDado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setjugadorPuntos(int tirarDado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getjugadorPuntos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getmaquinaPuntos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
