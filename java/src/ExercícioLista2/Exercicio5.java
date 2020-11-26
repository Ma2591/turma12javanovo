package Exerc�cioLista2;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos 
		 * de ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o 
		 * aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo 
		 * s�o intimadas a suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias 
		 * do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 
		 * todos os grupos devem ser notificados a paralisarem suas atividades. Fa�a um sistema que 
		 * leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
		 */
		
		//ATRIBUTOS
		double indice;
				
		Scanner read = new Scanner(System.in);
				
		//ENTRADAS
		System.out.println("Escreva o �ndice de polui��o atual: ");
		indice = read.nextDouble();
		
		//PROCESSAMENTOS E SA�DAS
		if (indice>=0.05 && indice<=0.25){
			System.out.println("N�vel de polui��o aceit�vel.");
		}
		else if (indice>0.25 && indice<=0.30){
			System.out.println("Aten��o ind�strias do grupo1, suspendam suas atividades!!!");
		}
		else if (indice>0.30 && indice<=0.50){
			System.out.println("Aten��o ind�strias dos grupo 1 e 2, suspendam suas atividades!!!");
		}
		else if (indice>0.5){
			System.out.println("Aten��o ind�strias dos grupo 1, 2 e 3, suspendam suas atividades!!!");
		}
	}
}
