/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

/**
 *
 * @author NitroPc
 */
public class Matriz {

    public static void main(String[] args) {

        //Creación de la matriz con sus vaores (3x3)
        int[][] numero = {{4, 3, 16}, {7, 2, 9}, {1, 5, 17}};

        
        int numeroMatriz=0;
        int fila;
        int columna;
        
        int numeroMomento;
        

        for (int a = 0; a < numero.length; a++) { //Fila de la tabla

            for (int b = 0; b < numero[a].length; b++) { //Columna de la tabla
                
                numeroMomento = numero[a][b];

                if (menorColumna(mayorFila(a, numero), numero, numeroMomento)) {
                    numeroMatriz = numero[a][b];
                    fila = a;
                    columna = b;
                }

                System.out.print("[" + numero[a][b] +"]  ");

            }
            System.out.println("");
        }

        System.out.println("La matriz es el numero " + numeroMatriz);

    }

    //Metodo que devuelve la posición mayor de cada fila (Bien)
    private static int mayorFila(int fila, int[][] numero) {
        int posicionMayor = 0;
        int numeroMayor = 0;
        for (int a = 0; a < numero.length; a++) {
            if (numero[fila][a] > numeroMayor) {
                numero[fila][a] = numeroMayor;
                posicionMayor = a;
            }
        }
        return posicionMayor;
    }

    //Metodo que comprueba el menor de la columna
    private static boolean menorColumna(int columnaMayor, int[][] numero, int numeroMomento) {

        int numeroMenor = Integer.MAX_VALUE;
        boolean menorColumna = false;

        for (int a = 0; a < numero.length; a++) {
            if (numero[a][columnaMayor] < numeroMenor) {
                numeroMenor = numero[a][columnaMayor];

            }
        }

        if (numeroMenor == numeroMomento) {
            menorColumna = true;
        }

        return menorColumna;

    }
}
