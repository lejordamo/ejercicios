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
public class Circunferencia {
    
   private double radio;

    public Circunferencia() {
    }
   
   
   

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    
    
    public double area(){
        double area1;
        
        area1=Math.pow(this.radio*3.14,2);
        
        return area1;
        
    }
    
    public double perimetro(){
        double perimetro1;
        
        perimetro1=2*3.14*this.radio;
        return perimetro1;
    }
    
    
    
    
    
    
    
   
   
   
    
    
}


