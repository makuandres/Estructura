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
        
            int a;                                  // O(1)
            int b;                                  // O(1)
            int c;                                  // O(1)
            a=10;                                   // O(1)
            b=2;                                    // O(1)
            c=a+b;                                  // O(1)
            System.out.println(c);                  // O(1)
        
        break;
    
     case 2:
        
            int n=100;                              // O(1)                     
            boolean continuar = true;               // O(1)
            if(continuar){                          // O(1)
                int i;                              // O(1)
                for(i=0; i<=n; i++){                // O(n)
                System.out.println("numero "+ i);   // O(n)
                }
                }
        break;
        
        
     case 3:
         
            int numero = 0;                                         // O(1)
            System.out.println("ingrese numero de tablas: ");       // O(1)
            Scanner m=new Scanner(System.in);                       // O(1)
            numero=m.nextInt();                                     // O(1)
            System.out.println("Tablas de Multiplicar: ");          // O(1)
                	
            for (int i=1; i<=numero; i++){                          // O(n) 
		for (int j=1;j<=10;j++){                            // O(n)
                    System.out.println(i +" * " + j + " = "+ i*j);  // O(n)
                    } } 
         break;
         
         
         
     case 4:
            int x;                                                                                                      // O(1)       
            System.out.println("ingrese numero a buscar: ");                                                            // O(1)
            Scanner z=new Scanner(System.in);                                                                           // O(1)
            x=z.nextInt();                                                                                              // O(1)
         int arreglo[]={1,2,3,4,5,6,7,8,9,10};                                                                          // O(1)
         
         int posicioninicial=0;                                                                                         // O(1)
         int posicionfinal=arreglo.length-1;                                                                            // O(1)
         int posicioncentral;                                                                                           // O(1)
            
         while(posicioninicial<=posicionfinal){                                                                         // O(n)
             posicioncentral =(posicionfinal+posicioninicial)/2;                                                        // O(n)
             if(arreglo[posicioncentral] == x){                                                                         // O(n)
                 System.out.println("Dato encontrado entre las posiciones " +posicioninicial+ " y " +posicionfinal);    // O(n)
                 break;
             }else if(x < arreglo[posicioncentral]){                                                                    // O(n)
                 posicionfinal = posicioncentral-1;                                                                     // O(1)
                }else {
                    posicioninicial = posicioncentral+1;                                                                // O(n)
             }}
        
        
        
        
        
        } //me cierra el switch
            }// me cierra el menu
         }// me cierra la clase