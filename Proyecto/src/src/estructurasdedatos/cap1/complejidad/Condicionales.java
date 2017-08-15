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
public class Condicionales {
    
    
    public void ejecutarejercicio5() {
        System.out.println("ejercicios 1 condicionales ");
        System.out.println("13.  Que pida dos números y muestre todos los números impares que van desde el primero al segundo. Se debe controlar que los valores son correctos");
        int numero1, numero2, x;
        System.out.println("Digite el primer numero");
        Scanner S = new Scanner(System.in);
        numero1= S.nextInt();
        System.out.println("Digite el primer numero");
        Scanner A = new Scanner(System.in);
        numero2= A.nextInt();       
        	if (numero1 > numero2)
            { 	System.out.println("Los valores digitados no son correctos ");
            }
        	else
        	{  for (x = numero1; x <= numero2; x++)
	    	{  if(x %2!= 0)
                {   	System.out.println("Los numeros impares son: " +x);
        }}}   }
    
    public void ejecutarejercicio6(){
        System.out.println("ejercicios 2 condicionales ");
        System.out.println("12.  Que pida dos números y muestre todos los números pares que van desde el primero al segundo. Se debe controlar que los valores son correctos");
        int numero1, numero2, x;
        System.out.println("Digite el primer numero");
        Scanner S = new Scanner(System.in);
    
        numero1= S.nextInt();
        System.out.println("Digite el primer numero");
        Scanner A = new Scanner(System.in);
        numero2= A.nextInt();       
        	if (numero1 > numero2)
            { System.out.println("Los valores digitados no son correctos ");
                }
        	else
        	{ 	for (x = numero1; x <= numero2; x++)
	    	{       if(x %2 == 0)
                {     	System.out.println("Los numeros pares son: " +x);
        }}}
    }
    
    public void ejecutarejercicio7(){
        System.out.println("ejercicios 3 condicionales ");
        System.out.println("14.  Que pida dos números y sume todos los números que van desde el primero al segundo. Se debe controlar que los valores son correctos");
        int numero1, numero2, x, suma=0;
        System.out.println("Ingrese primer numero");
        Scanner S = new Scanner(System.in);
        numero1= S.nextInt();
        System.out.println("Ingrese segundo numero");
        Scanner A = new Scanner(System.in);
        numero2= A.nextInt();       
        	if (numero1 > numero2)
            {  	System.out.println("Los valores introducidos no son correctos ");
            }
        	else
        	{  	for (x = numero1; x <= numero2; x++)
	    	{       suma=suma+x;
                {     	System.out.println("La suma de los numeros es: " +suma);
        }}}
    }
    
}
