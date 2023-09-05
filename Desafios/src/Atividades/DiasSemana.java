package Atividades;

import java.util.Scanner;

public class DiasSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: ");
		String dia = entrada.next().toLowerCase();
		
		if(dia.equals("segunda")) {
			System.out.println(dia.toUpperCase() + " 2");
		} 
		
		else if(dia.equals("terça")) {
			System.out.println(dia.toUpperCase() + " 3");
		} 
		
		else if(dia.equals("quarta")) {
			System.out.println(dia.toUpperCase() + " Dia 4");
		} 
		
		else if(dia.equals("quinta")) {
			System.out.println(dia.toUpperCase() + " dia 5");
		} 
		
		else if(dia.equals("sexta")) {
			System.out.println(dia.toUpperCase() + " dia 6");
		} 
		
		else if(dia.equals("sábado")) {
			System.out.println(dia.toUpperCase() + " dia 7");
		} 
		
		else if(dia.equals("domingo")) {
			System.out.println(dia.toUpperCase() + " dia 1");
		}
	
		entrada.close();
	}
}
