package Exerc�cioLista2;

import java.util.Scanner;

public class Exercicio4{
		
		public static void main(String[] args) {
			
			int numero;
			int par;
			int impar;
			Scanner leia = new Scanner(System.in);
			
			System.out.printf("Escreva um n�mero inteiro: ");
			numero = leia.nextInt();
			
				if (numero>0) {
					System.out.printf("Este n�mero %d", numero);
					System.out.print(" � positivo, ");
					if(numero %2==0) {
						System.out.printf("e � par. ");
						
					}
					else {
					System.out.print(" e � impar. ");
					}
				}
				else if (numero<0){
					System.out.printf("Este n�mero %d", numero);
					System.out.print(" � negativo, ");
					if(numero %2==0) {
						System.out.printf("e � par. ");
						
					}
					else {
					System.out.print(" e � impar. ");
					}
				}
				else {
					System.out.printf("Este n�mero %d", numero);
					System.out.print(" � neutro. ");
				}
		}
					
}
