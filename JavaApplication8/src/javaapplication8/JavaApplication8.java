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
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    //EJERCICIO 13 GUIA 5 MEJORADO
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingresa la dimension del arreglo");
        int n=leer.nextInt();
        
        String[] equipo= new String[n];
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("ingresa una nombre");
            
            equipo[i]=leer.next();
            
        }
        
        for (String elemento: equipo) {
            System.out.println("los nombres ingresados son: "+ elemento);
        }
        
    }
    
}
