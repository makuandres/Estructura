/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap3.mapas;

/**
 *
 * @author tusk
 */
public class TablaHash {
    
    private Mapa[] TablaHash;
    private Mapa informacion;
    private int tamaño;
    
    
    public void crearVector(int t){
        this.tamaño = tamaño;
        this.TablaHash = new Mapa[tamaño];
        }
 
    public boolean insertar(int llave, String valor) {
        Mapa nuevo = new Mapa();
        nuevo.setllave(llave);
        nuevo.setvalor(valor);
        int posicion = this.operaciohash(llave);
        this.TablaHash[posicion] = nuevo;
        return true;
    }
    
    
    public int operaciohash(int valor) {
        int vectortamaño[] = new int[10];
        int numero = valor;
        int posicion;
        for (int i = 0; i < 10; i++) {
            int resta = numero % 10;
            numero = numero / 10;
            vectortamaño[i] = resta;}
        posicion = vectortamaño[0] + vectortamaño[1] + vectortamaño[2];
        posicion = posicion * posicion;
        if (this.TablaHash[posicion] == null) {
            return posicion;
        } 
        else {
            while (this.TablaHash[posicion] != null) {
                if (posicion < this.tamaño) {
                    posicion = posicion + 1;
                } else {
                    posicion = 0;
                }
            }
            return posicion;
        }
    }

    
    public void buscar(int informacion) {
        if (TablaHash[1].getllave() == informacion) {
            System.out.println("El valor " + informacion + " esta en la posicion " + "1");
        } else {
            int i = 0;
            while (i < tamaño) {
                if (TablaHash[1].getllave() == informacion) { 
                    System.out.println("el dato" + informacion + "esta en la posicion " + i);    
                }
                i++;
            }
        }
    }

    
    public void listar() {
        for (int i = 0; i < tamaño; i++) {
            if (this.TablaHash[i] != null) {
                System.out.println("La informacion " + this.TablaHash[i].getllave() + " esta en la posicion " + i + " de la Tabla");                        
            }
        }
    }   

    
    public void borrarposicion(int posicion) {
        TablaHash[posicion] = null;
        System.out.println("La informacion en la " + posicion + " ha sido borrado");
    }

}