package Exerc�cioLista3;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
	/*1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos 
	 * e apresente no final o total do somat�rio, a m�dia e o total de valores lidos. 
	 * O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo 
	 * valores positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor 
	 * negativo.
	 */
	
	
	Scanner read = new Scanner(System.in);
	
	//ATRIBUTOS
	
	double n1, n2;
	double somatorio;
	double mediaNumeros=0.00;
	
	//Entradas
			
		System.out.println(" Digite o valor de n1: ");
		n1 = read.nextDouble();
		
		System.out.println(" Digite o valor de n2: ");
		n2 = read.nextDouble();
	
		while(n1<0){
			
			System.out.println(" O valor inserido � negativo, digite novamente. ");
			
			System.out.println(" Digite o valor de n1: ");
			n1 = read.nextDouble();
			
		}
		
		while(n2<0){
			
			System.out.println(" O valor inserido � negativo, digite novamente. ");
			
			System.out.println(" Digite o valor de n2: ");
			n2 = read.nextDouble();
			
		}
		
		somatorio = n1+n2;
		mediaNumeros = (somatorio/2);
		
		System.out.printf(" O somat�rio � %.2f: ", somatorio);
		System.out.printf(" A media de alunos � %.2f: ", mediaNumeros);
			
	}
	
}
