/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej20avion;

import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class Avion {

    public static Scanner teclado = new Scanner(System.in);
    private String avion;
    private boolean[][] asientos;

    public Avion() {
        this.avion = nombre();
        asientos = new boolean[asiento()][filas()];
        rellenar(asientos);//Pone a disponible todo los asientos
    }

    private static String nombre() {
        System.out.println("Introduce el nombre de el avion: ");
        String nombre = teclado.nextLine();
        return nombre;
    }

    private static int asiento() {
        System.out.println("Introduce el numero de asientos que tiene el avion:");
        int asiento = teclado.nextInt();
        return asiento;
    }

    private static int filas() {
        System.out.println("Introduce el numero de filas por cada asiento:");
        int fila = teclado.nextInt();
        return fila;
    }

    private static void rellenar(boolean[][] reservas) {
        for (int i = 0; i < reservas.length; i++) {
            for (int j = 0; j < reservas[i].length; j++) {
                reservas[i][j] = true;
            }
        }
    }

    public  void reservar(boolean[][] reservas, int fila, int asiento) {
        if ((fila >= 0 && fila <= 24) && (asiento >= 0 && asiento <= 3)) {
            reservas[fila][asiento] = false;
        }

    }

    public  void cancelar(boolean[][] reservas, int fila, int asiento) {
        if ((fila >= 0 && fila <= 24) && (asiento >= 0 && asiento <= 3)) {
            reservas[fila][asiento] = true;
        }

    }

    public  void asientosLibresOcupados(boolean[][] reservas) {
        for (int i = 0; i < reservas.length; i++) {
            for (int j = 0; j < reservas[i].length; j++) {

                System.out.println("La fila " + i + " de el asinto " + j + " esta reservado: " + reservas[i][j]);

            }
        }
    }

    public static Scanner getTeclado() {
        return teclado;
    }

    public static void setTeclado(Scanner teclado) {
        Avion.teclado = teclado;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public boolean[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }
    
    
}
