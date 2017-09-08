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
    private int vector[];

    public Vector(int tamaño){
        this.tamaño = tamaño;
        this.vector = new int [tamaño];
        }
    
    public void Insertar(int t, int dato    ){
        if ((t < tamaño)&&(t > 0)){
            this.vector[t]=dato;
        }
        else { System.out.println("El tamaño ingresado no es correcto");
        }
            }
    
    public void Listar(){
        int t;
        for (t =0; t < tamaño; t++){
        System.out.println(vector[t]);
        }
            }
    
    public void Ordenar(){
        int aux, t, j;
        for(t = 0; t < tamaño; t++){
            for(j = t+1; j < tamaño; j++){
                if(vector[t]>vector[t+1]){
                    aux=vector[t];
                    vector[t]=vector[j];
                    vector[j]=aux;
                    }
                        }
                            }
                                }
    
    public void busquedabinaria(int t){
        int posicion_inicial=0;
        int posicion_final=vector.length-1;
        int posicion_central;
        
        while( posicion_inicial <= posicion_final){
            posicion_central=(posicion_final + posicion_inicial)/2;
            if(vector[posicion_central]==t){
                System.out.println("El dato esta en  "+posicion_inicial+" y "+posicion_final);
                }
            else if(t < vector[posicion_central]){
                posicion_final=posicion_central-1;}
                else 
                    {posicion_inicial=posicion_central+1;
                }
                    }
                        }
    
    public void Update(int t, int dato){
        if ((t < tamaño)&&(t > 0)){
            
            this.vector[t]=dato;
            } else
                {   System.out.println("El tamaño ingresado no es correcto");
            }
                }
    
    public void Borrar(int t){
         if ((t < tamaño)&&(t > 0)){
             this.vector[t]= null;
         }
         else { System.out.println("El tamaño ingresado no es correcto");
                }
                    }
    
    }