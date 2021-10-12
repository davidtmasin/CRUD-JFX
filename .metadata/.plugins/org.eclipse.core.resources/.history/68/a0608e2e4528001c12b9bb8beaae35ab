package aula4.exercicios;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.println("digite o preço do produto.");
		double preco = leitor.nextDouble();
		
		
		System.out.println("Digite a forma de pagamento.");
		System.out.println("1 - à vista");
		System.out.println("2 - cartão");
		
		int opcao = leitor.nextInt();
		
		switch (opcao) {
			case 1: System.out.println("digite a quantia recebida.");
					double valor = leitor.nextDouble();
												
					double troco = valor - preco;
					
					System.out.println(troco);
				break;
		
			case 2:	System.out.println("Digite o número de parcelas.");
					int numParcelas = leitor.nextInt();
					
					double valorParcela = preco/numParcelas;
				
					System.out.println(valorParcela);	
				break;	

			default: System.out.println("Opção inválida");
		}
		
		

	}

}
