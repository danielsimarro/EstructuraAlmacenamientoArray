/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author NitroPc
 */
public class Ej4 {
    public static void main(String[] args) {
        
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        
        Scanner teclado = new Scanner (System.in);
        
        int numero;
        System.out.println("Introduce un valor (0-9)");
        
        numero=teclado.nextInt();
        
        for (int i=0; i<array.length;i++){
            if(array[i]==numero){
                System.out.println(numero + " se encuentra en la posición " + (i+ 1) + " del array");
                break;
            }
        }
        int posicion=Arrays.binarySearch(array, numero);
        System.out.println(numero + " se encuentra en la posición " + (posicion+ 1) + " del array");
    }
}
