/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author George
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre= "Jorge";
        int edad = 33;
        double sueldo= 10000000.99;
        String apellido= "Monasterio";
        int telefono = 1155532322;
        String direccion= "CABA";
        boolean trabajador = true;
                
        
        int num1 = 5;
	int num2 = 5;
    
	int suma = num1 + num2;
    
	double division = num1 / num2;
    
	boolean logico = num2 < num1;
    
	//num1++;


             
               Scanner leer = new Scanner(System.in);
        
        //System.out.println("hola mundo"); //este es mi primer hola mundo
        System.out.println("La suma de los numeros " + num1 + " y " + num2 + " es: " + suma);
        System.out.println(division);
        System.out.println(logico);
        System.out.println("Ingresa tu nombre: ");        
        nombre=leer.next();
        System.out.println("Hola mi nombre es " +nombre);
        System.out.println("y tengo " +edad + " años de edad");
        
        
        nombre= nombre.replace('e', 'i');
        
        System.out.println(nombre);
        
        int longitud =nombre.length();
        
        System.out.println(longitud);
        
        
        
    }
    
}
