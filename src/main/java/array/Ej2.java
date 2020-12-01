/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class Ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int personas;
        int total = 0;

        do {
            System.out.println("Introduce el numero de personas: ");
            personas = teclado.nextInt();
        } while (personas < 0);

        int[] altura = new int[personas];

        for (int i = 0; i < altura.length; i++) {

            System.out.println("Introduce la altura en cm de la persona " + (i + 1));
            altura[i] = teclado.nextInt();

            if (altura[i] < 0) {
                altura[i] = -altura[i];
            }

            total += altura[i];

        }

        int resultadomedia = total / personas;

        System.out.println("La media de altura es de " + resultadomedia + " cm");

        int mayormedia = 0;
        int menormedia = 0;

        for (int i = 0; i < altura.length; i++) {
            if (altura[i] > resultadomedia) {
                mayormedia++;
            }else{
                menormedia++;
            }
                
        }
        
        if (mayormedia>1){
            System.out.println("Las personas superirores a la media son " + mayormedia);
        }else if(mayormedia==1){
            System.out.println("Las pesonas superiroes a la media es de una");
        }else if(mayormedia<1){
            System.out.println("No hay personas superiores a la media");
        }
        
        if (menormedia>1){
            System.out.println("Las personas menores a la media son " + menormedia);
        }else if(menormedia==1){
            System.out.println("Las pesonas menores a la media es de una");
        }else if(menormedia<1){
            System.out.println("No hay personas menores a la media");
        }
            
        
        
        
    }

}


