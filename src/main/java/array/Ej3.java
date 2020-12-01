/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author NitroPc
 */
public class Ej3 {

    public static void main(String[] args) {

        Random random = new Random();

        int n = 0, m = 19, aleatorio;
        aleatorio = random.nextInt(m - n + 1) + n;
        
        double[] numero1 = new double[20];
       
        Arrays.fill(numero1, 7.5);
        
        double[] numero2 = Arrays.copyOf(numero1, numero1.length);

        for (int i = 0; i < numero1.length; i++) {

            System.out.println("La posicion " + i + " es igual a " + numero1[i]);
            
            numero1[aleatorio]=6.3;

        }
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < numero2.length; i++) {

            System.out.println("La posicion " + i + " es igual a " + numero2[i]);
        }

        if (Arrays.equals(numero1, numero2)) {
            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");
        }
    }
}
