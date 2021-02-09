/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author NitroPc
 */
public class Ej20 {

    public static void main(String[] args) {

        boolean[][] asientos = new boolean[25][4];

        rellenar(asientos);

        reservar(asientos, 5, 2);
        reservar(asientos, 0, 3);
        reservar(asientos, 10, 3);
        reservar(asientos, 7, 2);
        reservar(asientos, 25, 5);

        asientosLibresOcupados(asientos);

    }

    public static void reservar(boolean[][] reservas, int fila, int asiento) {
        if ((fila >= 0 && fila <= 24) && (asiento >= 0 && asiento <= 3)) {
            reservas[fila][asiento] = false;
        }

    }

    public static void cancelar(boolean[][] reservas, int fila, int asiento) {
        if ((fila >= 0 && fila <= 24) && (asiento >= 0 && asiento <= 3)) {
            reservas[fila][asiento] = true;
        }

    }

    public static void asientosLibresOcupados(boolean[][] reservas) {
        for (int i = 0; i < reservas.length; i++) {
            for (int j = 0; j < reservas[i].length; j++) {

                System.out.println("La fila " + i + " de el asinto " + j + " esta reservado: " + reservas[i][j]);

            }
        }
    }

    public static void rellenar(boolean[][] reservas) {
        for (int i = 0; i < reservas.length; i++) {
            for (int j = 0; j < reservas[i].length; j++) {
                reservas[i][j] = true;
            }
        }
    }

}
