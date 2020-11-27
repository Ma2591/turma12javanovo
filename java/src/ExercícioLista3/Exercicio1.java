package ExercícioLista3;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
		 * 	a) média do salário da população;
			b) média do número de filhos;
			c) maior salário;
			d) percentual de pessoas com salário até R$100,00. 
		 */
		
		Scanner read = new Scanner(System.in);
		
		//Atributos
		double salario=0;
		int numFilhos=0;
		int mediaSalario=0;
		int mediaFilhos=0;
		double percentualP100=0;
		double maiorSalario=0;
		int totalFilhos=0;
		int quantidadeH=0;
		int x=0;
		int salariosMenor100=0;
		int totalSalario=0;
		
		
		//ENTRADAS
		System.out.println(" Digite o número de entrevistados: ");
		quantidadeH = read.nextInt();
		
		for(x=1;x<=quantidadeH;x++) {
			
			System.out.println(" Digite o salário: ");
			salario = read.nextInt();
			
			if(salario<100) {
				
				salariosMenor100 = salariosMenor100 + 1;
			}
			
		totalSalario+= salario; 
			
		System.out.println(" Digite o número de filhos: ");
		numFilhos = read.nextInt();
		
		while(numFilhos<0) {
			
			System.out.println(" o valor digitado não é válido, tente novamente. ");
			System.out.println(" Digite o número de filhos: ");
			numFilhos = read.nextInt();
		}
		
		totalFilhos+= numFilhos;
		
		if(maiorSalario<salario) {
			maiorSalario = salario;
		}
		
		
		}
		
		mediaSalario = (totalSalario/quantidadeH);
		mediaFilhos = (totalFilhos/quantidadeH);
		percentualP100 = ((percentualP100*100)/quantidadeH);
		
		System.out.printf(" a média de salários é: %d ",mediaSalario);
		System.out.printf("\na média de filhos é: %d",mediaFilhos);	
		System.out.printf("\no maior salário é: %.2f ",maiorSalario);	
		System.out.printf("\no percentual de pessoas com salário menor ou igual a R$100 é %.2f. ",percentualP100);
	}
		

}
