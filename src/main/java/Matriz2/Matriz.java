/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz2;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class Matriz {

    public static void main(String[] args) {

        //Creación de la matriz con sus vaores (3x3)
        int[][] numero = {{4, 3, 16}, {7, 2, 9}, {1, 5, 17}};
        
        imprimirMatriz(numero);
        System.out.println("");
        
        //Creamos un arralist que copia los valores que nos devuleve el arraylist del metodo fila mayor
        //(formando un arraylist con la posición de los numro mayores de cada fila)
        ArrayList<Integer> arrayFila = new ArrayList<Integer>(filaMayor(numero));

        //Atributo para en cada bucle de c que el valor de posicionColumnaMayor sea igual a la posicion 
        //mayor de esa fila
        int posicionColumnaMayor = 0;
        int numeroMenor = Integer.MAX_VALUE;

        for (int f = 0; f < numero.length; f++) {

            for (int c = 0; c < numero[f].length; c++) {

                posicionColumnaMayor = arrayFila.get(f);
                if (numero[c][posicionColumnaMayor] < numeroMenor) {
                    numeroMenor = numero[c][posicionColumnaMayor];
                }
            }

            if (numeroMenor == numero[f][posicionColumnaMayor]) {
                System.out.println("La matriz es el número " + numeroMenor);
                System.out.println("Que se encunetra en la posición " + f + "-" + posicionColumnaMayor);
            }
        }
    }

    //Metodo que almacena en un array la posicion del numero mas grande de cada fila
    public static ArrayList filaMayor(int[][] numero) {

        ArrayList<Integer> arrayFila = new ArrayList<>();

        int posicionColumna = 0;
        int numeroMayor = 0;

        for (int f = 0; f < numero.length; f++) {
            for (int a = 0; a < numero[f].length; a++) {

                if (numero[f][a] > numeroMayor) {
                    numeroMayor = numero[f][a];
                    posicionColumna = a;
                }

            }
            //Aqui resetemaos el numeor mayor para que en la siguiente fila comienze en cero
            numeroMayor = 0;
            //Añadimos a la lista la posición de la columna mas grande, de esa fila
            arrayFila.add(posicionColumna);

        }
        return arrayFila;
    }
    
    //Metodo para imprimir la matirz
    public static void imprimirMatriz(int[][] numero){
        for (int f = 0; f < numero.length; f++) {
            for (int a = 0; a < numero[f].length; a++) {
                System.out.print(numero[f][a] + " ");
            }
            System.out.println("");
        }
    }

}
