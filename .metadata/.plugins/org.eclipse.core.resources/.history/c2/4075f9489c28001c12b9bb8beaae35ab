package aula4.explicacao;

import java.util.Scanner;

public class EstruturasDeDecisao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua altura");
		double altura = scan.nextDouble();
		
		System.out.println("Digite seu peso");
		double peso = scan.nextDouble();
		//potencia par sempre será positiva
		double imc = peso/ Math.pow(altura, 2);
		
		if(imc < 18.5 && imc >=0) {
			System.out.println("abaixo do peso");
			System.out.println(imc);
		} 
		
		else if(imc>=18.5 && imc <25)
			
			System.out.println("peso ideal");

		else if(imc>=25 && imc <30)
		
			System.out.println("sobrepeso");
		
		else if(imc>=30 && imc <35)
		
			System.out.println("obesidade I");
		
		else if(imc>=35 && imc <40)
		
			System.out.println("obesidade II severa");
		
		else if(imc>=40)
		
			System.out.println("obesidade III");
		
		else 
			
			System.out.println("Valor inválido.");
		
	}

}
