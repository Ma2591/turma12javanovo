package ExercícioLista2;

import java.util.Scanner;

public class Exercicio4{
		
		public static void main(String[] args) {
			
			int numero;
			int par;
			int impar;
			Scanner leia = new Scanner(System.in);
			
			System.out.printf("Escreva um número inteiro: ");
			numero = leia.nextInt();
			
				if (numero>0) {
					System.out.printf("Este número %d", numero);
					System.out.print(" é positivo, ");
					if(numero %2==0) {
						System.out.printf("e é par. ");
						
					}
					else {
					System.out.print(" e é impar. ");
					}
				}
				else if (numero<0){
					System.out.printf("Este número %d", numero);
					System.out.print(" é negativo, ");
					if(numero %2==0) {
						System.out.printf("e é par. ");
						
					}
					else {
					System.out.print(" e é impar. ");
					}
				}
				else {
					System.out.printf("Este número %d", numero);
					System.out.print(" é neutro. ");
				}
		}
					
}
