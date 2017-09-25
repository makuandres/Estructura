/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.DatosPila;
import estructurasdedatos.utiles.nodos.NodoPila;

/**
 *
 * @author tusk
 */
public class Pila {
    
    private NodoPila dato;
    
    private NodoPila tope;
            
    public NodoPila getDato() {
        return dato;
    }

    public void setDato(NodoPila dato) {
        this.dato = dato;
    }

    
    public Pila(){
        dato = null;
       
    }

    public boolean vacia(){
        return (tope == null);
    }
    
    
    
       public void apilar(String nombre, String cedula){                         
        NodoPila nuevo =new NodoPila();                                                                          
        nuevo.setDato(nombre, cedula);                                          
        if(vacia()){                                                            
            tope=nuevo;                                                         
        }else{                                                                       
        nuevo.setSiguiente(tope);
        tope = nuevo;                                                            

        }
        
    }
       
       public void des_apilar() {       
        if (vacia()) {                                                                                      
        } else {             
            System.out.println("El dato ( " + tope.getDato().getNombre() + " )" + " Ha sido eliminado");                  
            tope = tope.getSiguiente();                                                                      

        }
    }
   
       
        public void listar() {        
        if (!(tope == null)) {                                                                                                                                            
            NodoPila aux = tope;                                                                              
            System.out.println("La pila se encuentra formada por: ");                       
            while (aux != null) {
                System.out.println("el dato :" + "[" + aux.getDato().getNombre() + "]");
                aux = aux.getSiguiente();
            }
        }

    }
}
