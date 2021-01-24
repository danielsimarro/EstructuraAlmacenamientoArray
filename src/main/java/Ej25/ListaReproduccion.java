/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej25;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author NitroPc
 */
public class ListaReproduccion {

    ArrayList<String> canciones;

    public ListaReproduccion() {
        canciones = new ArrayList<>();
    }

    public int numeroCanciones() {
        return this.canciones.size();
    }

    public boolean estaVacia() {
        return this.canciones.isEmpty();
    }
    
    public String escucharCancion(int posicion){
        return this.canciones.get(posicion);
    }
    
    public void cabiarCancion(int i, String cancion){
        this.canciones.set(i, cancion);
    }
    
    public void grabarCancion(String cancion){
        this.canciones.add(cancion);
    }
    
    public void eliminaCancion(int a){
        this.canciones.remove(a);
    }
    
    public void eliminaCancion(String cancion){
        this.canciones.remove(cancion);
    }
    
    public static void imprimirLista(ListaReproduccion tmp){
        
        for(int i = 0 ; i<tmp.numeroCanciones();i++){
            System.out.println(tmp.escucharCancion(i));
        }
        
    }
    
    public int buscarCancion (String c){
        return this.canciones.indexOf(c);
    }
    
    
    
}
