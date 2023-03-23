/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;
import javaapplication9.entidades.Circunferencia;

/**
 *
 * @author George
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        
        Circunferencia c1 = new Circunferencia(10);
        System.out.println("el area de la circunferencia original con radio " + c1.getRadio() + " es : " +c1.area());
        System.out.println("el perimetro de la circunferencia original con radio " + c1.getRadio() + " es : " +c1.perimetro());
        
        
        System.out.println("ingrese el nuevo radio: "); 
        crearCircunferencia(c1);
        
        System.out.println("el area de la circunferencia es: "+ c1.area());
        System.out.println("el perimetro de la circunferencia es: "+ c1.perimetro());
        
                
    }
    
    public static void crearCircunferencia(Circunferencia c1){
        Scanner leer = new Scanner(System.in);
        
        c1.setRadio(leer.nextDouble());
      
      
        
    } 
    
    
    
    
    
    
}
