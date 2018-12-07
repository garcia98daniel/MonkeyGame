/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class GloboIzq {
    
    int valor;
    int posicionGloboX;
    int posicionGloboY;
    ImageIcon globo0 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo0.png")).getImage());
    ImageIcon globo1 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo1.png")).getImage());
    ImageIcon globo2 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo2.png")).getImage());
    ImageIcon globo3 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo3.png")).getImage());
    ImageIcon globo4 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo4.png")).getImage());
    ImageIcon globo5 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo5.png")).getImage());
    ImageIcon globo6 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo6.png")).getImage());
    ImageIcon globo7 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo7.png")).getImage());
    ImageIcon globo8 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo8.png")).getImage());
    ImageIcon globo9 = new ImageIcon(new ImageIcon(getClass().getResource("/MonkeyPlusImagenes/globo9.png")).getImage());

    
    public GloboIzq(){
        valor = 0;
        posicionGloboX = 0;
        posicionGloboY = 0;
    }
    
    
    public void generar_globo(Graphics g){
         valor = aleatorio();
         
         switch(valor){
             case 0:
                 cargargloboizq(g, globo0);
                 break;
             case 1:
                 cargargloboizq(g, globo1);
                 break;
             case 2:
                 cargargloboizq(g, globo2);
                 break;
             case 3:
                 cargargloboizq(g, globo3);
                 break;
             case 4:
                 cargargloboizq(g, globo4);
                 break;
             case 5:
                 cargargloboizq(g, globo5);
                 break;
             case 6:
                 cargargloboizq(g, globo6);
                 break;
             case 7:
                 cargargloboizq(g, globo7);
                 break;
             case 8:
                 cargargloboizq(g, globo8);
                 break;
             case 9:
                 cargargloboizq(g, globo9);
                 break;
            }
    }
    
    public void cargargloboizq(Graphics g,ImageIcon globo) {
        g.drawImage(globo.getImage(), 0, 0, 119, 118, null);
    }
    
    public int aleatorio(){
        return (int) (Math.random()*10);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPosicionGloboX() {
        return posicionGloboX;
    }

    public void setPosicionGloboX(int posicionGloboX) {
        this.posicionGloboX = posicionGloboX;
    }

    public int getPosicionGloboY() {
        return posicionGloboY;
    }

    public void setPosicionGloboY(int posicionGloboY) {
        this.posicionGloboY = posicionGloboY;
    }

    
    
}
