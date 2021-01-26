/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author NitroPc
 */
public class ListaLibros {

    private ArrayList<Libro> libros;

    //Constructor
    public ListaLibros(ArrayList<Libro> libros) {
        libros = new ArrayList<>();
    }

    public int numeroLibros() {
        return libros.size();
    }

    public void escv(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(int posicion) {
        if (posicion >= 0 && posicion < libros.size()) {
            libros.remove(posicion);
        }
    }

    public Libro leerLibro(int posicion) {
        if (posicion >= 0 && posicion < libros.size()) {
            return libros.get(posicion);
        } else {
            return null;
        }
    }

    public void imprimirLista() {
        libros.forEach(System.out::println);
    }

    public void ordenarTitulo() {
        Comparator<Libro> criterio = (c1, c2) -> c1.getTitulo().compareTo(c2.getTitulo());
        Collections.sort(libros, criterio);
    }

    public int buscarTitulo(Libro c) {
        Comparator<Libro> criterio = (c1, c2) -> c1.getTitulo().compareTo(c2.getTitulo());

        int posi = Collections.binarySearch(libros, c, criterio);

        return posi;
    }

}
