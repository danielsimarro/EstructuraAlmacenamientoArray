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
public class Posicion {
    
    private int columna;
    private int fila;

    public Posicion(int columna, int fila) {
        this.columna = columna;
        this.fila = fila;
    }
    
    public Posicion(){
        this.columna = -1;
        this.fila = -1;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    
    
}
