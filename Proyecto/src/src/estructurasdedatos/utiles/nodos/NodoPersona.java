/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

import estructurasdedatos.cap1.tiposdedatos.persona;

/**
 *
 * @author Maku
 */
public class NodoPersona {
    
    private Persona dato;
    private NodoPersona siguiente;
    
    
    public void crearnodo(){
    siguiente=null;
    dato=null;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(int cedula) {
        Persona p =new Persona (cedula);
        this.dato = p;
    }

    public NodoPersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }
   
    }