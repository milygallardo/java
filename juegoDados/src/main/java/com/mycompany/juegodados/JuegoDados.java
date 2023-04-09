/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.juegodados;

import com.mycompany.juegodados.juego.Puntaje;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class JuegoDados {

    public static void main(String[] args) {
        juegoDados();
    }

    public static int tirarDado() {
        int dado = 0;
        dado = (int) (Math.random() * 6 + 1);
        return dado;
    }

    public static void juegoDados() {
        Scanner sc = new Scanner(System.in);
        boolean cond = false;
        int jugadorPuntos = 0;
        int maquinaPuntos = 0;
        Puntaje puntos = new Puntaje(jugadorPuntos, maquinaPuntos);

        System.out.println("¿Quiere jugar?");
        int input = sc.nextInt();
        System.out.println("1 - jugar");
        System.out.println("2 - salir");
        switch (input) {
            case 1:
                puntos.setmaquinaPuntos(tirarDado());
                puntos.setjugadorPuntos(tirarDado());
                System.out.println("La maquina tiene " + puntos.getjugadorPuntos());
                System.out.println("Vos tenes " + puntos.getmaquinaPuntos());

                do {
                    System.out.println("¿Queres tirar de nuevo");
                    System.out.println("1 - SI");
                    System.out.println(" 2 - NO");
                    input = sc.nextInt();
                    switch (input) {
                        case 1:
                            puntos.setjugadorPuntos(puntos.getjugadorPuntos() + tirarDado());
                            System.out.println("Su puntaje ahora es de: " + puntos.getjugadorPuntos());
                            break;
                        case 2:
                            cond = false;
                            break;
                        default:
                            throw new AssertionError();
                    }
                } while (cond = true);

                break;
            case 2:

                break;
            default:
                throw new AssertionError();
        }

        int dado = (int) (Math.random() * 6 + 1); // si le pongo solo 6, va a leer este conjunto: [0;5].
        System.out.println(dado);

        if (dado == 6) {
            System.out.println("Ganaste");
        }
    }
}
