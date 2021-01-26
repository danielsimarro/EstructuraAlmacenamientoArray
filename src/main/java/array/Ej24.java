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
        
        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int i =0; i<lista1.size();i++){
            if(!lista2.contains(lista1.get(i))){
                lista3.add(lista1.get(i));
            }
        }
        
        System.out.println("Valores de la lista 3");
        lista3.forEach(System.out::println);
        
        ArrayList<Integer> lista4 = new ArrayList<>();
        
        for(int i = 0; i < lista1.size();i++){
            if(lista1.get(i)%2==0){
                lista4.add(lista1.get(i));
            }
        }
        
        for(int i = 0; i < lista2.size();i++){
            if(lista2.get(i)%2!=0){
                lista4.add(lista2.get(i));
            }
        }

        System.out.println("Valores de la lista 4");
        lista4.forEach(System.out::println);
    }
    
    

}
