/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        //EJERCICIO 7 EXTRA
        /*
        int n,maximo,minimo,num,suma;
        double promedio;
        int i=0;
        maximo=0;
        minimo=0;
        suma=0;
        
        System.out.println("ingresa la cantidad de numeros");
        n=leer.nextInt();
        
        do {
            System.out.println("ingresa un numero");
            num=leer.nextInt();
            suma=suma+num;
            if (i==0) {
                maximo=num;
                minimo=num;
                
            }
            
            
            if (num>maximo) {
                maximo=num;
                
            }
            if (num<minimo) {
                minimo=num;
                
            }
            i++;
            
            
        } while (i<n);
        promedio=suma/n;
        
        System.out.println("la suma de los numeros es: " +suma);
        System.out.println("el promedio de los numeros ingresado es de: " +promedio );
        System.out.println("el numero maximo fue: " +maximo);
        System.out.println("el numero minimo fue: " +minimo);
         */
        //EJERCICIO 7 EXTRA OTRA FORMA
        /*
        int n,maximo,minimo,num,suma;
        double promedio;
        int i=0;
        maximo=0;
        minimo=0;
        suma=0;
        int aux;
        
        System.out.println("ingresa la cantidad de numeros");
        n=leer.nextInt();
        aux=n;
        
            
            
        while (n>0) { 
            System.out.println("ingresa un numero");
            num=leer.nextInt();
            suma=suma+num;
            if (n==aux) {
                maximo=num;
                minimo=num;
                
            }
            
            
            if (num>maximo) {
                maximo=num;
                
            }
            if (num<minimo) {
                minimo=num;
                
            }
            n--;
            
            
        }
        promedio=suma/aux;
        
        System.out.println("la suma de los numeros es: " +suma);
        System.out.println("el promedio de los numeros ingresado es de: " +promedio );
        System.out.println("el numero maximo fue: " +maximo);
        System.out.println("el numero minimo fue: " +minimo);
            
         */
        //EJERCICIO 8 EXTRA
        /*
        int num, pares, impares, i;
        pares = 0;
        impares = 0;
        i = 0;

        System.out.println("ingresa un numero");
        num = leer.nextInt();

        while (num % 5 != 0) {
            if (num >= 0) {

                if (num % 2 == 0) {
                    pares++;
                    i++;

                } else {
                    impares++;
                    i++;

                }
                
            }
            System.out.println("ingresa otro numero");
            num = leer.nextInt();

        }

        System.out.println("la cantidad de numeros ingresados es: " + i);
        System.out.println("la cantidad de numeros pares es: " + pares);
        System.out.println("la cantidad de numeros impares es: " + impares);
*/
        //EJERCICIO 9
        /*
        int divisor,dividendo,cosiente,residuo;
        cosiente=0;
        
        System.out.println("ingresa el numero dividendo");
        dividendo=leer.nextInt();
        System.out.println("ingresa el numero divisor");
        divisor=leer.nextInt();
        
        //50-13=37
        
        residuo=dividendo;
        do {
            residuo=residuo-divisor;
            cosiente++;
                        
        } while (residuo>=divisor);
        
        
        System.out.println("el residuo de la division es: " +residuo);
        System.out.println("el cosiente de la division es: " +cosiente);

        */
        
        
        
        //EJERCICIO 10
        /*
        int resultado,multi;
        int num1=(int)((Math.random()+0.1) * 10);
        int num2=(int)((Math.random()+0.1) * 10);
                
       multi = num1*num2;
        //System.out.println(num1);
        //System.out.println(num2);
        //System.out.println(multi);

        
        
        
        System.out.println("ingresa el resultado de la multiplicacion de los numeros ocultos, no mayor que 100");
        resultado=leer.nextInt();
        
        do {
            
            System.out.println("intenta nuevamente");
            resultado=leer.nextInt();
            
            if (resultado==multi) {
                System.out.println("felicidades has encontrado el resultado de la multiplicacion de los numeros " +num1 + " * " + num2);
                
                break;
                
            }
        } while (resultado!=multi);
        
*/
        
        //EJERCICIO 10
        
        long numero,contador;
        contador=0;
        System.out.println("ingresa un numero");
        numero=leer.nextLong();
        
        do {
            
            numero=numero/10;
            contador++;
            
            
        } while (numero!=0);
        
        System.out.println("la cantidad de digitos del numero ingresado es: " +contador);
        
        
        
        
        
    }

}
