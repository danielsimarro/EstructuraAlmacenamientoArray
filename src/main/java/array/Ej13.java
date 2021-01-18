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
public class Ej13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean repetir = true;
        char asterisco = '*';
        int[] resultado = new int[cantidad()];
        int histo = 0;

        do {
            do {
                System.out.println("Introduce un número");
                histo = teclado.nextInt();

                if (histo == 0) {
                    repetir = false;

                }
                if (histo < 0 || histo > 20) {
                    System.out.println("Valor no válido");
                    System.out.println("-------------");
                }

            } while (histo < 0 || histo > 20);
            
            if (histo != 0){
                resultado[histo - 1] +=1;
            }

        } while (repetir);

        System.out.println("---------------------------------");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print((i + 1) + ":");

            for (int j = 0; j < resultado[i]; j++) {
                System.out.print(asterisco);
            }

            System.out.println("");
        }

    }
    
    private static int cantidad(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el tamaño del array");
        int cantidad;
        return cantidad= teclado.nextInt();
    }
}
