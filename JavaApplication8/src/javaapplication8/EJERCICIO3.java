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
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;

        int[] vector = new int[50];

        for (int i = 0; i < vector.length; i++) {

            vector[i] = (int) (Math.random() * 1000);

        }

        for (int i = 0; i < vector.length; i++) {

            int numero = vector[i];
            do {

                numero = numero / 10;
                contador++;

            } while (numero != 0);
            //System.out.println("digitos " + contador);

            switch (contador) {

                case 1:
                    digito1++;
                    break;
                case 2:
                    digito2++;
                    break;
                case 3:
                    digito3++;
                    break;

            }

            contador = 0;

        }

        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i]);

        }

        System.out.println("El vector tiene " + digito1 + " numero de 1 digito");
        System.out.println("El vector tiene " + digito2 + " numeros de 2 digitos");
        System.out.println("El vector tiene " + digito3 + " numeros de 3 digitos");

    }

}
