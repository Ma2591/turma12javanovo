package ExercícioLista5;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * 6-  	Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
		 * Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
		 */
		
	Scanner read = new Scanner(System.in);
	
	//Atributos
	int c = 3;
	int l = 3;
	int matriz [] [] = new int [l] [c];
	int vetor [] = new int [l];
	int multi;
	
	System.out.printf("Matriz");
	for(l=0;l<3;l++) {
		System.out.printf("\n");
		for(c=0;c<3;c++) {
			matriz[l][c] = (int)(Math.random()*9);
			System.out.printf(" "+matriz[l][c]+"\n");
			
		}
	}
	System.out.println("Vetor\n");
	for(l=0;l<3;l++) {
		System.out.printf("\n");
		vetor [l] = (int)(Math.random()*9);
		System.out.printf(" "+vetor [l]+"\n");
		}
	
	
	System.out.println("Resultado\n");
	for(l=0;l<3;l++) {
		System.out.printf("\n");
		for(c=0;c<3;c++) {
			multi = vetor [l] * matriz[l][c];
			System.out.printf(" "+multi+"\n");
			
			}
		}
	
	}

}
