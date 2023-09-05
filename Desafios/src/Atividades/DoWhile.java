package Atividades;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		double soma=0;
		
		System.out.println("=====================================");
		System.out.println("= Bem vindo ao Sistema de notas 2.0 =");
		System.out.println("=====================================");
		
		System.out.println("");
		
		int op = 0;
		do {
			System.out.println("============================");
			System.out.println("= Informe a nota do aluno: ");
			System.out.println("============================");
			double nota = entrada.nextDouble();
			
			while(nota < 0 || nota > 10) {
				System.out.println("Nota invalida! Digite uma nota de 0 a 10: ");
				nota = entrada.nextDouble();
			}
			soma+=nota;
			cont++;
			
			System.out.println("");
			
			System.out.println("==========================");
			System.out.println("= [1] - Continuar        =");
			System.out.println("= [0] - Sair do programa =");
			System.out.println("= Informe uma opcao:     =");
			System.out.println("==========================");
			 op = entrada.nextInt();
			
		} while(op != 0 );
			
			System.out.println("");
			System.out.println("=======================");
			System.out.println("Numero da alunos: "  + cont+ "   =");
			System.out.println("Media das notas: "+soma/cont+" =");
			System.out.println("=======================");
			System.out.println("Fim do Programa!");
			entrada.close();
			
	}
}
