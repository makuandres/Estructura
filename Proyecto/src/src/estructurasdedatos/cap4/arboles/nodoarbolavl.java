/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author Maku
 */
public class nodoarbolavl {
    
    private int valor;
    private nodoarbolavl dato;
    private nodoarbolavl hijoIzquierdo;
    private nodoarbolavl hijoDerecho;
    private nodoarbolavl factorequilibrio;
    private int alturaArbol = 1;

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the dato
     */
    public nodoarbolavl getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(nodoarbolavl dato) {
        this.dato = dato;
    }

    /**
     * @return the hijoIzquierdo
     */
    public nodoarbolavl getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    /**
     * @param hijoIzquierdo the hijoIzquierdo to set
     */
    public void setHijoIzquierdo(nodoarbolavl hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    /**
     * @return the hijoDerecho
     */
    public nodoarbolavl getHijoDerecho() {
        return hijoDerecho;
    }

    /**
     * @param hijoDerecho the hijoDerecho to set
     */
    public void setHijoDerecho(nodoarbolavl hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    /**
     * @return the factorequilibrio
     */
    public nodoarbolavl getFactorequilibrio() {
        return factorequilibrio;
    }

    /**
     * @param factorequilibrio the factorequilibrio to set
     */
    public void setFactorequilibrio(nodoarbolavl factorequilibrio) {
        this.factorequilibrio = factorequilibrio;
    }

    /**
     * @return the alturaArbol
     */
    public int getAlturaArbol() {
        return alturaArbol;
    }

    /**
     * @param alturaArbol the alturaArbol to set
     */
    public void setAlturaArbol(int alturaArbol) {
        this.alturaArbol = alturaArbol;
    }

    public void calcularaltura(nodoarbolavl raiz, int contador) {

        if (raiz != null) {
            calcularaltura(raiz.hijoIzquierdo, contador + 1);

            calcularaltura(raiz.hijoDerecho, contador + 1);

            //raiz.alturaArbol= Math.max(, alturaderecha);//
            
            System.out.println(contador);
        }

    }
    
}
