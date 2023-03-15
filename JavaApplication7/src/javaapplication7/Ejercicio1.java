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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int opcion, num1, num2;
        double num3,num4;

        do {

            System.out.println("ingresa una opcion");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("ingresa dos numeros");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    sumar(num1, num2);

                    break;

                case 2:
                    System.out.println("ingresa dos numeros");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    restar(num1, num2);
                    break;
                case 3:
                    System.out.println("ingresa dos numeros");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    multiplicar(num1, num2);
                    break;
                case 4:
                    System.out.println("ingresa dos numeros");
                    num3 = leer.nextDouble();
                    num4 = leer.nextDouble();
                    dividir(num3,num4);
                    break;

                case 5:
                    System.out.println("Saludos");
                    break;

                default:
                    System.out.println("intenta nuevamente");

            }

        } while (opcion != 5);

    }

    public static void sumar(int num1, int num2) {

        int resultado;

        resultado = num1 + num2;
        System.out.println("La suma de los numeros ingresados es: " + resultado);

    }

    public static void restar(int num1, int num2) {

        int resultado;

        resultado = num1 - num2;
        System.out.println("La resta de los numeros ingresados es: " + resultado);

    }

    public static void multiplicar(int num1, int num2) {

        int resultado;

        resultado = num1 * num2;
        System.out.println("La multiplicacion de los numeros ingresados es: " + resultado);

    }

    public static void dividir(double num1, double num2) {

        double resultado;

        resultado = num1 / num2;
        System.out.println("La division de los numeros ingresados es: " + resultado);

    }

}
