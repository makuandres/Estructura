/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoDoble;

/**
 *
 * @author tusk
 */
public class ListaDoble {
private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    
    
    public void crearlistadoble() {        
                                         
        this.cabeza = null;
        this.cola   = null;
    }
    
    
    public void insertar(int dato) {          
        NodoDoble Nodo = new NodoDoble();
        Nodo.crearNodo();                                   
        Nodo.setdato(dato);

        if (this.cabeza == null && this.cola == null) {     
            this.cabeza = Nodo;
            this.cola   = Nodo;
            
        } else {                                             
            cola.setsiguiente(Nodo);                        
            this.cola = Nodo;
        }
    }
    
    
    public void listar() {                                  
     
        if (!(this.cabeza == null && this.cola == null)) {                
            NodoDoble aux = cabeza;                                      
            int i = 0;                                                    
            while (aux != null) {
                System.out.println("El dato de la lista doble :" + "(" + aux.getdato() + ")" + " " + "se encuentra en la posicion" + "(" + i + ")");
                aux = aux.getsiguiente();
                i++;
            }
        }
    }
    
     
   
    public void eliminar(int dato) {                                      
                
        if (cabeza.getdato() == dato) {                                   
            cabeza = cabeza.getsiguiente();                                

        } else {                                                           
            NodoDoble aux = cabeza; 
            while (aux.getsiguiente().getdato() != dato) {                 
                aux = aux.getsiguiente();

            }
            NodoDoble siguiente = aux.getsiguiente().getsiguiente();      
            aux.setsiguiente(siguiente);                                    
        }

    }
}
   
