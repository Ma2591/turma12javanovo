package Exerc�cioLista5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/*
		 * 5-  	Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, 
		 * depois, um c�digo inteiro. Se o c�digo for zero, finalize o programa; se for 1, 
		 * mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o c�digo for diferente de 1 e 2, 
		 * escreva uma mensagem informando que o c�digo inv�lido.
		 */
		
		Scanner read = new Scanner(System.in);
		
		//Atributos
		int vetor[] = new int[5];
		double vetor2;
		int x=0;
		
		
		//Entradas
		for (x=0;x<5;x++) {
			x=x++;
			System.out.printf("Digite um valor %d: ", x+1);
			vetor[x]  = read.nextInt();
		}
		
		System.out.printf("Escolha as op��es 0-finalize, 1-mostrar o vetor na ordem direta ou 2-mostrar o vetor na ordem inversa ");
		vetor2 = read.nextDouble();
		
		if(vetor2==0) {
			System.out.printf("Finalizar Programa.");
		}
		else if (vetor2==1) {
			
			for(x=0;x<5;x++) {
				System.out.printf(vetor[x]+"\n");
			}
		}
		else if (vetor2==2) {
				
			for(x=4;x>=0;x--) {
					System.out.printf(vetor[x]+"\n");
				}
		}
		else {
			System.out.println("Op��o Inv�lida");
		}
	}

}
