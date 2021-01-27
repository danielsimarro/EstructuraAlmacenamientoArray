/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author NitroPc
 */
public class ListaMoto {
    
    private ArrayList<Moto> listaMotos;

    public ListaMoto() {
        listaMotos = new ArrayList<>();
    }
    
    public int numeroMotos(){
        return listaMotos.size();
    }
    
    public void nuevaMoto(Moto m){
        listaMotos.add(m);
    }
    
    public void nuevaMoto(int posicion, Moto m){
        if (posicion >= 0 && posicion < listaMotos.size()) {
            listaMotos.add(posicion, m);
        }
    }
    
    public boolean motosHay(){
        return listaMotos.isEmpty();
    }
    
    public void eliminarMoto (int posicion){
        if (posicion >= 0 && posicion < listaMotos.size()) {
            listaMotos.remove(posicion);
        }
    }
    
    public void elimanarMoto(Moto m){
        listaMotos.remove(m);
    }
    
    public Moto cogerMoto (int posicion){
        if (posicion >= 0 && posicion < listaMotos.size()) {
            return listaMotos.get(posicion);
        } else {
            return null;
        }
    }
    
    public static void imprimirLista(ListaMoto tmp){
        for (int i = 0;i<tmp.numeroMotos();i++){
            System.out.println(tmp.listaMotos.get(i).getMarca() + " " + tmp.listaMotos.get(i).getModelo() + " " +  tmp.listaMotos.get(i).getCv());
        }
        
    }
    
    //Los metodos indexOf, cntains y remove por objeto y no por posicion requieren de los metodos 
    // de hascode y equals de la clase moto.
    public int buscarMoto(Moto m){
        return listaMotos.indexOf(m);
    }
    
    public boolean existeMoto(Moto m){
        return listaMotos.contains(m);
    }
    
    public void ordenarMarca(){
        Comparator <Moto> criterio = (c1, c2) -> c1.getMarca().compareTo(c2.getMarca());
        Collections.sort(listaMotos, criterio);
    }
    
    public void ordenarCv(){
        Comparator <Moto> criterio = (c1, c2) -> c1.getCv().compareTo(c2.getCv());
        Collections.sort(listaMotos, criterio);
    }
    
    public int buscarMarca(Moto m) {
        Comparator<Moto> criterio = (m1, m2) -> m1.getMarca().compareTo(m2.getMarca());

        int posi = Collections.binarySearch(listaMotos, m, criterio);

        return posi;
    }
    
    public int buscarCv(Moto m) {
        Comparator<Moto> criterio = (c1,c2) -> c1.getCv().compareTo(c2.getCv());

        int posi = Collections.binarySearch(listaMotos, m, criterio);

        return posi;
        
        //Tambien se puede poner como retrun Collections.binarySearch(listaMotos, m, (c1,c2) -> c1.getCv().compareTo(c2.getCv());
    }
    
}
