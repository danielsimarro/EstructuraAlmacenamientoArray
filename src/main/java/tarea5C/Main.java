/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5C;

/**
 *
 * @author NitroPc
 */
public class Main {
    public static void main(String[] args) {
        
       ListaMoto moto = new ListaMoto();
       
        moto.nuevaMoto(new Moto ("yamaha","r6", 133));
        moto.nuevaMoto(new Moto ("kawasaki","ninja", 310));
        moto.nuevaMoto(new Moto ("honda","fmx", 36));
        
        ListaMoto.imprimirLista(moto);
        moto.ordenarMarca();
        System.out.println("--------");
        ListaMoto.imprimirLista(moto);
        System.out.println("--------");
        moto.ordenarCv();
        ListaMoto.imprimirLista(moto);
        System.out.println("--------");
        int posi = moto.buscarCv(new Moto ("ducati","scrambler hashtag", 36));
        System.out.println("Posicion de la moto según los cv" + posi);
        
        int posimarca = moto.buscarMarca(new Moto ("yamaha","jog",3 ));
        System.out.println("Posicion de la moto según la marca " + posimarca);
    }
}
