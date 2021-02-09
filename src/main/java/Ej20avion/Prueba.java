/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej20avion;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    public static void main(String[] args) {
        ListaAviones easyjet = new ListaAviones();
        
        easyjet.nuevaAvion(new Avion());
        easyjet.getListaAviones().get(0).reservar(easyjet.getListaAviones().get(0).getAsientos(), 4, 5);
        
    }
}
