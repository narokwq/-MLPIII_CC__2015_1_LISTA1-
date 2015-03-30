package unipe.ex.Principal;

import java.util.Scanner;

import unipe.ex.locadora.Fita;
import unipe.ex.locadora.FitaInfantil;
import unipe.ex.locadora.FitaLancamento;

public class principal {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Fita fita = new Fita();
		
		
		System.out.println("Digite o preco da fita");
		
		double preco = input.nextDouble();
		fita.setPreco(preco);
		
		System.out.println("Opcoes:\n1 - Fita\n2 - Fita Lancamento\n3 - Fita Infantil");
		System.out.print(">> ");
		int op = input.nextInt();
		input.nextLine();           // Nao estava limpando o buffer 
		
		System.out.println("\nDigite o titulo da fita");		
		String nome = input.nextLine();
		
		switch (op) {
		case 1: {
					fita = new Fita();
					fita.setTitulo(nome);			
					break;
				}
		case 2: {	
					fita = new FitaLancamento(nome);
					break;
				}
		case 3: {	fita = new FitaInfantil(nome);
					break;
				}
		}
		
		System.out.println(fita.toString());
	}
	
}
