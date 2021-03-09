/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author NitroPc
 */
public class Matriz {

    //Atibuto de la clase
    private int[][] matriz ;

    //Constructor donde se le pasa el tamaño de la matiz como parametro
    public Matriz(int n) {
        this.matriz = new int[n][n];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = numeroAleatiorio();
            }
        }
    }

    //Constructor por defecto
    public Matriz() {
    }

    //Metodo para generar numeros aleatorios 0 y 1
    public int numeroAleatiorio() {
        Random random = new Random();
        return random.nextInt(1 - 0 + 1) + 0;

    }

    //Metodo para imprimir la matirz
    public void imprimirMatriz() {
        for (int f = 0; f < matriz.length; f++) {
            for (int a = 0; a < matriz[f].length; a++) {
                System.out.print("[" + matriz[f][a] + "] ");
            }
            System.out.println("");
        }
    }

    //Metodo para almacenar que almacena la posicion de los ceros en un arrayList
    private ArrayList buscarCeros() {

        ArrayList<Posicion> arrayPosicion = new ArrayList<>();

        int fila = 0;
        int columna = 0;

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {

                if (matriz[f][c] == 0) {
                    fila = f;
                    columna = c;
                    arrayPosicion.add(new Posicion(f, c));
                }

            }

        }

        return arrayPosicion;
    }

    //Metodo que devuelve si se cumple la matiz en algun punto o no
    public Posicion esMatriz() {

        //Copiamos en un arraylist el array que nos devuelve el metodo buscarCeros  
        ArrayList<Posicion> array = new ArrayList<Posicion>(buscarCeros());

        //Objeto donde se almacenan las posiciones que son ceros
        Posicion posicionCero = new Posicion();
        int columna = 0;
        int fila = 0;

        //Creamos variables donde se sumen las columnas de alrededor 
        int filaArriba;
        int filaAbajo;
        int colIzq;
        int colDer;

        for (int a = 0; a < array.size(); a++) {

            posicionCero = array.get(a);
            columna = posicionCero.getColumna();
            fila = posicionCero.getFila();

            filaArriba = matriz[fila - 1][columna - 1] + matriz[fila - 1][columna] + matriz[fila - 1][columna + 1];
            filaAbajo = matriz[fila + 1][columna - 1] + matriz[fila + 1][columna] + matriz[fila + 1][columna + 1];
            colIzq = matriz[fila - 1][columna - 1] + matriz[fila][columna - 1] + matriz[fila + 1][columna - 1];
            colDer = matriz[fila - 1][columna + 1] + matriz[fila][columna + 1] + matriz[fila + 1][columna + 1];

            int suma = filaArriba + filaAbajo + colIzq + colDer;

            int resultado = suma / 4;

            if ((filaArriba == resultado) && (filaAbajo == resultado) && (colIzq == resultado) && (colDer == resultado)) {

                break;
            }
        }

        return posicionCero;
    }
    
    

}
