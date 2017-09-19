/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructurasdedatos.cap1.complejidad.Ciclos;
import estructurasdedatos.cap1.complejidad.Condicionales;
import estructurasdedatos.cap1.complejidad.EjerciciosComplejidad;
import estructurasdedatos.cap2.arreglos.Vector;
import estructurasdedatos.cap2.listas.ListaDoble;
import estructurasdedatos.cap2.listas.ListaSimple;

/**
 *
 * @author tusk
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ciclos ejerciciosciclos = new Ciclos();
          ejerciciosciclos.ejecutarejerciciosciclos();
        
               
        Condicionales ejercicioscondicionales = new Condicionales();
        ejercicioscondicionales.ejecutarejercicio5();
        ejercicioscondicionales.ejecutarejercicio6();
        ejercicioscondicionales.ejecutarejercicio7();
        */
        
       /* EjerciciosComplejidad ejerciciosccomplejos = new EjerciciosComplejidad();
          ejerciciosccomplejos.ejecutarejerciciosccomplejos();*/
       
       
       /*ListaSimple listasimple = new ListaSimple();
       listasimple.crearlistasimple();
       listasimple.insertar(6);
       listasimple.listar();
       listasimple.eliminar(6);
       listasimple.listar();*/
       
       
       ListaDoble listadoble = new ListaDoble();
       listadoble.crearlistadoble();
       listadoble.insertar(9);
       listadoble.insertar(4);
       listadoble.listar();
       //listadoble.eliminar(4);
       //listadoble.modificar(9);
       listadoble.listar();
       
       
        
    }
    
}