package array;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NitroPc
 */
public class Ej131 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] resultado = new int[20];

        boolean repetir = true;

        int histori = -1;

        do {
            do {
                System.out.println("Introduce un número");
                histori = teclado.nextInt();

                if (histori == 0) {
                    repetir = false;

                }

            } while (histori < 0 || histori > 20);

            if (histori != 0) {
                resultado[histori - 1] += 1;
            }
        } while (repetir);

        System.out.println("-------------------");

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(i + 1 + ":");
            for (int j = 0; i < resultado[i]; i++) {
                System.out.print("*");
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
