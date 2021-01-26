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
public class Ej22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce la frase");
        // un progarama que lea por teclado una frase
        String fraseLeida = teclado.nextLine();
        System.out.println("La frase introducida es " + fraseLeida);
        
        //Crea array de cada palabra que este a lado de un espacio
        String[] conjuntoPalabras  = fraseLeida.split(" ");
        
        for(String palabrasSueltas : conjuntoPalabras){
            System.out.println(palabrasSueltas);
        }
    }
}
