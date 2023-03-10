/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosDia1;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class EjerciciosDia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        //int num1,num2,suma;
        //String nombre;
        //String frase;
        Scanner leer = new Scanner(System.in);
        //ejercicio 1
        System.out.println("ingresa el numero 1");
        num1= leer.nextInt();
        System.out.println("ingresa el numero 2");
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los numeros " + num1 + " y " + num2 + " es: " + suma);
      
        //ejercicio 2
        /*System.out.println("Ingresa tu nombre: ");        
        nombre=leer.nextLine();
        System.out.println("Hola mi nombre es " +nombre);
         */
        //ejercicio 3
        /*System.out.println("Ingresa una frase");   
        frase= leer.nextLine();
        
        System.out.println("La frase en mayusculas es: " + frase.toUpperCase());

        System.out.println("La frase en minusculas es: " + frase.toLowerCase());
        
         */

        //ejercicio4
        /*
        double tempC,tempF;
        
        System.out.println("Cuanto es la temperatura en CABA") ;
        tempC= leer.nextDouble();
        tempF= 32 + (9 * tempC / 5);
         System.out.println("La temperatura en CABA en F es: " + tempF);  
         */
        //ejercicio5
        /* double numero;
        System.out.println("Ingresa un numero");   
        numero=leer.nextDouble();
        
        System.out.println("El doble del numero " + numero + " es: " +numero*2);
        System.out.println("El triple del numero " + numero + " es: " +numero*3);
        System.out.println("La raiz cuadrada del numero " + numero + " es: " +Math.sqrt(numero));
       */
        
    }

}
