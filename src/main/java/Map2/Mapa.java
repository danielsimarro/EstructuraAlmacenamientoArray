/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author NitroPc
 */
public class Mapa extends TreeMap{

    private Map<String, Alumnado> map;

    public Mapa() {

        this.map = new TreeMap<>();
    }

    //Metodo para añadir un alumno al mapa
    public void introducirAlumno( Alumnado a) {

        map.put(a.getExpediente(), a);

    }
    
    //Metodo para borrar valores
    public void borrarValores(String identificador){
        map.remove(identificador);
    }
    
    //Metodo para remplazar valores
    public void modificarAlumno(String identificador, Alumnado a){
        map.replace(identificador, a);
    }
    
    //Metodo para obtener un alumno
    public Alumnado obtenerAlumno(String identificador){
       
        return map.get(identificador);
    }
    
    //Metodo para imprimir el mapa
    public void imprimirMapa(){
        
        for(String key : map.keySet()){
            
            System.out.println("El numero de expediente " + key + " corresponde al alumno " + nombreCompleto(obtenerAlumno(key)));
            
        }
    }
    
    public String nombreCompleto(Alumnado a){
        
        String valor = "";
        
        valor += a.getNombre() + " " + a.getApellidos();
        
        return valor;
    }
    
    public String extraerIdentificador(Alumnado a){
        
        return a.getExpediente();
    }

}
