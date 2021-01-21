/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class Ej24 {

    public static void main(String[] args) {

        Random random = new Random();

        int listaTamamo1 = random.nextInt(15 - 5 + 1) + 5;
        int listaTamamo2 = random.nextInt(20 - 10 + 1) + 10;

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i < listaTamamo1; i++) {
            lista1.add(random.nextInt(100 - 50 + 1) + 50);

        }

        for (int i = 0; i < listaTamamo2; i++) {
            lista2.add(random.nextInt(100 - 50 + 1) + 50);
        }
        System.out.println("Valores de la lista 1");
        lista1.forEach(System.out::println);
        System.out.println("Valores de la lista 2");
        lista2.forEach(System.out::println);

        /*for (int i = 0; i < listaTamamo1; i++) {
            for (int j = 0; i < listaTamamo2; i++) {
                if (lista1.get(i).equals(metodo(lista2))) {
                    lista1.remove(i);

                }
            }
        }

        System.out.println("Valores de la lista 3");
        lista1.forEach(System.out::println);

    }

    public static void metodo(ArrayList a,int b) {
        for (int i = 0; i < a.size(); i++) {
            if()
        }*/

    }

}
