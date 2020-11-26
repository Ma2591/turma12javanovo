package ExercícioLista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//Atributos
		double n;
		double valor = 0.00;
		
		//Entradas
		System.out.println("Entre com o valor para a variável N: ");
		n = read.nextDouble();
		
		//Processamentos
		if(n>100) {
			System.out.printf("%2f", n);
		}
		else {
			System.out.printf("%2f", valor);
		}
	}
}
