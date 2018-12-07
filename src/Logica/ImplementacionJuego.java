/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.awt.Graphics;
/**
 *
 * @author DELL
 */
public class ImplementacionJuego {
    
    
    
    
    public boolean ganar(){
        
        
      return true;  
    }
    
    public boolean perder(){
        
        
      return true;  
    }
    
    public void seguir_jugando(){
        
    }
    
    public void cambiar_fondo_Distractor(){
        
    }
    
    public static void main(String[] args) {
        GloboIzq globoizq = new GloboIzq();
        System.out.println(globoizq.aleatorio());
        System.out.println(globoizq.aleatorio());
        System.out.println(globoizq.aleatorio());
        System.out.println(globoizq.aleatorio());
        System.out.println(globoizq.aleatorio());
        System.out.println(globoizq.aleatorio());
    }
}
