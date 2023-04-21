/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoprueba;

import com.mycompany.proyectoprueba.claseperro.Perro;
import com.mycompany.proyectoprueba.mamifero.Canino;
import com.mycompany.proyectoprueba.mamifero.Interface;
import com.mycompany.proyectoprueba.mamifero.Mamifero;
import com.mycompany.proyectoprueba.mamifero.Prueba;
import com.mycompany.proyectoprueba.mamifero.PruebaInterface;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ProyectoPrueba {

    private static Interface it = new PruebaInterface();

    public static void main(String[] args) throws IOException {
//        System.out.println("Hello World!\t\"Charly\"\nObi");
//    }//\" puedo poner comillas dentro del string
//    // \n pone enter dentro del string
//    // \t pone tabulación dentro del string  

        System.out.println(it.crearCanino().toString());

        Mamifero perro = new Canino("nombre", "color", "dieta");
        perro.accionMamifera();
        
        ejemploHash();

//        Perro[] listaPerros = new Perro[6];
//
//        Perro perro2 = new Perro("Obi", "Mediano", "Mestizo", 1);
//        // creacion de objeto
////        System.out.println(perro2);
////        System.out.println(perro2.getRaza());
////        perro2.setEdad(2);
////        System.out.println(perro2.toString());
////        System.out.println(perro2.getEdad());
//        Perro perro3 = crearPerro();
//        System.out.println(perro3.toString());
//        Perro perro4 = crearPerro();
//        System.out.println(perro4.toString());
//    }
//
//    public static Perro crearPerro() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el nombre del perro");
//        String Nombre = sc.next();
//        System.out.println("Ingrese el tamaño del perro");
//        String Tamaño = sc.next();
//        System.out.println("Ingrese la raza del perro");
//        String Raza = sc.next();
//        System.out.println("Ingrese la edad del perro");
//        int Edad = sc.nextInt();
//        return new Perro(Nombre, Tamaño, Raza, Edad);
//    }
    }

    public static void ejemploHash() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Prueba> perros = new ArrayList();
        HashMap<Integer, String> varios = new HashMap<>();

        boolean cond = true;
        String input = "";

        do {
            System.out.println("¿Quiere agregar un perro a la coleccion?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            input = sc.next();

            switch (input) {
                case "1": // mientras yo le ponga 1, agrega perros al arraylist
                    perros.add(crearPrueba());
                    break;
                case "2":
                    System.out.println("Coleccion creada");
                    cond = false;
                    break;
                default:
                    System.out.println("Valor ingreasdo no coincide");
                    throw new AssertionError();
            }
        } while (cond == true);
        
        System.out.println("ARRAYLIST");
        
        for (Prueba perro : perros) { // recorro arraylist lugarxlugar
            System.out.println(perro);
            varios.putIfAbsent(perro.getValor(), perro.getNombre());
        }// agrego valor de perro como su llave y el nombre del perro como su valor
        System.out.println("HASHMAP"); // muestro hashmap
        
        System.out.println(varios);
        
        System.out.println("KEYSET");
        
        System.out.println(varios.keySet());
    }

    public static Prueba crearPrueba() {
        Scanner sc = new Scanner(System.in);
        Prueba prueba = new Prueba();
        System.out.println("Ingrese el nombre");
        prueba.setNombre(sc.next());
        System.out.println("Ingrese el valor");
        prueba.setValor(sc.nextInt());

        return prueba;
    }
}
