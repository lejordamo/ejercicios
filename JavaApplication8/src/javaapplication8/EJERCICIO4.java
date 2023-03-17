/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author George
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];

        System.out.println("matriz 1");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = (int) (Math.random() * 10);
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

    }

}
