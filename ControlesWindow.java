/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linea;

/**
 *Setear controles
 * arriba, abajo, derecha, izquierda
 * @author he_fa
 */
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
public class ControlesWindow extends JFrame implements KeyListener{
   
    boolean isSet; // el objetivo de esta clase es establecer los conttroles
    boolean up, down, right, left; 
    char[] controles = new char[4]; 
    
    public void keyPressed(KeyEvent e){
        
    }
    public void keyReleased(KeyEvent e){
        
    }
    public void keyTyped(KeyEvent e){
        if(!isSet){            
            char key = e.getKeyChar();
            if(!up){
                controles[0] = key;
                up = true;
                System.out.println("Arriba establecido");
            }
            else if(!down){
                controles[1] = key;
                down = true;
                System.out.println("Abajo establecido");
            }
            else if(!right){
                controles[2] = key;
                right = true;
                System.out.println("Derecha establecido");
            }
            else if(!left){
                controles[3] = key;
                left = true;
                System.out.println("Izquierda establecido");
            }
            else{
                isSet = true;
                System.out.println("Controles establecidos");
            }
        }
        else{
            System.out.println("Fin");
        }
    }
   
    public ControlesWindow(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setVisible(true);
        this.addKeyListener(this);
        
        isSet = false;
        
        up    = false;
        down  = false;
        right = false;
        left  = false;
        
        controles[0] ='w'; 
        controles[1]= 's'; 
        controles[2]= 'a'; 
        controles[3]= 'd';
        
        this.setSize(400,400);
        
    }     
    
    public static void main(String... args){
     ControlesWindow ventana = new ControlesWindow();
     
     System.out.println("Controles end");
        
    }
       
}
