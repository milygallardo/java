/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoprueba;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ProyectoPrueba {

    public static void main(String[] args) throws IOException {
//        System.out.println("Hello World!\t\"Charly\"\nObi");
//    }//\" puedo poner comillas dentro del string
//    // \n pone enter dentro del string
//    // \t pone tabulación dentro del string  
        Scanner sc = new Scanner(System.in);

        Path pruebatxt = Paths.get("C:\\Users\\Diego\\Downloads\\Java\\prubea\\prueba.txt");
        int contador = 0;
        String entrada = "";
        System.out.println("¿Qué palabra querés buscar?");
        entrada = sc.next();

        for (String linea : Files.readAllLines(pruebatxt)) {
            if (linea.toLowerCase().contains(entrada.toLowerCase())) {
                System.out.println("Está");
                contador++;
            }
        }
        
        System.out.println();

        for (String linea : Files.readAllLines(pruebatxt)) {
            System.out.println(linea);
        }

        int input;
        System.out.println("Ingrese el tamaño del array \"perros\" ");
        input = sc.nextInt();
        String perros[] = new String[input];
        for (int i = 0; i < perros.length; i++) {
            System.out.println("En el especio " + i + "i");
            perros[i] = sc.next();
        }
        listar(perros);
        System.out.println(saludar());
        crearArray();

    }

    static String saludar() {
        return "hola";
    }

    private static String listar(String[] entrada) {
        for (String palabra : entrada) {
            System.out.println(palabra);
        }
        return null;
    }

    static String crearArray() {
        return null;
    }
}
