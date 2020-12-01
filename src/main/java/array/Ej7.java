/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class Ej7 {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner teclado = new Scanner(System.in);

        int tamañoArray;

        System.out.println("Introduce el tamaño de los dos arrrays ");
        tamañoArray = teclado.nextInt();

        int[] array1 = new int[tamañoArray];
        int[] array2 = new int[tamañoArray];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100) + 1;
        }
        
        int mult[]=multiplicador(array1,array2);
        imprimir(array1);
        imprimir(array2);
        imprimir(mult);
        

    }
    
    public static int[] multiplicador(int [] array1,int [] array2){
        int [] multiplicacion = new int[array1.length];
        for (int i=0;i<array1.length;i++){
            
          multiplicacion[i]= array1[i]* array2[i];
          }
        return multiplicacion;
    }
    
    public static void imprimir (int [] array){
        System.out.println("El resultado del array es:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    

}
