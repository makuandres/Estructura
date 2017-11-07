/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author tusk
 */
public class ArbolAVL {
    
    public nodoarbolavl raiz;
 
     
    public ArbolAVL( int valor ) {
        this.raiz = new nodoarbolavl (  );
    }
 
    public ArbolAVL( nodoarbolavl raiz ) {
        this.raiz = raiz;
    }
 
 
    public nodoarbolavl getRaiz() {
        return raiz;
    }
 
    public void setRaiz(nodoarbolavl raiz) {
        this.raiz = raiz;
    }
             
  
    private void Insertar( nodoarbolavl nodo, nodoarbolavl raiz ) {
        
        if ( raiz == null ) {
            
            this.setRaiz(nodo);
        }
        else {           
            if ( nodo.getValor() <= raiz.getValor() ) {              
                if (raiz.getHijoDerecho() == null) {
                    raiz.setHijoIzquierdo(nodo);
                }
                else {
                    Insertar( nodo , raiz.getHijoIzquierdo() );
                }
            }
            else {              
                if (raiz.getHijoDerecho() == null) {
                    raiz.setHijoDerecho(nodo);
                }
                else {
                    Insertar( nodo, raiz.getHijoDerecho());
                }
            }
        }
        
                 raiz.calcularaltura(raiz,0);
                 
                 
        
                  
    
                 
    }
    
     /*public boolean Buscar(nodoarbol dato, nodoarbol raiz){
            boolean respuesta = false;
            if(raiz == null){
                System.out.println("no hay datos");
            } else {
                if(dato == raiz.dato){
                    respuesta = true;
                    return true;
                }else{
                    if(dato < .()){
                        respuesta(raiz.getHijoIzquierdo().dato);
                    }else{
                        if(dato > raiz.getDato()){
                        respuesta(raiz.getHijoDerecho().dato);
                    }
                }
           }
            
            return respuesta;
        }
           return false;
       
     }*/

     public int AlturaArbol(){
            if(raiz!= null){
                return 0;
                }else{
                int alturaizquierda=raiz.getHijoIzquierdo().getAlturaArbol();
                int alturaderecha=raiz.getHijoDerecho().getAlturaArbol();
                return (1+Math.max(alturaizquierda , alturaizquierda));
            }
        }
    


   public void orden(nodoarbolavl raiz){
            if(raiz!= null){
                orden(raiz.getHijoIzquierdo());
                System.out.print(raiz.getDato() + ",");
                orden(raiz.getHijoDerecho());
            }
        }
  
  
    public void preorden(nodoarbolavl raiz){
            if(raiz!= null){
                System.out.print(raiz.getDato() + ",");
                preorden(raiz.getHijoIzquierdo());
                preorden(raiz.getHijoDerecho());
            }
        }
       
           
     public void postorden(nodoarbolavl raiz){
            if(raiz!= null){
                postorden(raiz.getHijoIzquierdo());
                postorden(raiz.getHijoDerecho());
                System.out.print(raiz.getDato() + ",");
            }
        }  
    
}
