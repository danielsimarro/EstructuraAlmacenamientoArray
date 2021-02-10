/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej20avion;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class ListaAviones {

    private ArrayList<Avion> listaAviones;

    public ListaAviones() {
        listaAviones = new ArrayList<>();;
    }

    public int numeroAviones() {
        return listaAviones.size();
    }

    public void nuevaAvion(Avion m) {
        listaAviones.add(m);
    }

    public void nuevaAvion(int posicion, Avion m) {
        if (posicion >= 0 && posicion < listaAviones.size()) {
            listaAviones.add(posicion, m);
        }
    }

    public boolean AvionesHay() {
        return listaAviones.isEmpty();
    }

    public void eliminarAvion(int posicion) {
        if (posicion >= 0 && posicion < listaAviones.size()) {
            listaAviones.remove(posicion);
        }
    }

    public void elimanarAvion(Avion m) {
        listaAviones.remove(m);

    }

    public static void imprimirLista(ListaAviones tmp) {
        for (int i = 0; i < tmp.numeroAviones(); i++) {
            System.out.println("El nombre del avion es: " + tmp.listaAviones.get(i).getAvion() + "/nAsientos disponibles:");
            metodoImprimirAsientos(tmp.listaAviones.get(i).getAsientos());
            
        }
    }

        
        public static void metodoImprimirAsientos(boolean[][] reservas){
            for (int i = 0; i < reservas.length; i++) {
            for (int j = 0; j < reservas[i].length; j++) {

                System.out.println("La fila " + i + " de el asinto " + j + " esta reservado: " + reservas[i][j]);

            }
        }
            
        }

    @Override
    public String toString() {
        return "ListaAviones{" + "listaAviones=" + listaAviones + '}';
    }

    public ArrayList<Avion> getListaAviones() {
        return listaAviones;
    }

    public void setListaAviones(ArrayList<Avion> listaAviones) {
        this.listaAviones = listaAviones;
    }
            
        
        
        
    }
