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
        Avion aresol = new Avion();
        
        easyjet.nuevaAvion(aresol);
        
        easyjet.getListaAviones().get(0).reservar(easyjet.obtenerReservas(0),2, 1);
        
        ListaAviones.metodoImprimirAsientos(easyjet.getListaAviones().get(0).getAsientos());
    }
}
