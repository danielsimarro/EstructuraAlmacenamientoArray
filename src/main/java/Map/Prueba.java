/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

/**
 *
 * @author NitroPc
 */
public class Prueba {

    public static void main(String[] args) {

        //Creación de las asignaturas
        Asignatura badat = new Asignatura("Badat");
        Asignatura programacion = new Asignatura("Programación");
        Asignatura fol = new Asignatura("Fol");
        Asignatura ldm = new Asignatura("Lenguaje de marcas");
        Asignatura sistemas = new Asignatura("Sistemas Informaticos");

        //Creación de el alumno
        Alumnado a1 = new Alumnado("Daniel", "Simarro Reigada");

        //Agragamos asignaturas al alumno
        a1.agregarAsignaturas(ldm);
        a1.agregarAsignaturas(badat);
        a1.agregarAsignaturas(programacion);
        a1.agregarAsignaturas(fol);
        a1.agregarAsignaturas(sistemas);

        System.out.println(a1.toString());

        a1.aggregarExp("069AA", a1);

        a1.impimirExp();

    }
}
