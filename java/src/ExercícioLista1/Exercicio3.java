package ExercícioLista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] Args) {
		/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		 */
		
		Scanner read = new Scanner(System.in);
		
		//ATRIBUTOS
		int horas;
		int minutos;
		int segundos;
		int totalSegundos;
		
		//Entradas
		System.out.println("Escreva o total de segundos: ");
		totalSegundos = read.nextInt();
		
		//Processos
		horas = (totalSegundos/3600);
		minutos = ((totalSegundos/3600)/60);
		segundos = ((totalSegundos/3600)%60);
		
		//Saídas
		System.out.printf("Você tem %d horas, %d minutos, %d segundos ", horas, minutos, segundos);
	}
}
