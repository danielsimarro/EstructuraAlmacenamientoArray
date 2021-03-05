/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej26;

import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class Array {
    
    private static final Scanner teclado = new Scanner (System.in);
    
    
    private char [] elementos;

    public Array(int cantidad) {
        elementos = new char [cantidad];
        for(int i = 0; i<elementos.length;i++){
            System.out.println("Introduce el valor de la posición " + i);
            elementos[i]=teclado.next().charAt(0);
        }
    }

    public char[] getElementos() {
        return elementos;
    }

    public void setElementos(char[] elementos) {
        this.elementos = elementos;
    }

    
    
}
