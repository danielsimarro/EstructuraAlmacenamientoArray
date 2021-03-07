/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author NitroPc
 */
public class Alumnado {
    
    //Atributos de la clase
    private String nombre;
    private String apellidos;
    private Map<String,Alumnado> numeroExpediente;
    private ArrayList <Asignatura> libroCalificacion;
    
    //Cosntructor de la clase alumnado
    public Alumnado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroExpediente = new TreeMap<>();
        this.libroCalificacion = new ArrayList <>();
        
    }

    public Alumnado() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Metodo para añadirle a un alumno su correspondiente numeroExpediente
    public void aggregarExp(String numeroExp, Alumnado a){
        numeroExpediente.put(numeroExp, a);
    }
    
    //Metodo para agregar asignaturas al alumno
    public void agregarAsignaturas(Asignatura a){
        libroCalificacion.add(a);
    }
    
    //Metodo toStrin para mostrar todo aceraca del alumno

    @Override
    public String toString() {
        return ("Nombre: " + this.nombre + "\tApellidos: " + this.apellidos 
                + "\nAsignaturas:\n " + asignaturas());
    }
    
//    //Metodo para mostrar el expediente del alumno
//    public String mostrarExpediente(){
//        
//    }
    
    //Metodo para obtener una lista con las calificaciones de cada alumno en cada asignatura
    public String asignaturas(){
        
        String valor ="";
        
        for(int i = 0; i<libroCalificacion.size();i++){
            valor += libroCalificacion.get(i).toString();
        }
        
        return valor;
    }
    
    //Metodo que devuelve una lista de con los expedientes 
    public void impimirExp(){
        
        for(String key: numeroExpediente.keySet()){
            System.out.println("El alumno con el expediente " + key + " es: " + numeroExpediente.get(key).nombre);
        }
    }
    
    
    
}
