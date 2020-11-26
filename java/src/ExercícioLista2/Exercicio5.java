package ExercícioLista2;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos 
		 * de indústrias que são altamente poluentes do meio ambiente. O índice de poluição 
		 * aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo 
		 * são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias 
		 * do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 
		 * todos os grupos devem ser notificados a paralisarem suas atividades. Faça um sistema que 
		 * leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
		 */
		
		//ATRIBUTOS
		double indice;
				
		Scanner read = new Scanner(System.in);
				
		//ENTRADAS
		System.out.println("Escreva o índice de poluição atual: ");
		indice = read.nextDouble();
		
		//PROCESSAMENTOS E SAÍDAS
		if (indice>=0.05 && indice<=0.25){
			System.out.println("Nível de poluição aceitável.");
		}
		else if (indice>0.25 && indice<=0.30){
			System.out.println("Atenção indústrias do grupo1, suspendam suas atividades!!!");
		}
		else if (indice>0.30 && indice<=0.50){
			System.out.println("Atenção indústrias dos grupo 1 e 2, suspendam suas atividades!!!");
		}
		else if (indice>0.5){
			System.out.println("Atenção indústrias dos grupo 1, 2 e 3, suspendam suas atividades!!!");
		}
	}
}
