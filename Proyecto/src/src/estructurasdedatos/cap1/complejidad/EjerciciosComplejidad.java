/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 *
 * @author tusk
 */
public class EjerciciosComplejidad {
    
     public void ejecutarejerciciosccomplejos() {
        
        Scanner entrada = new Scanner(System.in);
        
        int respuesta;
              
        System.out.println("Menu ejercicio Complejoss");
        System.out.println("1. Complejidad O(1)  ");
        System.out.println("2. Complejidad O(n) ");
        System.out.println("3. Complejidd O(n^2)");
        System.out.println("4. Complejidad O(Log n) ");   
        
        respuesta = entrada.nextInt();
        
        switch(respuesta){
    
    
     case 1:       
        
            int a;
            int b;
            int c;
            a=10;
            b=2;
            c=a+b;
            System.out.println(c);        
        
        break;
    
     case 2:
        
            int n=100;
            boolean continuar = true;
            if(continuar){
                int i;
                for(i=0; i<=n; i++){
                System.out.println("numero "+ i);
                }
                }
        break;
        
        
     case 3:
         
            int numero = 0;
            System.out.println("ingrese numero de tablas: ");
            Scanner m=new Scanner(System.in);
            numero=m.nextInt();
            System.out.println("Tablas de Multiplicar: ");
                	
            for (int i=1; i<=numero; i++){                           
		for (int j=1;j<=10;j++){
                    System.out.println(i +" * " + j + " = "+ i*j);
                    } } 
         break;
         
         
         
     case 4:
            int x;
            System.out.println("ingrese numero a buscar: ");
            Scanner z=new Scanner(System.in);
            x=z.nextInt();
         int arreglo[]={1,2,3,4,5,6,7,8,9,10};
         
         int posicioninicial=0;
         int posicionfinal=arreglo.length-1;
         int posicioncentral;
         
         while(posicioninicial<=posicionfinal){
             posicioncentral =(posicionfinal+posicioninicial)/2;
             if(arreglo[posicioncentral] == x){
                 System.out.println("Dato encontrado entre las posiciones " +posicioninicial+ " y " +posicionfinal);
                 break;
             }else if(x < arreglo[posicioncentral]){
                 posicionfinal = posicioncentral-1;
                }else {
                    posicioninicial = posicioncentral+1;
             }}
        
        
        
        
        
        } //me cierra el switch
            }// me cierra el menu
         }// me cierra la clase
         
         
          