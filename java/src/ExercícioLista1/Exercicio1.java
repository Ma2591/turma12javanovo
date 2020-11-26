package ExercícioLista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String [] Args) {
		
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
		 * meses e dias e mostre-a expressa apenas em dias. 
		 */
		
		Scanner read = new Scanner(System.in);
		
		//ATRIBUTOS
		int idade;
		int meses;
		int dias;
		int soma;
		
		//ENTRADAS
		System.out.println("Escreva sua idade: ");
		idade = read.nextInt();
		
		System.out.println("Escreva os meses: ");
		meses = read.nextInt();
		
		System.out.println("Escreva os dias: ");
		dias = read.nextInt();
		
		//PROCESSAMENTOS
		soma = (dias+(idade*365)+(meses*30));
		
		//SAÍDA
		
		System.out.printf("Sua idade em dias é %d ", soma);
	
		
	}
}
