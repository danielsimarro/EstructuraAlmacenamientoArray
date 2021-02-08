/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author daniel
 */
public class Ej12 {

    public static void main(String[] args) {

        int[][] numero = {{5, 7, 9},{4, 6, 5}};
        
        imprimir(numero);

    }

    public static void imprimir(int[][] parametro) {
        for (int i = 0; i < parametro.length; i++) {
            for (int j = 0; j < parametro[i].length; j++) {
                System.out.println("Los numeros de [" + i + "]["
                        + j + "] es " + parametro[i][j]);
            }
        }
    }
}
