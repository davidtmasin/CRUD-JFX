package aula4.exercicios;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite a");
		int a = scan.nextInt();
		
		System.out.println("digite b");
		int b = scan.nextInt();
		
		System.out.println("digite c");
		int c = scan.nextInt();

		int delta = (int) Math.pow(b, 2) - 4*a*c;
		
		if(delta<0) {
			System.out.println("não existe solução no conjuntos reais.");
		}else if(delta ==0) {
			
			double x1 = (double)((-b + Math.sqrt(delta))/2*a);
			
			System.out.println("A equação tem duas raízes iguais: "+x1);
		
		}else if(delta>0) {
			
			double x1 = (double)((-b + Math.sqrt(delta))/2*a);
			
			double x2 = (double)((-b - Math.sqrt(delta))/2*a);
			
			System.out.println(x1+" "+x2);
		}
		
	}

}
