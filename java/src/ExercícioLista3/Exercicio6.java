package Exerc�cioLista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
	/*2- Fa�a um programa que pegue um n�mero do teclado e calcule a soma de 
	* todos os n�meros  de 1 at� ele. 
	* Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
	*/
		
	Scanner read = new Scanner(System.in);
		
		//ATRIBUTOS
		int numero;
		int soma=0;
		
		
		//Entradas
		
		System.out.println("Escreva um n�mero: ");
		numero = read.nextInt();
		
		//Processos
		
		do {
			
			soma+= numero;
			numero-=1;
		}
		while(numero>=0);
		
			System.out.printf("A soma total � %d. ",soma);
	}
}
