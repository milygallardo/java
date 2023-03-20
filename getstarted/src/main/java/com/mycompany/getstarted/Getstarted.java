/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.getstarted;

/**
 *
 * @author Diego
 */
public class Getstarted {

    public static void main(String[] args) {
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
    }
}
