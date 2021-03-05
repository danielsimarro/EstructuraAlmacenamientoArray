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
public class EJ4x4 {

    public static void main(String[] args) {
        //Buscar el mayor de la  fila y el menor de la columna

        /*4 5 16
          7 2 9 <--
          1 5 17*/
        Scanner teclado = new Scanner(System.in);

        /*System.out.println("Introduce el tamaño del tablero");
       
        int casillas = teclado.nextInt();
        /*int [][] numero = new int [casillas][casillas];*/
        int[][] numero = {{4, 3, 16}, {7, 2, 9}, {1, 5, 17}};

        /*for(int o = 0; o<numero.length;o++){
            for(int j = 0; i < numero[i].length;j++){
                System.out.println("Introduce el número de la fila " + i + " columna " + j);
                numero[i][j]=teclado.nextInt();
            }
        }*/
        int numeroMayor = 0;
        int numeroMenor = 100;
        int posicionMayorFila = 0;
        int numeroMatriz = 0;
        

        for (int i = 0; i < numero.length; i++) {
            System.out.println("");
            
            for (int j = 0; j < numero[i].length; j++) {

                if (numero[i][j] > numeroMayor) {
                    numeroMayor = numero[i][j];
                    posicionMayorFila = j;
                }

                if (numero[i][posicionMayorFila] < numeroMenor) {
                    numeroMenor = numero[i][j];
                }

                if (numero[i][j] == numeroMenor && numero[i][j] == numeroMayor) {
                    numeroMatriz = numero[i][j];
                }

                System.out.print(numero[i][j] + " ");
            }
            
            
        }
        System.out.println("");

        System.out.println("El número mayor de la fila y el menor de la columna es: " + numeroMatriz);
    }

    
    

}
