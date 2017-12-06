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
public class Enlace {
    private int x1, x2, y1, y2;                 //coordenadas de lineas para unir los nodos
    private String nombre;
    
    public Enlace(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.nombre = nombre;
    }

    Enlace(int x, int y, int x0, int y0, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      void pintar(Graphics g)   {                                           //metodo para dibujar las lineas
    g.drawLine(x1, x2, y1, y2);
    if(x1 > x2 && y1 > y2){
        g.drawString(nombre, x1 - Math.abs((x1 - x2)/2), y1 - Math.abs((y1 - y2)/2));
    }
    if(x1 < x2 && y1 < y2){
        g.drawString(nombre, x1 - Math.abs((x1 - x2)/2), y1 - Math.abs((y1 - y2)/2));
    }    
    if(x1 > x2 && y1 < y2){
        g.drawString(nombre, x1 - Math.abs((x1 - x2)/2), y2 - Math.abs((y1 - y2)/2));
    }
    if(x1 < x2 && y1 > y2){
        g.drawString(nombre, x2 - Math.abs((x1 - x2)/2), y1 - Math.abs((y1 - y2)/2));
    }
}

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
