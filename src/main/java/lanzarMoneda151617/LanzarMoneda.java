/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzarMoneda151617;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class LanzarMoneda {

    private boolean[] moneda;

    public LanzarMoneda() {
        moneda = new boolean[cantidad()];

        llenarArray(moneda);

    }

    public int cantidad() {
        Scanner teclado = new Scanner(System.in);
        int lanzamientos;
        System.out.println("Introduce el número de lanzamientos de moneda:");

        lanzamientos = teclado.nextInt();

        return lanzamientos;
    }
    

    private static boolean lanzar() {
        Random random = new Random();

        boolean opcion = random.nextBoolean();
        
        return opcion;
    }

    private void llenarArray(boolean[] moneda) {
        for (int i = 0; i < moneda.length; i++) {
            moneda[i] = LanzarMoneda.lanzar();
        }

    }

    public int caras() {
        int contadorcaras = 0;
        for (int i = 0; i < moneda.length; i++) {

            if (moneda[i] == true) {
                contadorcaras++;
            }

        }
        return contadorcaras;
    }

    public int cruces() {
        int contadorcruz = 0;
        for (int i = 0; i < moneda.length; i++) {

            if (moneda[i] == false) {
                contadorcruz++;
            }

        }
        return contadorcruz;
    }

    public void imprimir() {
        for (int i = 0; i < moneda.length; i++) {
            String caraCruz;
                if(moneda[i] ==false) {
                    caraCruz ="Cruz";
                }else{
                    caraCruz="Cara";
                }

            System.out.println(i+1 + "-" + caraCruz);
        }
    }
}
