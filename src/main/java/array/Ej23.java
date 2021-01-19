/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author NitroPc
 */
public class Ej23 {

    private ArrayList<Integer> listaEnteros;

    public Ej23(int numeroElementos) {

        listaEnteros = new ArrayList<>(numeroElementos);

        Random aleatorio = new Random();
        int n = 10, m = 100;

        for (int i = 0; i < listaEnteros.size(); i++) {
            listaEnteros.add(i, aleatorio.nextInt(m - n + 1) + n);
        }

    }

    public void imprimirLista() {
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println(i+1 + "=" + listaEnteros.get(i));
        }
    }
    
    public void imprimirSumaPares () {
        int suma=0;
        for (int i = 0; i < listaEnteros.size(); i++) {
            if((listaEnteros.get(i)%2)==0){
                suma += listaEnteros.get(i);
            }
        }
        System.out.println("La suma de todos los números pares es de: " +suma);
    }
    
    public void imprimirImpares () {
        int contador=0;
        for (int i = 0; i < listaEnteros.size(); i++) {
            if((listaEnteros.get(i)%2)!=0){
                contador++;
            }
        }
        System.out.println("La cantidad de todos los números impares es de: " + contador);
    }
    
    public int elementoMayor(){
        Integer i = Collections.max(listaEnteros);
        return i;
    }
    
    public int elementoMenor(){
        Integer i = Collections.min(listaEnteros);
        return i;
    }
    
    public void sizeLista(){
        int tamanio = listaEnteros.size();
        System.out.println("El tamaño del array es de: " + tamanio);
    }
    
    public void borrarSegunPosicion(int posicion){
        if(posicion >= listaEnteros.size()){
            listaEnteros.remove(posicion);
        }
        
    }
    
    public void borraSegunValor(int valor){
        for (int i = 0; i < listaEnteros.size(); i++) {
            if(listaEnteros.get(i) == valor){
                listaEnteros.remove(i);
                i--;//Por si borra que compruebe la posición que ha borrado ya que el valor siguiente pasara a esa posición
            }
        }
    }
    
    public void modificarElemento (int posicion, int valor){
        listaEnteros.set(posicion,valor);
    }
}
