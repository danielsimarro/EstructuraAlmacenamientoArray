/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class Alumnado {
    
    private String nombre;
    private String apellidos;
    private String expediente;
    private ArrayList<Asignatura> libroCalificaciones;

    public Alumnado(String nombre, String apellidos, String expediente) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.expediente = expediente;
        
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

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }


    @Override
    public String toString() {
        return "Alumno: " + "Nombre=" + nombre + ", Apellidos=" + apellidos + ", Expediente=" + 
                expediente + "LibroCalificaciones= \n" + asignaturas()  ;
    }
    
    public String asignaturas(){
        
        String valor = "";
        
        for(int i = 0; i<libroCalificaciones.size(); i++){
            valor += libroCalificaciones.get(i).toString();
        }
        
        return valor;
    }
    
    public void asignarAsig(Asignatura a){
        
        libroCalificaciones.add(a);
        
    }
    
    
    
    
    
}
