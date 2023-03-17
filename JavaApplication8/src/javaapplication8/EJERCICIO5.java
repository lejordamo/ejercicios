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
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO DO code application logic here
        Scanner leer= new Scanner(System.in);
        int contador=0;
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];

       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              
                matriz[i][j]=leer.nextInt();
               }

           
        }
        
        
        
         System.out.println("matriz 1");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                //matriz[i][j] = (int) (Math.random() * 10);
                //matriz[i][j]=leer.nextInt();
                System.out.print("[" + matriz[i][j] + "]");

            }

            System.out.println("");
        }
        
        
        
        
        System.out.println("matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {

                matriz2[i][j] = matriz[j][i];
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
        
        
        for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz.length; j++) {
                   
                   if (matriz[i][j]==matriz2[i][j]*-1) {
                       contador++;
                       
                   }
                
            }
            
        }
        if (contador==matriz.length*matriz2.length) {
            System.out.println("la matriz es antisimetrica");
            
        }else{
            System.out.println("la matriz no es antisimetrica");
        }
        
        
     
    }
    
}
