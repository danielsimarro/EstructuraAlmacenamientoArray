/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzarMoneda151617;

/**
 *
 * @author NitroPc
 */
public class PruebaLanzarMoneda {
    public static void main(String[] args) {
        
        
        LanzarMoneda moneda = new LanzarMoneda();
        
        
        moneda.imprimir();
        
        System.out.println("Han salido " + moneda.caras() + " caras");
        
        System.out.println("Han salido " + moneda.cruces() + " cruces");
        
        
        

    }
}
