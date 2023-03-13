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

        Scanner leer = new Scanner(System.in);
        // TODO code application logic here

        //EJERCICIO 5
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
        //ejercicio 6
        /*
       
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
       
         */
        //EJERCICIO 7
        /*String codigo;
       int incorrecto=-1;
       int correcto=0;

       
       
       do{
        System.out.println("ingresa la secuencia");
       codigo=leer.next();
       
       int longitud=codigo.length();
       
           if (codigo.length()>5 || codigo.length()<2) {
               incorrecto++;
               
               
           }else if (codigo.substring(0,1).equalsIgnoreCase("X") && (codigo.substring(longitud-1)).equalsIgnoreCase("O")) {
               
               correcto++;
           }else{
               incorrecto++;
           }
           
           
           
       
       }while(!codigo.equals("&&&&&"));
       
       
        System.out.println("la cantidad de secuencias correctas es de " + correcto);
        System.out.println("la cantidad de secuencias incorrectas es de " + incorrecto);
         */
        //EJERCICIO 8
        /* 
                int i;
		int j;
		int num;
		System.out.println("Ingrese un número positivo mayor que 0");
		num = leer.nextInt();
		for (i=1;i<=num;i++) {
			for (j=1;j<=num;j++) {
				if ((i!=1 && i!=num) && (j!=1 && j!=num)) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
         */
        //EJERCICIO 1 EXTRA
        /*
           int minutos,horas,dias;
           
           System.out.println("ingresa la cantidad de minutos");
           minutos=leer.nextInt();
           
           horas=Math.abs(minutos/60);
           dias=Math.abs(horas/24);
           
           
           do{
               horas=horas-24;
            
        }while(horas>=24);
           
           
           System.out.println("la cantidad de " + minutos + " minutos equivale a " + dias + " dias y " + horas + " horas");
           
         */
 /*EJERCICIO 2 EXTRA
           
           /*
           int a,b,c,d,aux;
           System.out.println("ingresa 4 valores");
           
           a= leer.nextInt();
           
           
           b= leer.nextInt();

           c= leer.nextInt();
           
           d= leer.nextInt();
           
           aux=b;
           b=c;
           c=a;
           a=d;
           d=aux;
           
           System.out.println("A es igual: " +a);
           System.out.println("B es igual: " +b);
           System.out.println("C es igual: " +c);
           System.out.println("D es igual: " +d);
           
         */
 /* EJERCICIO 3 EXTRA
 
            String vocal;
            
            System.out.println("ingresa una letra");
            vocal=leer.next();
            
            if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {
                
                System.out.println("has ingresado una vocal");
            }else   
                System.out.println("No has ingresado una vocal");
            
        }
 
         */
        //EJERCICIO 4 EXTRA
        /*
 int num;
 
        System.out.println("ingresa un numero");
        num = leer.nextInt();
        
        switch (num){
            
            case 1: 
                System.out.println("en romano es I" );
                break;
            case 2:
                System.out.println("en romano es II");
                break;
            case 3:
                System.out.println("en romano es III");
                break;
            case 4:
                System.out.println("en romano es IV");
                break;
            case 5:
                System.out.println("en romano es V");
                break;
            case 6:
                System.out.println("en romano es VI");
                break;
            case 7:
                System.out.println("en romano es VII");
                break;
            case 8:
                System.out.println("en romano es VIII");
                break;
            case 9:
                System.out.println("en romano es IX");
                break;
            case 10:
                System.out.println("en romano es X");
                break;
            default:
                System.out.println("has ingresado un numero incorrecto");
        }


         */
        //EJERCICIO 6 EXTRA
        /*
        char letra;
        double costo;

        System.out.println("ingresa el tipo de socio entra A y C");
        letra = leer.next().charAt(0);

        switch (letra) {
            case 'a':
                System.out.println("Socio A");
                System.out.println("Ingresa el costo del tratamiento");
                costo = leer.nextDouble();
                costo = costo - (costo * 0.5);
                System.out.println("Con el 50% de descuento el costo le queda en: " + costo);
                break;
            case 'A':
                System.out.println("Socio A");
                System.out.println("Ingresa el costo del tratamiento");
                costo = leer.nextDouble();
                costo = costo - (costo * 0.5);
                System.out.println("Con el 50% de descuento el costo le queda en: " + costo);
                break;

        
            case 'b':
                System.out.println("Socio B");
                System.out.println("Ingresa el costo del tratamiento");
                costo = leer.nextDouble();
                costo = costo - (costo * 0.35);
                System.out.println("Con el 35% de descuento el costo le queda en: " + costo);
                break;
            case 'B':
                System.out.println("Socio B");
                System.out.println("Ingresa el costo del tratamiento");
                costo = leer.nextDouble();
                costo = costo - (costo * 0.35);
                System.out.println("Con el 35% de descuento el costo le queda en: " + costo);
                break;
                
            case 'c':
                System.out.println("Socio C");
                System.out.println("Ingresa el costo del tratamiento");
                costo = leer.nextDouble();
                
                System.out.println("Como es un usuario pelabola,  el costo le queda en: " + costo);
                break;
            case 'C':
                System.out.println("Socio C");
                System.out.println("Ingresa el costo del tratamiento");
                costo = leer.nextDouble();
                
                System.out.println("Como es un usuario pelabola,  el costo le queda en: " + costo);
                break;

        }

*/
        /*
        //EJERCICIO 7 EXTRA
        double estatura, promedio_b,promedio_g,estatura_baja,estatura_g;
        estatura_baja=0;
        estatura_g=0;
        int personas,i;
        int personasbajas=0;
        i=0;
        
        System.out.println("ingresa la cantidad de personas a medir estatura");
        personas=leer.nextInt();
        do {
            System.out.println("ingresa de la persona " +(i+1));
            
            estatura=leer.nextDouble();
           
            if (estatura<=1.6) {
                estatura_baja+=estatura;
                personasbajas++;
            }
              
            estatura_g+=estatura;
            
            i++;
        } while (i<personas);
        
 promedio_b=estatura_baja/personasbajas;
 promedio_g=estatura_g/personas;
 
        System.out.println("el promedio de estatura de los enanos es de: " +promedio_b);
        System.out.println("el promedio de estatura de las personas ingresadas: " +promedio_g);
        
        
        */

    }

}
