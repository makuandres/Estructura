/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

import java.util.List;

/**
 *
 * @author Maku
 */
public class GrafoNodoDirigido {
    
    List <Vertice> conjuntovertices;
    List <ArcoNodoDirigido> matrizdeadyacencia;
    
    
    public void InsertarVertice(String dato ){
        
        Vertice Nuevovertice =new Vertice();
        Nuevovertice.setDato(dato);
        conjuntovertices.add(Nuevovertice);
    
}
    
    public void InsertarArco(Vertice verti1, Vertice verti2){
        ArcoNodoDirigido Nuevoarco =new ArcoNodoDirigido();
        Nuevoarco.setVerti1(verti1);
        Nuevoarco.setVerti2(verti2);
        matrizdeadyacencia.add(Nuevoarco);
        
    }
    
    public void EliminarVertice(String dato){
        for (Vertice verticeactual : conjuntovertices) {
            if(verticeactual.getDato().compareTo(dato)==0)
              conjuntovertices.remove(verticeactual);
            
        }
}
    
}
