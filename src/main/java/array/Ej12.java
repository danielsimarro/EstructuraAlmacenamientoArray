/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ej12 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        final int FILAS = 2;
        final int COLUMNAS =3;

        char[][] matriz = new char[FILAS][COLUMNAS];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduzca un cacacter [" +i+ "," + j + "]");
                matriz[i][j] = teclado.next().charAt(0);
            }
        }
        
        
        imprimir(matriz);

    }

    public static void imprimir(char[][] parametro) {
        for (int i = 0; i < parametro.length; i++) {
            for (int j = 0; j < parametro[i].length; j++) {
                System.out.println(parametro[i][j] + "\t");
                
            }
            System.out.println("");
        }
    }
    
    
}
