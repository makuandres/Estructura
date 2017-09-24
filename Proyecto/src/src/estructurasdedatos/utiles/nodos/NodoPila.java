/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author Maku
 */
public class NodoPila {
    
    DatosPila dato;
    NodoPila siguiente;

    
    public void crearnodo(){
        
        this.dato = null;
        siguiente=null;
        
    }
    
    public DatosPila getDato() {
        return dato;
    }

    
    public void setDato(String nombre, String cedula ) {
        DatosPila a= new DatosPila(nombre, cedula);
        this.dato = a;
    }

    
    public NodoPila getSiguiente() {
        return siguiente;
    }

    
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
   
    
}