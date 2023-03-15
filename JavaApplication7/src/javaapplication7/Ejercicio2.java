/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class Ejercicio2 {
    Scanner leer= new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        mostrar();
        
    }
    
    public static void mostrar(){
        Scanner leer= new Scanner(System.in);
        
        System.out.println("ingresa la cantidad de personas");
        int n=leer.nextInt();
        int edad;
        String nombre,respuesta="Si";
        
        do {
            System.out.println("ingresa un nombre");
            nombre=leer.next();
            System.out.println("ingresa la edad");
            edad=leer.nextInt();
            
            if (edad>=18) {
                
                System.out.println(nombre + " es mayor de edad");
            }else{
                 System.out.println(nombre + " es menor de edad");
        
        }
            do {
                System.out.println("desea continuar?");
            respuesta=leer.next();
                
            } while (!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No"));
            
  
            
            
            
            n--;
        } while (n>0 && !respuesta.equalsIgnoreCase("No") );
        
       
        
        
        
        
    }
    
}
