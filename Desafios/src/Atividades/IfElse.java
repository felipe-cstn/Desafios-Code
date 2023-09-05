package Atividades;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 != 0){
		    System.out.println(numero + " Nao eh par!");
		} else{
		    System.out.println(numero + " eh par!");
		}
	}
}
