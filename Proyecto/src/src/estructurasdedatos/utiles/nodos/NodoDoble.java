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
public class NodoDoble {
private int dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;
    

    public NodoDoble getsiguiente() {                    
        return siguiente;
        }
    
    public NodoDoble getanterior() {
        return anterior;
        }

    public void setsiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
        }
    
    public void setanterior(NodoDoble anterior) {
        this.anterior = anterior;
        }

    public int getdato() {
        return dato;
        }

    public void setdato(int dato) {
        this.dato = dato;
        }

    public void crearNodo() {
        this.siguiente = null;
        this.anterior = null;
        this.dato=0;
        }

    
    
    private int dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;
    

    public NodoDoble getsiguiente() {                    
        return siguiente;
        }
    
    public NodoDoble getanterior() {
        return anterior;
        }

    public void setsiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
        }
    
    public void setanterior(NodoDoble anterior) {
        this.anterior = anterior;
        }

    public int getdato() {
        return dato;
        }

    public void setdato(int dato) {
        this.dato = dato;
        }

    public void crearNodo() {
        this.siguiente = null;
        this.anterior = null;
        this.dato=0;
        }

    
    
}

