/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

import java.awt.Graphics;

/**
 *
 * @author Maku
 */
public class NodoGrafo {
    private int x,y;                    //coordenadas del vertica
    private String nombre;
    public static final int d= 60;      //diametro circulo

    public NodoGrafo(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }
    
    public void pintar(Graphics g)  {                      //graficar vertices en el lienzo
    g.drawOval(this.x - d/2, this.y - d/2, d, d);          //pintar las coordenadas
    g.drawString(nombre,x,y);
    
    
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
