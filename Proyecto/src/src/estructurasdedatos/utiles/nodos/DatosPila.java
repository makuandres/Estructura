/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author Maku
 */
public class DatosPila {

    private String nombre;
    private String cedula;
    
    

    public DatosPila(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
         
    }

    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaa() {
        return cedula;
    }

     public void setcedula(String cedula) {
        this.cedula = cedula;
    }

    
    }
