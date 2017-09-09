/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author tusk
 */
public class Vector {
    
    private int tamaño;
    private String[] vector;


    public void crearVector(int n) {        
        this.tamaño = n; 
        this.vector = new String[this.tamaño]; 
    }
    
    public void settam(int t) {
        this.tamaño = t;
    }
    
    public int gettam() {
        return tamaño;
    }   
    
    public boolean Elimiar(int t) {  
        this.vector = null;
        return true;
    }
    
    public void Insertar(String n, int posicion) { 
        vector[posicion] = n;                     
    }
    
    public String[] listar() {

        for (int i = 0; i < tamaño; i++) {     
            System.out.println(vector[i]);  
        }
        return vector;
    }
    
    public void buscarDato(String dato) {  
        int i = 0;
        while (i < tamaño) {                   
            if (vector[i].equals(dato)) {   
                System.out.println("el dato se encuentra en la posicion: " + i);  
            }
            i++;
        }
    } 
    
    public void actualizar (int posicion, String dato){   
        if(posicion < tamaño){                             
            System.out.println("la posicion indicada no existe"); 
        }else {
            vector[posicion]= dato;                       
        }
    } 
    
    public void borrarposicion (int posicion){            
        vector[posicion]= null;                           
    }
    
    
    
}