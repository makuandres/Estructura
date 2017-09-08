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
    
    
    private int nfilas;
    private int ncolumnas;
    private int matriz[][];
    
    
    public Matriz(int nfilas, int ncolumnas){
        this.nfilas = nfilas;
        this.ncolumnas = ncolumnas;
        this.matriz = new int [nfilas][ncolumnas];
        }
    
    public void Insertar(int fi, int co, int dato){
        if((fi < nfilas)&& (co < ncolumnas)){
            this.matriz[fi][co]=dato;}
        else { System.out.println("Numero Filas o Columnas es mayor que la matriz");
        }
            }
    
    
    
    
    public void Mostrar(){
        for(int fi=0; fi < nfilas; fi++){
            for(int co=0; co < ncolumnas; co++){
                System.out.println(this.matriz[fi][co]);
                }
                    }
                        }
    
    public int Buscar(int fi, int co){
        if((fi < nfilas)&&(co <  ncolumnas)){
            return this.matriz[fi][co];}
        else { System.out.println("Numero Filas o Columnas es mayor que la matriz");
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
    
    public void Borrar(int fi, int co){
       if((fi < nfilas)&&(co <  ncolumnas)){
           this.matriz[fi][co]=null;}
       else {
            System.out.println("Numero Filas o Columnas es mayor que la matriz");
        }
            }
    
    
    }
                    
    
    
    
    
    
    
