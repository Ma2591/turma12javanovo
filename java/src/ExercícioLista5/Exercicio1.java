package Exerc�cioLista5;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * 1- Elabore um programa que calcule o que deve ser pago por um produto,
		 * considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento.
		 * Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento
		 * escolhida e efetuar o c�lculo adequado.
		 */

		Scanner read = new Scanner(System.in);

		// Atributos
		double valorProduto;
		int codigo[] = new int[4];
		int x = 0;

		// Entradas

		System.out.println("Digite o valor do produto: ");
		valorProduto = read.nextDouble();

		System.out.println(
				"Qual a condi��o de pagamento 1-� vista no dinheiro 20% desconto, 2-cr�dito � vista 15% desconto, 3-parcelado (2X), 4-parcelado (3X) + 10% juros ");
		codigo[x] = read.nextInt();

		if (codigo[x] == 1) {

			valorProduto = valorProduto - (valorProduto * 0.2);

			System.out.printf("O valor a pagar � %.2f ", valorProduto);
		}

		else if (codigo[x] == 2) {

			valorProduto = valorProduto - (valorProduto * 0.15);

			System.out.printf("O valor a pagar � %.2f ", valorProduto);
			
		} 
		
		else if (codigo[x] == 3) {

			valorProduto = (valorProduto/2);

			System.out.printf("O valor a pagar ser� em duas vezes de: %.2f ", valorProduto);
		}
		else if (codigo[x] == 4) {

			valorProduto += (valorProduto*0.10);
			double parcela = valorProduto/3;

			System.out.printf("O valor a pagar ser� em tr�s vezes de: %.2f ", valorProduto);
		}
		else {
			System.out.printf("Op��o de pagamento inv�lida.");
		}
			
	}

}
