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
public class Matriz {
    
    //declarar las variables//
    private int nfilas;
    private int ncolumnas;
    private int matriz[][];
    
    //se le implementa en la estructura matriz//
    public Matriz(int nfilas, int ncolumnas){
        this.nfilas = nfilas;
        this.ncolumnas = ncolumnas;
        this.matriz = new int [nfilas][ncolumnas];
        }
    //se incorporan los datos dentro de la matriz//
    public void Insertar(int fi, int co, int dato){
        if((fi < nfilas)&& (co < ncolumnas)){
            this.matriz[fi][co]=dato;}
        else { System.out.println("Numero Filas o Columnas es mayor que la matriz");
        }
            }
    
    
    
    //  para listar la matriz//
    public void Mostrar(){
        for(int fi=0; fi < nfilas; fi++){
            for(int co=0; co < ncolumnas; co++){
                System.out.println(this.matriz[fi][co]);
                }
                    }
                        }
    // para buscar un dato//
    public int Buscar(int dato){

        for (int fi = 0; fi < matriz.length; fi++) {   
            for (int co = 0; co < matriz.length; co++) {  
                if (this.matriz[fi][co] == dato) {       
                    System.out.println("el dato se encuenta en la posicion: " + fi+ "," + co);
               }
                }
                    }
        return 0;
                        }
    
    public void Update(int fi, int co, int dato){
        if((fi < nfilas)&&(co <  ncolumnas)){
            this.matriz[fi][co]= dato;}
        else {
            System.out.println("Numero Filas o Columnas es mayor que la matriz");
            }         
            }
    //eliminar algun dato de la matriz//
    public void Borrar(int fi, int co){
       this.nfilas = fi;
        this.ncolumnas = co;
        this.matriz[fi][co] = 0;
    
    
    }
                    
    
    
    
    
    
    
}