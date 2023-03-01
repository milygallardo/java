/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

/**
 *
 * @author Diego
 */
public class Proyecto {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   
        int unNum = 14;
        while (unNum >= 5) {
            System.out.println(unNum);
            unNum = unNum -1;
        } // Me muestra números dentro del conjunto [5;14]
        
        for (int n = 5; n <= 14; n++){
            if (n % 2 == 0){
                System.out.println(n);
            } // Me muestra números pares en [5;14]
        }
    //hola
    }
}
