/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;
import javaapplication9.entidades.Libro;

/**
 *
 * @author George
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Libro l1 = new Libro();

        llenar_libro(l1, leer);

    }

    public static void llenar_libro(Libro libro, Scanner leer) {

        System.out.print("Ingresa el ISBN: ");
        libro.ISBN = leer.nextInt();
        System.out.print("Ingresa Autor: ");
        libro.autor = leer.next();
        System.out.print("Ingresa el numero de paginas: ");
        libro.paginas = leer.nextInt();
        System.out.print("Ingresa el titulo: ");
        libro.titulo = leer.next();

        mostrar(libro);

    }

    public static void mostrar(Libro libro) {

        System.out.println("ISBN: " + libro.ISBN + "\nAutor: " + libro.autor + "\nPaginas: " + libro.paginas + "\nTitulo: " + libro.titulo);

    }
}
