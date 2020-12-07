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
public class Ej5 {

    public static void main(String[] args) {

        int[] arrayNumeros = new int[10];
        leerValoresTeclado(arrayNumeros);
        imprimirArray(arrayNumeros);

        int numeroPositivos = contarPositivos(arrayNumeros);
        System.out.println("\nHay " + numeroPositivos + " números positivos");

        int numeroNegativos = contarNegativos(arrayNumeros);
        System.out.println("Hay " + numeroNegativos + " numeros negativos");

        int numerosCeros = contarCeros(arrayNumeros);
        System.out.println("Hay " + numerosCeros + " números ceros");

    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
    }

    // Método que no devuelve nada --> void
    public static void leerValoresTeclado(int[] array) {
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor que quieres en la"
                    + "posición " + i);
            array[i] = tec.nextInt();
        }
    }

    public static int contarPositivos(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarNegativos(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarCeros(int[] array) {
        int contador = 0;
        for (int i = 0; 0 < array.length; i++) {
            if (array[i] == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void mediaPositivos(int[] array) {
        int pos = 0;
        int comp = 0;
        double medp = 0;
        double sumpos = 0;
        double[] posArray = new double[10];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > pos) {
                comp++;

                sumpos += array[i];
            }
        }

        medp = sumpos / comp;
        System.out.println(medp + "");
    }
    
    public static void mediaNegativos(int[] array) {
        int neg = 0;
        int comp = 0;
        double medn = 0;
        double sumNeg = 0;
        double[] negArray = new double[10];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < neg) {
                comp++;

                sumNeg += array[i];
            }
        }

        medn = sumNeg / comp;
        System.out.println(medn + "");
    }

}
