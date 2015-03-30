package unipe.ex.principal;

import java.util.Scanner;

import unipe.ex.loja.Fatura;

public class Principal {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero indentificador do produto:");
		String numero = input.nextLine();
		
		System.out.println("Digite a descrição do produto:");
		String descricao = input.nextLine();
		
		System.out.println("Digite o preço");
		double preco = input.nextDouble();
		
		System.out.println("Digite a quantidade");
		int quantidade = input.nextInt();
		
		
		Fatura fatura = new Fatura(numero, descricao, quantidade, preco);
		
		System.out.println(fatura);
	}
}
