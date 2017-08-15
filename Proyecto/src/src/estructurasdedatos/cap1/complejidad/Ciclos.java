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
public class Ciclos {
    
    public void ejecutarejercicio1() {
    //ejercicio 19   
        System.out.println("19.  Que muestre la tabla de multiplicar de un número cualquiera ");
        int numero = 0;
        System.out.println("Introduzca un numero: ");
        Scanner n=new Scanner(System.in);
        numero=n.nextInt();
     
        for(int x = 1; x <= 10; x++) 
        { System.out.println(numero +" * " + x + " = "+ numero*x); 
        } }
    
    public void ejecutarejercicio2(){ 
        
        System.out.println("24.  Que calcule la suma de los cuadrados de los 100 primeros números "); 
        int suma = 0; 
        for(int i = 0; i < 50; i++) { 
        suma = suma + i * i; } 
        { System.out.println("la suma de los cuadrados de los 100 primeros números es:"+suma); 
                }}

    public void ejecutarejercicio3(){
            Scanner n=new Scanner(System.in);
            System.out.println("23.  Que calcule la media de X números, se dejarán de solicitar números hasta que se introduzca el cero ");
            int num,suma2,elementos;
            float media;
            
            System.out.println("Introduzca un numero: ");
            num=n.nextInt();
       
            suma2=0;
            elementos=0;
       
            while(num>0){
           
            suma2+=num;
            elementos++;
           
            System.out.println("Introduzca otro numero: ");
            num=n.nextInt();
            }
            if(elementos==0){
           
           System.out.println("Imposible hacer la media");
           
            }
            else{
           media=(float)suma2/elementos;
           System.out.println("La media es de: "+media);
            }}

    public void ejecutarejercicio4(){
        System.out.println("21. Que calcule el factorial de un número cualquiera y lo muestre en pantalla. ");
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero3=leer.nextInt();
        int factorial=1;
        while(numero3 !=0)
        {   factorial*=numero3;
            numero3 --;
        }
        System.out.println("el factorial es: "+ factorial); }


}
