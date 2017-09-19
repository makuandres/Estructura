/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author tusk
 */
public class NodoSimple {
    
    private NodoSimple cabeza;
    private NodoSimple cola;
    /*
     CrearListaSimple() me crea una lista inicializando la cabeza y 
     la cosa de la lista en null
     */

    public void crearlistasimple() {                                             
        this.cabeza = null;
        this.cola   = null;
    }
    
    /*
     me inserta un dato por la cola de la lista, enlazando el nuevo nodo con el anterior
     * @param  enteros.
     */
// recibe como parametro un entero
    

    public void insertar(int dato) {          // creamos el nuevo nodo 
        NodoSimple nodo = new NodoSimple();
        nodo.crearNodo();                                   // al nuevo nodo le asignamos el valor ingresado
        nodo.setdato(dato);

        if (this.cabeza == null && this.cola == null) {     // si la lista esta vacia hacemos al nuevo nodo el primero de la lista
            this.cabeza = nodo;
            this.cola   = nodo;
            
        } else {                                             // si ya existe un nodo enlazamos el nuevo con el ya existente
            cola.setsiguiente(nodo);
            this.cola = nodo;
        }
    }

    
    public void listar() {  
     /*listar() me imprime todos los datos que hay en la lista 
     @param ninguno
     */
        if (!(this.cabeza == null && this.cola == null)) {                // verificiamos que la lista no este vacia 
            NodoSimple aux = cabeza;                                      // creamos el nodo que nos va a recorres la lista nodo por nodo imprimiendo el valor que hay en cada nodo
            int i = 0;                                                    // ciclo por el cual el nodo recorre la lista hasta que la cola tenga el valor de null
            while (aux != null) {
                System.out.println("El dato de la lista simple :" + "(" + aux.getdato() + ")" + " " + "se encuentra en la posicion" + "(" + i + ")");
                aux = aux.getsiguiente();
                i++;
            }
        }
    }
    
    
    public void eliminar(int dato) {
        
        /*
     elminar dato recorre la lista hasta encontrar el dato a eliminar
     @ param entero
     */
    // recibe como parametro un entero
    
        if (cabeza.getdato() == dato) {                                    // verifica si el nodo a eliminar es el primero
            cabeza = cabeza.getsiguiente();                                // el primer nodo apunta el sieguiente

        } else {                                                           // creamos un nodo auxiliar con la copia de la lista//
            NodoSimple aux = cabeza; 
            while (aux.getsiguiente().getdato() != dato) {                 //  recorremos la lista hasta llegar al nodo anterior del dato ingresado //
                aux = aux.getsiguiente();

            }
            NodoSimple siguiente = aux.getsiguiente().getsiguiente();      // guardar en nodo que va despues al que vamor a elminar 
            aux.setsiguiente(siguiente);                                   // enlazamos el nodo anterior al elminar con el despues del mismo 
        }

    }
}

