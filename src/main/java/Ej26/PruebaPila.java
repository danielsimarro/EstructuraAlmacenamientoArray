/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej26;

/**
 *
 * @author NitroPc
 */
public class PruebaPila {
    
    
    public static void main(String[] args) {
        Array a1 = new Array(3);
        
        Pila p1 = new Pila();
        
        System.out.println("La pila esta vacia: " + p1.vacia());
        
        p1.rellenar(a1);
        
        System.out.println("-------------------");
        System.out.println("Imprimimos la pila:");
        p1.imprimirElementos();
        
        p1.insertarElementos('c');
        
        p1.desapilar();
        
        p1.insertarElementos('c');
        
        System.out.println("La pila esta vacia: " + p1.vacia());
        
        System.out.println("-------------------");
        System.out.println("Imprimimos la pila, con elemento insertado:");
        p1.imprimirElementos();
        
        char [] devolver = p1.sacarElementos();
        
        
        
        System.out.println("-------------------");
        System.out.println("Imprimimos la pila devuelta:");
        
        Pila.imprimirElementos(devolver);
        
        System.out.println("La pila esta vacia: " + p1.vacia());
        
        
    }
    
    
}
