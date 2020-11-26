package ExercícioLista1;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String [] Args) {
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
		 * mostre-a expressa em anos, meses e dias. 
		 */
		
		Scanner read = new Scanner(System.in);
		
		//ATRIBUTOS
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		//ENTRADAS
		System.out.println("Escreva o total de dias: ");
		totalDias = read.nextInt();
		
		//PROCESSOS
		anos = (totalDias/365);
		meses = ((totalDias%365)/30);
		dias = ((totalDias%365)%30);
		
		//SAÍDA
		
		System.out.printf("Você tem %d anos, %d meses, %d dias ", anos, meses, dias);
	}
}
