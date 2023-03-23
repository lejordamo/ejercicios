/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.entidades;

/**
 *
 * @author George
 */
public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;
    
    public Libro(){
    }

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
  
    
    
}
