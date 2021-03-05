/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej26;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class Pila {

    //Atributos
    private ArrayList pila;
    private int espacioPila = 0;

    //Constructor
    public Pila() {
        pila = new ArrayList<>();
    }

    //Metodo para insertar elementos al arrayList sin superar el tamaño que tiene la pila
    public void insertarElementos(char p) {
        if (size() < espacioPila) {
            pila.add(p);
        } else {
            System.out.println("No se pueden insertar valores en la pila, ya que no hay espacio suficiente");
        }

    }

    //Metodo para quitar el ultimo elemento insertado al arrayList
    public void desapilar() {
       if(!vacia()){
           pila.remove(size()-1);
       }
        
    }
    
    public boolean llenar(){
        return pila.size() == espacioPila;
    }

    //Metodo para saber el tamaño del array
    public int size() {
        return pila.size();
    }

    //Metodo para saber si el array esta lleno o vacio
    public boolean vacia() {
        return pila.isEmpty();
    }

    //Metodo para imprimir arrayList
    public void imprimirElementos() {
        for (int i = 0; i < size(); i++) {
            System.out.println("En la posición " + (i + 1) + "hay un: " + pila.get(i));
        }
    }
    
    //Metodo para imprimir un array, que le pasamos por parametros
    public static void imprimirElementos(char [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posición " + (i + 1) + "hay un: " + array[i]);
        }
    }

    //Metodo para rellenar el arrayList con los valores de otro array enviado como parametro
    public void rellenar(Array a) {
        for (int i = 0; i < a.getElementos().length; i++) {
            char valor = a.getElementos()[i];
            pila.add(valor);
        }

        espacioPila = size();
    }

    //Metodo para sacar elemenots empezando desde el ultimo insertado e introducienolos en un nuevo array
    public char[] sacarElementos() {
        char[] devolver = new char[size()];
        int contador = 0;

        for (int i = size() - 1; i >= 0; i--) {
             devolver[contador] = (char) pila.get(i);
            contador++;

        }
        pila.removeAll(pila);
        espacioPila = 0;
        
        return devolver;
    }

}
