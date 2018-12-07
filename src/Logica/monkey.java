/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author CAMILO ANDRES
 */
public class monkey {
    int x;
    int y;
    int moneda;
    int puntaje;
    
    JPanel MiJP;
    ImageIcon monoD1 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoD1.png")).getImage());
    ImageIcon monoD2 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoD2.png")).getImage());
    ImageIcon monoD3 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoD3.png")).getImage());
    ImageIcon monoD4 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoD4.png")).getImage());
    ImageIcon monoD5 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoD5.png")).getImage());
    ImageIcon monoD6 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoD6.png")).getImage());
    ImageIcon monoD7 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoD7.png")).getImage());
    ImageIcon monoD8 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoD8.png")).getImage());
    
    ImageIcon monoI1 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoI1.png")).getImage());
    ImageIcon monoI2 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoI2.png")).getImage());
    ImageIcon monoI3 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoI3.png")).getImage());
    ImageIcon monoI4 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoI4.png")).getImage());
    ImageIcon monoI5 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoI5.png")).getImage());
    ImageIcon monoI6 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoI6.png")).getImage());
    ImageIcon monoI7 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoI7.png")).getImage());
    ImageIcon monoI8 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoI8.png")).getImage());
    
    ImageIcon monosemiarriba = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoInicio1.png")).getImage());
    ImageIcon monoarriba = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoInicio3.png")).getImage());
    ImageIcon monocruzado = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/monoInicio2.png")).getImage());
    public monkey(JPanel MiJ){
        this.x=400;
        this.y=330;
        this.MiJP=MiJ;
    }
    
    public void Dibujar_monkey(Graphics g, int xi, int yi, int monoimagen){
        this.x=xi;
        this.y=yi;
        this.MiJP.update(g);
        elegirImagen(g,monoimagen,xi,yi);
       // ImageIcon MiImagen = new ImageIcon(Direccion);
       // g.drawImage(monoimagen.getImage(), xi, yi, MiJP);
        
    }
    
    public void elegirImagen(Graphics g,int monoimagen,int xi,int yi){
        
        switch(monoimagen){
            case 1:g.drawImage(monoD1.getImage(), xi, yi, 80, 118, null);
                break;
            case 2:g.drawImage(monoD2.getImage(), xi, yi, 80, 118, null);
                break;
            case 3:g.drawImage(monoD3.getImage(), xi, yi, 80, 118, null);
                break;
            case 4:g.drawImage(monoD4.getImage(), xi, yi, 80, 118, null);
                break;
            case 5:g.drawImage(monoD5.getImage(), xi, yi, 80, 118, null);
                break;
            case 6:g.drawImage(monoD6.getImage(), xi, yi, 80, 118, null);
                break;
            case 7:g.drawImage(monoD7.getImage(), xi, yi, 80, 118, null);
                break;
            case 8:g.drawImage(monoD8.getImage(), xi, yi, 80, 118, null);
                break;
                
                
                
            case 9:g.drawImage(monoI1.getImage(), xi, yi, 80, 118, null);
                break;
            case 10:g.drawImage(monoI2.getImage(), xi, yi, 80, 118, null);
                break;
            case 11:g.drawImage(monoI3.getImage(), xi, yi, 80, 118, null);
                break;
            case 12:g.drawImage(monoI4.getImage(), xi, yi, 80, 118, null);
                break;
            case 13:g.drawImage(monoI5.getImage(), xi, yi, 80, 118, null);
                break;
            case 14:g.drawImage(monoI6.getImage(), xi, yi, 80, 118, null);
                break;
            case 15:g.drawImage(monoI7.getImage(), xi, yi, 80, 118, null);
                break;
            case 16:g.drawImage(monoI8.getImage(), xi, yi, 80, 118, null);
                break;
            
             
            case 17:g.drawImage(monoarriba.getImage(), xi, yi, 80, 118, null);
                break;
        }
    }
    
    
    public int cordX(){
        return this.x;
    }
    
    public int cordY(){
        return this.y;
    }
    
        public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
