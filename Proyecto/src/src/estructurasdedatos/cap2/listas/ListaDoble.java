/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

/**
 *
 * @author tusk
 */
public class ListaDoble {
    
    
 private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    
    
    public void crearlistadoble() {        // me crea una lista inicializando la cabeza y la cosa de la lista en null
                                         
        this.cabeza = null;
        this.cola   = null;
    }
    
    
    public void insertar(int dato) {          
        NodoDoble Nodo = new NodoDoble();
        Nodo.crearNodo();                                   // al nuevo nodo le asignamos el valor ingresado
        Nodo.setdato(dato);

        if (this.cabeza == null && this.cola == null) {     // si la lista esta vacia hacemos al nuevo nodo el primero de la lista 
            this.cabeza = Nodo;
            this.cola   = Nodo;
            
        } else {                                             
            cola.setsiguiente(Nodo);                        // si ya existe un nodo, enlazamos el nuevo con el ya existente
            this.cola = Nodo;
        }
    }
    
    
    public void listar() {                                  //me imprime todos los datos que hay en la lista
     
        if (!(this.cabeza == null && this.cola == null)) {                // verifica que la lista no este vacia 
            NodoDoble aux = cabeza;                                      // crea el nodo que nos va a recorrer la lista nodo por nodo, imprimiendo el valor que hay en cada nodo
            int i = 0;                                                    // ciclo por el cual el nodo recorre la lista hasta que la cola tenga el valor de null
            while (aux != null) {
                System.out.println("El dato de la lista doble :" + "(" + aux.getdato() + ")" + " " + "se encuentra en la posicion" + "(" + i + ")");
                aux = aux.getsiguiente();
                i++;
            }
        }
    }
    
    //no funciona
   /* public void modificar(int dato) {
        NodoDoble actual = new NodoDoble();
        actual = cabeza;
        int bandera = 0;
        while (actual != null) {
            if (actual.getdato() == dato) {
                System.out.println("Ingrese nuevo dato para el nodo:");
                actual = actual.setactual();
                
                bandera = 1;

            }
            actual = actual.getsiguiente();
        }
        if (bandera == 0) {
            System.out.println("Dato no esta en la lista");
        }
    } */
    
    
    public void eliminar(int dato) {                                       //elminar dato recorre la lista hasta encontrar el dato a eliminar
                
        if (cabeza.getdato() == dato) {                                    // verifica si el nodo a eliminar es el primero
            cabeza = cabeza.getsiguiente();                                // el primer nodo apunta el siguiente

        } else {                                                           // crea un nodo auxiliar con la copia de la lista
            NodoDoble aux = cabeza; 
            while (aux.getsiguiente().getdato() != dato) {                 //  recorre la lista hasta llegar al nodo anterior del dato ingresado
                aux = aux.getsiguiente();

            }
            NodoDoble siguiente = aux.getsiguiente().getsiguiente();      // guarda en Nodo que va despues del que vamor a elminar 
            aux.setsiguiente(siguiente);                                   // enlaza el nodo anterior al elminar con el despues del mismo 
        }

    }
}
    
