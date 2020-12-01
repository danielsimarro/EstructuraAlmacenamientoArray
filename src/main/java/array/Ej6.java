/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class Ej6 {

    static Scanner teclado = new Scanner(System.in);

    static int[] array1 = {1, 2, 3};
    static int[] array2 = {1, 2, 3};

    static int[] array3 = {1, 2, 3, 4};
    static int[] array4 = {1, 2, 3};

    static int[] array5 = {1, 2, 3};
    static int[] array6 = {1, 2, 2};

    public static void main(String[] args) {
        //Comparacion con metodos Arrays.iguals
        //1 comparación
        boolean comparacion1 = Arrays.equals(array1, array2);
        System.out.println("1 comparacion(Arrays.equlas): " + comparacion1);
        //2 comparación
        boolean comparacion2 = Arrays.equals(array3, array4);
        System.out.println("2 comparacion(Arrays.equlas): " + comparacion2);
        //3 comparación
        boolean comparacion3 = Arrays.equals(array5, array6);
        System.out.println("1 comparacion(Arrays.equlas): " + comparacion3);
        
        //Comparacion usando metodos
        //Comparacion1
        System.out.println("La comparacion 1 (metodos): " + comparacion(array1,array2));
        //Comparacion2
        System.out.println("La comparacion 2 (metodos): " + comparacion(array3,array4));
        //Comparacion3
        System.out.println("La comparacion 3 (metodos): " + comparacion(array5,array6));
        
    }

    public static boolean comparacion(int[] arrayUno, int[] arrayDos) {
        if (arrayUno.length == arrayDos.length) {
            for (int i = 0; i < arrayUno.length; i++) {
                if (arrayUno[i] != arrayDos[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
