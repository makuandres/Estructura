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
    
    public void settamaño(int t) {
        this.tamaño = t;
    }
    
    public int gettamaño() {
        return tamaño;
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
    
    public void ordenarVector(int vector[]){
        for(int i = 0; i < vector.length - 1; i++)
        {
            for(int j = 0; j < vector.length - 1; j++)
            {
                if (vector[j] < vector[j + 1])
                {
                    int temporal = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = temporal;
                   }
                    }
                      }
                        }
    
    public void buscarBinario(int posicion, int vector[]){
    Integer posicion_inicial=0;
    Integer posicion_final=vector.length-1;
    Integer posicion_central = null;
    while(posicion_inicial<=posicion_final){
        if (vector[posicion_central]==posicion){
            System.out.println("el dato esta en:"+posicion_inicial+"y"+posicion_final);
            }
            else {if(posicion<=vector[posicion_central]){
            posicion_final=posicion_central;
            }
                }
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
    
    public boolean Elimiar(int t) {  
        this.vector = null;
        return true;
    }
    
    
    
}