package ExercícioLista4;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/*1.      Faça um programa que crie um vetor por leitura com 5 valores de pontuação de 
		 * uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 */
		
		Scanner read = new Scanner(System.in);
		
		//Atributos
		int vetor [] = new int[5];
		int x = 0;
		int maior=0;
		
		for(x=0;x<5;x++) {
			System.out.println(" Digite os valores de pontuação: ");
			vetor [x] = read.nextInt();
		}
		for(x=0;x<5;x++) {
			
			System.out.printf("\nvalor da posição: %d ", vetor [x]);
			if(maior<vetor [x]) {
				maior = vetor [x];
			}
			
		}
		System.out.printf("\no maior valor é: %d ", maior);
		
	}
}
