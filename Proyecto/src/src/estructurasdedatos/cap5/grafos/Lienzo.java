/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;


import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Maku
 */
public class Lienzo extends JPanel implements MouseListener {
     private Vector<NodoGrafo> vectorNodos;                     //vector que contiene los nodos que se crean en el lienzo
     private Vector<Enlace> vectorEnlace;
     private Point p1, p2;
     
     public Lienzo(){
     this.vectorNodos = new  Vector<>();
     this.vectorEnlace = new Vector<>();
     this.addMouseListener(this); 
     }
     
     public void paint(Graphics g){
        for(NodoGrafo nodos : vectorNodos){
            nodos.pintar(g);
        } 
        for(Enlace enlace : vectorEnlace){
            enlace.pintar(g);
         
     }
     }
     
     
     
     
    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getButton()==MouseEvent.BUTTON1){
            String nombre = JOptionPane.showInputDialog("Ingrese nombre nodo");
            this.vectorNodos.add(new NodoGrafo(me.getX(), me.getY(), nombre));
            repaint();   
    }   
        if(me.getButton()==MouseEvent.BUTTON3){
            for(NodoGrafo nodo : vectorNodos){
                if(new Rectangle(nodo.getX()-NodoGrafo.d/2, nodo.getY()-NodoGrafo.d/2, NodoGrafo.d, NodoGrafo.d).contains(me.getPoint())){
                    if(p1==null)
                        p1 = new Point(nodo.getX(), nodo.getY());
                    else{
                        p2 = new Point(nodo.getX(), nodo.getY());
                        String nombre = JOptionPane.showInputDialog("Ingrese nombre nodo");
                        this.vectorEnlace.add(new Enlace(p1.x, p1.y, p2.x, p2.y, nombre));
                        repaint();
                        p1 = null;
                        p2 = null;
                    }
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
    
    
    
    
    
}
