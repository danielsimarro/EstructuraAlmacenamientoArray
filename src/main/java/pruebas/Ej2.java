/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class Ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroPersona;

        do {
            System.out.println("Introduce la cantidad de personas a calcular la media:");
            numeroPersona = teclado.nextInt();
        } while (numeroPersona < 0);

        int[] array = new int[numeroPersona];

        int media = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce la altura en cm, de la persona " + (i + 1));
            array[i] = teclado.nextInt();

            if (array[i] < 0) {
                array[i] = -array[i];
            }

            media += array[i];
        }

        int resultadoMedia;

        resultadoMedia = media / numeroPersona;

        System.out.println("La media es " + resultadoMedia);

        int superiorMedia = 0;
        int inferiorMedia = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > resultadoMedia) {
                superiorMedia++;
            } else {
                inferiorMedia++;
            }
        }
    }
}
