package Atividades;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Utilize um dos sinais para realizar a operacao");
		System.out.println("---------------------");
		System.out.println("|Adicao: [+]        |");
		System.out.println("|Subtracao: [-]     |");
		System.out.println("|Multiplicacao: [*] |");
		System.out.println("|Divisao: [/]       |");
		System.out.println("---------------------");
		
		System.out.println("Vamos comecar...");
			Thread.sleep(2000);
			System.out.printf("\n");
		
		System.out.println("Insira o primeiro numero: ");
			Double number1 = entrada.nextDouble();
		
		System.out.println("Escolha uma operacao: ");
			String op = entrada.next();
		
		System.out.println("Insira o segundo numero: ");
			Double number2 =  entrada.nextDouble();

				/* SOLUÇÃO UTILIZANDO O OPERADOR TERNÁRIO*/
				Double  res = ("+".equals(op)) ? number1 + number2 : 0;
		 				res = ("-".equals(op)) ? number1 - number2 : res;
		 				res = ("*".equals(op)) ? number1 * number2 : res;
		 				res = ("/".equals(op)) ? number1 / number2 : res;
		 		
		 		System.out.println("Resultado: " + number1 + " "+ op + " " + number2 + " = " + res);


		/* SOLUÇÃO UTILIZANDO O SWITCH CASE*/
		/* 
		switch(op){
			case "+" : 
				res = Float.valueOf(number1) + Float.valueOf(number2);
				System.out.println("Resultado: " + number1 + op + number2 + " = " + res);
				break;
			case "-" : 
				res = Float.valueOf(number1) - Float.valueOf(number2);
				System.out.println("Resultado: " + number1 + op + number2 + " = " + res);
				break;
			case "*" : 
				res = Float.valueOf(number1) * Float.valueOf(number2);
				System.out.println("Resultado: " + number1 + op + number2 + " = " + res);
				break;
			case "/" : 
				res = Float.valueOf(number1) / Float.valueOf(number2);
				System.out.println("Resultado: " + number1 + op + number2 + " = " + res);
				break;
			default:
				System.out.println("Operador desconhecido!");
			} */
			
			
			entrada.close();			
	}

}
