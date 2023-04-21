/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.getstarted;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Getstarted {

    public static void main(String[] args) throws IOException {
//int myNum = 15;
//myNum = 20;  // myNum is now 20
//System.out.println(myNum);
//final int myNumber = 15;
//System.out.println(myNumber);
//    }  /*If you don't want others (or yourself) to overwrite existing values, 
//    use the final keyword,
//    this will declare the variable as "final", which means unchangeable and read-only):*/

        String[] separado = "3_tristes tigres_del_13".split("_");
        System.out.println(separado[1]);

        char letras[] = {'a', 'b', 'c', 'd'};

        int numeros[] = new int[]{1, 37, 16};

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 30) {

                System.out.println(letras[i + 1]);

            } else {

                System.out.println(numeros[i]);

            }

        }
        int numeross[] = new int[]{1,37,16};
        System.out.println(numeross[2]);
        
         Scanner sc = new Scanner(System.in);

    Path pruebatxt = Paths.get("C:\\Users\\Diego\\Downloads\\Java\\prubea\\prueba.txt");
    int contador = 0;
    String entrada = "";

    System.out.println ("¿Qué palabra querés buscar?");
        entrada  = sc.next();

    for (String linea: Files.readAllLines (pruebatxt) 
        ) {
            if (linea.toLowerCase().contains(entrada.toLowerCase())) {
            System.out.println("Está");
            contador++;
        }
    }

    System.out.println ();

    for (String linea: Files.readAllLines (pruebatxt) 
        ) {
            System.out.println(linea);
    }

    int input;

    System.out.println ("Ingrese el tamaño del array \"perros\" ");
        input  = sc.nextInt();
    String perros[] = new String[input];
    for (int i = 0;i< perros.length ;i++) {
            System.out.println("En el especio " + i + "i");
        perros[i] = sc.next();
    }

    listar(perros);

    System.out.println (saludar());
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

