/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

/**
 *
 * @author tusk
 */
public class ColaPrioritaria {
   
    private Cola colanormal;
    private Cola colaempresarial;
    private Cola colaprioritaria;

   
    public void crearcolas() {
        this.colanormal = new Cola();
        this.colaempresarial = new Cola();
        this.colaprioritaria = new Cola();
    }
    
    
    public void hacercola(int prioridad, int cedula) {
            if (prioridad == 0) {
            if (colanormal.size() < colaempresarial.size()) {
                this.colanormal.encolar(cedula);             
            } else {
                this.colaempresarial.encolar(cedula);
            }
        } else {
            if (prioridad ==1){
                this.colaprioritaria.encolar(cedula);
             }
        }

    }

    
    public void listar() {
        System.out.println("la cola Normal es: ");
        colanormal.listar();
        System.out.println("\n");
        System.out.println("la cola Empresarial es: ");
        colaempresarial.listar();
        System.out.println("\n");
        System.out.println("la cola Prioritaria es: ");
        colaprioritaria.listar();

    }
    
    
    public void atender() { 
        for (int i = 0; i <= colaprioritaria.size(); i++) {
            colaprioritaria.desencolar();}
        if (colaprioritaria.size() == 0) {
            colanormal.desencolar();
            colaempresarial.desencolar();
            
        }
    }
}