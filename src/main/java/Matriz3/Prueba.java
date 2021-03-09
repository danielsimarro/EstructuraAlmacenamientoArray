/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz3;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Matriz m1 = new Matriz(4);
        
        m1.imprimirMatriz();
        
        Posicion p1 = new Posicion();
        
        p1 = m1.esMatriz();
        
        if(p1.getColumna()>= 0 && p1.getFila() >= 0){
            System.out.println("La matriz es el numero que esta en la posicion [" + p1.getFila() + " " + p1.getColumna() + "]" );
        }
        
        
    }
}
