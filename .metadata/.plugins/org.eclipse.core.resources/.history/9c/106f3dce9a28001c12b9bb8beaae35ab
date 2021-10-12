/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main{
    
	public static void main(String[] args) {
	    
	   int idade;
	   String tipoSanguineo;
	    
	   Scanner leitor = new Scanner(System.in);
	    
	   System.out.print("Informe a idade do paciente: ");
	   idade = leitor.nextInt();
	    
	  
	   String resposta = (idade > 16 && idade <69)?"Paciente apto como doador":"Paciente inapto como doador";
	  
	  
	   switch(resposta){
	      
	      case "Paciente apto como doador":
	          System.out.print("Informe o tipo sanguíneo do paciente: ");
	          tipoSanguineo = leitor.next();
	          
	          switch(tipoSanguineo){
	              case ("A"):
	                  System.out.println("O paciente com o tipo sanguíneo "+tipoSanguineo+" poderá receber"+
	                  " de: A e O. E doar para: A e AB.");
	                  break;
	                  
	              case "a":
	                  System.out.println("O paciente com o tipo sanguíneo "+tipoSanguineo+" poderá receber"+
	                  " de: A e O. E doar para: A e AB.");
	                  break;
	                  
	              case "B":
	                  System.out.println("O paciente com o tipo sanguíneo "+tipoSanguineo+" poderá receber"+
	                  " de: B e O. E doar para: B e AB.");
	                  break;
	                  
	              case "b":
	                  System.out.println("O paciente com o tipo sanguíneo "+tipoSanguineo+" poderá receber"+
	                  " de: B e O. E doar para: B e AB.");
	                  break;
	              
	              case "AB":
	                  System.out.println("O paciente com o tipo sanguíneo "+tipoSanguineo+" poderá receber"+
	                  " de: TODOS OS TIPOS SANGUÍNEOS. E doar para: AB.");
	                  break;
	              
	              case "ab":
	                  System.out.println("O paciente com o tipo sanguíneo "+tipoSanguineo+" poderá receber"+
	                  " de: TODOS OS TIPOS SANGUÍNEOS. E doar para: AB.");
	                  break;
	                  
	              case "O":
	                  System.out.println("O paciente com o tipo sanguíneo "+tipoSanguineo+" poderá receber"+
	                  " de: O. E doar para: TODOS OS TIPOS SANGUÍNEOS.");
	                  break;
	              
	              case "o":
	                  System.out.println("O paciente com o tipo sanguíneo "+tipoSanguineo+" poderá receber"+
	                  " de: O. E doar para: TODOS OS TIPOS SANGUÍNEOS.");
	                  break;
	                  
	              default:
	                  System.out.println("Tipo sanguíneo INVÁLIDO!");
	          }
	          
	          break;
	          
	      case "Paciente inapto como doador":
 	          System.out.println("Paciente inapto como doador");
	          break;
	          
	      default:
	      System.out.println("ERRO FATAL! REINICIE O SISTEMA.");
	  }
	  
	}
}
