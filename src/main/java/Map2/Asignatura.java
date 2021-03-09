/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class Asignatura {

    //Atributos de la clase
    private String nombre;
    private int[] calificaciones;

    //Costructor de la clase
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new int[3];

        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i]=numerosAleatorios();
        }
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    //Metodo toString
    @Override
    public String toString() {
        return   nombre + ": \n" +  calificaciones(calificaciones);
    }

    //Metodo para intorducir las calificaciones dentro del array
    public static int introducirValores(int trimestre) {

        Scanner teclado = new Scanner(System.in);
        int valor = -1;
        do {
            System.out.println("Introduce la calificación del " + (trimestre + 1) + "º:");
            try {
                valor = teclado.nextInt();
            } catch (InputMismatchException ime) {
                valor = -1;
                teclado.nextLine();
            }
        } while (valor < 0 || valor > 10);

        return valor;
    }
    
    //Metodos que genere rellene las notas con valores aleatorios
    public int numerosAleatorios(){
        Random random = new Random();
       return random.nextInt(10-0+1)+0;
    }

    //Metodo para mostrar todas las calificaciones
    private String calificaciones(int[] calificacion) {

        String valor = "";

        for (int i = 0; i < calificaciones.length; ++i) {
            System.out.println("");
            valor += (i + 1) + "º Trimestre: " + calificacion[i] + "\n";
        }

        return valor;
    }

}
