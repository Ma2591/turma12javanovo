package ExercícioLista4;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		/*3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma 
		posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.
		 */
		
		Scanner read = new Scanner(System.in);
		
		//Atributos
		int linha =1;
		int coluna = 2;
		int x = 0;
		int y = 0;
		int z = 0 ;
		
		int n1 [][] = new int [linha][coluna];
		int n2 [][] = new int [linha][coluna];

		int m1 [][] = new int [linha][coluna];
		int m2 [][] = new int [linha][coluna];
		
		// linha
		for(x=0;x<linha;x++) {
			for(y=0;y<coluna;y++) {
				System.out.println(" valores para n1: ");
				n1 [x][y]= (int)(Math.random()*10);
				
				System.out.println(" valores para n2: ");
				n2 [x][y]= (int)(Math.random()*10);
				
				
			}
		}
		System.out.println("Matriz n1\n");
		
			for(x=0;x<linha;x++) {
				for(y=0;y<coluna;y++) {
					if(x!=z) {
						System.out.printf("\n ");
					}
					System.out.printf("\t %d \t",n1[x][y]);
					z=x;
				}	
			}
			
				System.out.println("Matriz n2\n");
				for(x=0;x<linha;x++) {
					for(y=0;y<coluna;y++) {
						if(x!=z) {
							System.out.printf("\n ");
						}
						System.out.printf("\t %d \t",n2[x][y]);
						z=x;
					}
				}
				m1 [x][y]= n1[x][y]+n2[x][y];
				
				System.out.println("Matriz m1\n");
					for(x=0;x<linha;x++) {
						for(y=0;y<coluna;y++) {
							if(x!=z) {
								System.out.printf("\n ");
							}
							System.out.printf("\t %d \t",m1[x][y]);
							z=x;
						}	
					}
					m2 [x][y]= n1[x][y]-n2[x][y];
					System.out.println("Matriz m2\n");
						for(x=0;x<linha;x++) {
							if(x!=z) {
								System.out.printf("\n ");
							}
							System.out.printf("\t %d \t",m2[x][y]);
							z=x;
					}	
		}
}
		



