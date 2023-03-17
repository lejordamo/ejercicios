/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author George
 */

public class ejercicio6 {

	public static void main(String args[]) throws IOException {
		Scanner leer = new Scanner(System.in);
		boolean coincide;
		int columna;
		int fila;
		int fila1;
		int fila_aux;
		int i;
		int j;
		int k;
		int l;
		int m;
		boolean magica;
		int matriz[][];
		int n;
		int p;
		int sumac;
		int sumac_total;
		int sumad;
		int sumad2;
		int sumad2_total;
		int sumad_total;
		int sumaf;
		int sumaf_total;
		int vectorfilas[];
		coincide = false;
		magica = false;
		n = 0;
		fila = 0;
		fila1 = 0;
		fila_aux = 0;
		columna = 0;
		sumaf = 0;
		sumac = 0;
		sumad = 0;
		sumad2 = 0;
		sumaf_total = 0;
		sumac_total = 0;
		sumad_total = 0;
		sumad2_total = 0;
		do {
			System.out.println("ingrese la dimension de la matriz");
			n = leer.nextInt();
		} while (n>10 || n==0);
		m = n;
		vectorfilas = new int[n];
		matriz = new int[n][m];
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		for (i=0;i<=n-1;i++) {
			for (j=0;j<=m-1;j++) {
				do {
					System.out.println("ingrese un valor en la fila ("+i+","+j+") de la matriz");
					matriz[i][j] = leer.nextInt();
					fila = fila+matriz[i][j];
					if (j==m-1) {
						System.out.println("");
						// corregir la sumatoria
						System.out.println("la suma de los valores de la fila "+i+" es "+fila);
						vectorfilas[i] = fila;
						System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
						System.out.println(""); // no hay forma directa de borrar la consola en Java
						fila = 0;
					}
				} while (matriz[i][j]<1 || matriz[i][j]>9);
			}
		}
		// filas
		k = 0;
		// columnas
		l = 0;
		do {
			for (j=0;j<=m-1;j++) {
				sumaf_total = matriz[k][j]+sumaf_total;
				sumaf = matriz[k][j]+sumaf;
			}
			sumaf = 0;
			k = k+1;
			for (i=0;i<=n-1;i++) {
				sumac_total = matriz[i][l]+sumac_total;
				sumac = matriz[i][l]+sumac;
			}
			sumac = 0;
			l = l+1;
			for (i=0;i<=n-1;i++) {
				for (j=0;j<=m-1;j++) {
					if (i==j) {
						sumad_total = matriz[i][j]+sumad_total;
						// sumad=sumad+matriz[i,j]
					}
				}
			}
			sumad = 0;
			for (i=n-1;i<=0;i++) {
				for (j=0;j<=m-1;j++) {
					if (i==n-1 && j==0) {
						sumad2_total = sumad2_total+matriz[i][j];
					} else {
						if (i==j && i!=n-1) {
							sumad2_total = sumad2_total+matriz[i][j];
						} else {
							if (i==0 && j==m-1) {
								sumad2_total = sumad2_total+matriz[i][j];
							}
						}
					}
					if (j==0 && i==0) {
						sumad2_total = sumad2_total-matriz[i][j];
					}
				}
			}
		} while (k<n && l<m);
		for (i=0;i<=n-1;i++) {
			for (j=0;j<=m-1;j++) {
				if (i==j) {
					// sumad_total=matriz[i,j]+sumad_total
					sumad = sumad+matriz[i][j];
				}
			}
		}
		System.out.println("la suma de la diagonal izquierda hacia abajo es de: "+sumad);
		for (i=n-1;i<=0;i++) {
			for (j=0;j<=m-1;j++) {
				if (i==n-1 && j==0) {
					sumad2 = sumad2+matriz[i][j];
				} else {
					if (i==j && i!=n-1) {
						sumad2 = sumad2+matriz[i][j];
					} else {
						if (i==0 && j==m-1) {
							sumad2 = sumad2+matriz[i][j];
						}
					}
				}
				if (j==0 && i==0) {
					sumad2 = sumad2-matriz[i][j];
				}
			}
		}
		System.out.println("la suma de la diagonal izquierda hacia arriba es de: "+sumad2);
		System.out.println("la suma de las 2 diagonales es de: "+sumad+sumad2);
		System.out.println("la suma de todos los valores de las filas es de: "+sumaf_total);
		if (sumaf_total==sumac_total && sumac_total==sumad_total && sumad_total==sumad2_total) {
			magica = true;
		}
		if (sumaf_total!=sumac_total) {
			System.out.println("La sumatoria de las filas y las columnas no coinciden");
		}
		System.out.println("");
		System.out.println("Matriz: ");
		for (i=0;i<=n-1;i++) {
			for (j=0;j<=m-1;j++) {
				System.out.print(matriz[i][j]+", ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("la matriz es magica?: "+magica);
		System.out.println("");
		if (sumad_total!=sumad2_total) {
			System.out.println("Las diagonales no coinciden");
		}
		if (magica==false) {
			System.out.println("la suma de alguna de las filas no coincide:");
			for (k=0;k<=n-1;k++) {
				System.out.println("Fila "+k+" = "+vectorfilas[k]);
			}
		}
		System.out.println("");
	}


}
