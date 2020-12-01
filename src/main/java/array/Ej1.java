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
public class Ej1 {
    public static void main(String[] args) {
        
        
        int[]numero = {1,2,3,4,5,6};
        
        int total=0;
        
        for(int i=0;i<numero.length;i++){
            System.out.println("El valor de la posición " + i + " es " + numero[i]);
            
            total+=numero[i];
    }
        System.out.println("Las suma de todos los numeros es " + total);
        
        
        
    }
}
