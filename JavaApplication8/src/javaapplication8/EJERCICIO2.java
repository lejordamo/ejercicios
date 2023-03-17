/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int[] vector= new int[100];
        int contador=0;
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]=(int)(Math.random()*10);
                        
        }
        
        System.out.println("ingresa un numero a buscar");
        int num=leer.nextInt();
        
        
        
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i]==num) {
              contador++;
                System.out.println("el numero se encuentra en la posicion " + i + " del arreglo" );
                
            }
            
                  
        }
        if (contador>1) {
                System.out.println("el numero se encuentra repetido " + contador + " veces");
                
            }
        
        
        
    }
    
}
