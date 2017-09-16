/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoSimple;



/**
 *
 * @author tusk
 */
public class ListaSimple {
    
   
    private NodoSimple cabeza;
    private NodoSimple cola;
    private NodoSimple actual;

    public void crearlistasimple() {
        this.cabeza = null;
        this.cola   = null;
    }

    public void insertar(int dato) {
        NodoSimple nodo = new NodoSimple();
        nodo.crearNodo();
        nodo.setdato(dato);

        if (this.cabeza == null && this.cola == null) {
            this.cabeza = nodo;
            this.cola   = nodo;
        } else {
            cola.setsiguiente(nodo);
            this.cola = nodo;
        }
    }

    public void eliminar(int dato) {
        if (cabeza.getdato() == dato) {
            cabeza = cabeza.getsiguiente();

        } else {
            NodoSimple aux = cabeza;
            while (aux.getsiguiente().getdato() != dato) {
                aux = aux.getsiguiente();

            }
            NodoSimple siguiente = aux.getsiguiente().getsiguiente();
            aux.setsiguiente(siguiente);
        }

    }

    public void listar() {
        if (!(this.cabeza == null && this.cola == null)) {
            NodoSimple aux = cabeza;

            int i = 0;
            while (aux != null) {
                System.out.println("El dato :" + "(" + aux.getdato() + ")" + " " + "esta en la posicion" + "(" + i + ")");
                i++;
            }
        }
    }
}