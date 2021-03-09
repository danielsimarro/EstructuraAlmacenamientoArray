/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        //Creamos las asignaturas 
        Asignatura badat = new Asignatura("Badat");
        Asignatura programacion = new Asignatura("Programación");
        Asignatura fol = new Asignatura("Fol");
        Asignatura ldm = new Asignatura("Lenguaje de marcas");
        Asignatura sistemas = new Asignatura("Sistemas Informaticos");
        
        //Creación de el alumno
        Alumnado a1 = new Alumnado("Daniel", "Simarro Reigada" ,"069KLJ");

        //Agragamos asignaturas al alumno
        a1.asignarAsig(ldm);
        a1.asignarAsig(badat);
        a1.asignarAsig(programacion);
        a1.asignarAsig(fol);
        a1.asignarAsig(sistemas);
        
        //Creamos el Mapa
        Mapa mapa2 = new Mapa();
        
        //Añdimos el alumno a la lista de expedientes
        mapa2.introducirAlumno(a1);
        
//        //Imprimir mapa
//        map.imprimirMapa();
        
    }
}
