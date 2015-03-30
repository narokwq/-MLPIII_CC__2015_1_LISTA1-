package unipe.ex.principal;

import java.util.Scanner;

import unipe.ex.ferrari.Carro;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a cor do carro:");
		String cor = input.nextLine();
		
		System.out.println("Digite o modelo do carro:");
		String modelo = input.nextLine();
		
		System.out.println("Digite a velocidade maxima do carro");
		int velocidadeMaxima = input.nextInt();
		
		Carro carro = new Carro(cor, modelo, velocidadeMaxima);
		
		carro.ligar();
		do{
			System.out.println("Digite Quanto voce acelorou");
			int velocidade = input.nextInt();
			carro.acelerar(velocidade);
		}while(carro.getVelocidadeAtual() <= carro.getVelocidadeMaxima());
		
		System.out.println(carro);
		

	}

}
