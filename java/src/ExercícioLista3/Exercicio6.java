package ExercícioLista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
	/*2- Faça um programa que pegue um número do teclado e calcule a soma de 
	* todos os números  de 1 até ele. 
	* Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
	*/
		
	Scanner read = new Scanner(System.in);
		
		//ATRIBUTOS
		int numero;
		int soma=0;
		
		
		//Entradas
		
		System.out.println("Escreva um número: ");
		numero = read.nextInt();
		
		//Processos
		
		do {
			
			soma+= numero;
			numero-=1;
		}
		while(numero>=0);
		
			System.out.printf("A soma total é %d. ",soma);
	}
}
