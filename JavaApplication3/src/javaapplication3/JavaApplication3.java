/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
        
      /*  int num1,num2;
        // ejercicio SI
        
        System.out.println("Ingresa 2 numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        if (num1>25 || num2>25 ) {
            System.out.println("Alguno de los 2 numeros es mayor que 25");
            
        }else{
            
            System.out.println("Ninguno es mayor que 25");
        }
        
        */
      
      
      /*
      
      // ejercicio Segun
    	int tipoMotor;

    	System.out.println("Ingrese el tipo de bomba");

    	tipoMotor = leer.nextInt();

    	switch (tipoMotor) {
        	case 1:
           System.out.println("La bomba es una bomba de agua");
           break;

        	case 2:
           System.out.println("La bomba es una bomba de gasolina");
            break;
            
            case 3:
           System.out.println("La bomba es una bomba de hormigón");
            break;
            
             case 4:
           System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            

        	default:
           System.out.println("No existe un valor válido para tipo de bomba");
    	}


*/
      
      //ejercicio mientras
      
      
  	 /*
   	String respuesta = "s";
  	 
   	while (respuesta.equalsIgnoreCase("S")) {
      	 
    	System.out.println("Desea continuar?");
    	respuesta = leer.nextLine();
   	   }
      */
      
      

      
      
      
      //ejercicio mientras 
      /*
      int nota;
        System.out.println("ingresa una nota");
        nota= leer.nextInt();
        
        while (nota<0 || nota>10){
        System.out.println("ingresaste una nota incorrecta, vuelve a ingresar");
        nota=leer.nextInt();
      
      
   }
*/
      
      /*
      
      String respuesta;

    	do {

    	System.out.println("Desea continuar?");
    	respuesta = leer.nextLine();

    	} while (respuesta.equalsIgnoreCase("S"));
}

      
*/
      
      //EJERCICIO 9
      /*
      int numero,i,suma;
      i=0;
      suma=0;
      
      
        do {
            System.out.println("ingresa un numero");
            numero=leer.nextInt();
            if (numero>0){
                
            suma=suma+numero;
                    i++;
                    }else{
                if (numero==0) {
                System.out.println("se capturo el numero 0");
                break;
                
            }
                          }      
            
            
            
            
        } while (i<20 && numero!=0);
        
        System.out.println("la suma de los numero es: " +suma);
        
      
      
      
      
      
      
      */
      
      /*
      
      
      for (int i = 0; i <= 10; i++) {

    	System.out.println("Imprimo el valor de i: " + i);

    	}
   	 
    	System.out.println("===================================");

    	System.out.println("For decreciendo");
   	 
    	for (int i = 10; i >= 0; i--) {

    	System.out.println("Imprimo el valor de i: " + i);

    	}



*/
      /*
      int numero,j;
      j=0;
       System.out.println("ingresa 4 numeros");
        do {
           
            numero=leer.nextInt();
            j++;
            System.out.print(numero);
            for (int i = 0; i < numero; i++) {
                
                System.out.print("*");
                
            }
            System.out.println("");
            
            
            
            
        } while (j<4);
        
      
      */
      
      /*
      //ejercicio 1 del segundo pdf
      int numero;
        System.out.println("ingresa un numero");
        numero=leer.nextInt();
        
             
        if (numero % 2 == 0) {
            System.out.println("el numero ingresado es par");
            
        }else{
            System.out.println("el numero ingresado es impar");
        }
      
      
      */
      /*
      //ejercicio 2
      
      String frase;
        System.out.println("ingresa una frase");
        frase=leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("CORRECTO");
            
        }else {
            System.out.println("incorrecto");
        }
*/
      
      
      
      //EJERCICIO 3
      /*
       String frase;
        System.out.println("ingresa una frase");
        frase=leer.nextLine();
        int longi=frase.length();
        
        
     
        
        if (longi==8)   {
            System.out.println("CORRECTO");
            
        }else {
            System.out.println("incorrecto");
        }
        */
        
        
        //EJERCICIO 4
        /*
       String frase;
        System.out.println("ingresa una frase");
        frase=leer.nextLine();
        
        
        
        char caracter = frase.charAt(0);
        String str = String.valueOf(caracter);
            
        
        if (str.equalsIgnoreCase("A")){
            System.out.println("CORRECTO");
            
        }else {
            System.out.println("incorrecto");
        }
      
      */
      
}
}

      
      
      
      
      
      
    

      
      
      
      
      
      


      
      
      
    
    

