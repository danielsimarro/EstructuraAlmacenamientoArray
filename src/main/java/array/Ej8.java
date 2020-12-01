/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class Ej8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array: ");
        int tamano = teclado.nextInt();

        int[] array = new int[tamano];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posicion " + i);
            array[i] = teclado.nextInt();

        }
        
        for (int i = 0; i < array.length; i++){
            
            for( int p = 0; p<array[i];p++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

