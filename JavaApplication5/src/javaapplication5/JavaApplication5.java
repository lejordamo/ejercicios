/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       /* int limite, num, i, suma;
        Scanner leer = new Scanner(System.in);
       
        suma = 0;
                
        
        System.out.println("Ingrese un límite");
        limite = leer.nextInt();
        
        do {
            System.out.println("ingresa un numero");
            num=leer.nextInt();
            if (num>0){
                
            suma=suma+num; 
                    }
            
                if (suma>limite) {
                System.out.println("Pasaste el limite");
                break;
                } else if (suma==limite){
                        System.out.println("Llegaste al limite");
                        break;
                        }
                
            
                               
        } while (suma<limite);
              
        System.out.println("La suma llegó al valor de: " +suma);
*/
       
        int num1,num2,menu;
       String salir="N";
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        
        do{
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Elija una opción");
        
        menu = leer.nextInt();
        
        switch(menu){
        
            case 1: 
                
              System.out.println("la suma de los numeros " + num1 + " y " + num2 + " es igual a " + (num1+num2));
              continue;
              
              case 2: 
                
              System.out.println("la resta de los numeros " + num1 + " y " + num2 + " es igual a " + (num1-num2));
              break;
        
        case 3: 
                
              System.out.println("la multiplicacion de los numeros " + num1 + " y " + num2 + " es igual a " + (num1*num2));
              break;
        
        case 4: 
                
              System.out.println("la division de los numeros " + num1 + " y " + num2 + " es igual a " + (num1/num2));
              break;
        
        case 5:
            
            System.out.println("Seguro desea salir?? S/N");
            salir=leer.next();
            break;
            
        default:
            System.out.println("ha ingresado una opcion invalida");
            
            
        
        
        
        }
        
        
       
        }while(menu!=5 || !salir.equalsIgnoreCase("S"));
       
       
       
    }
    
}
