package unipe.ex.principal;

import java.util.Scanner;

import unipe.ex.locadora.VeiculoCarga;
import unipe.ex.locadora.VeiculoPasseio;

public class Principal {
	public static void main(String[] args) {
		VeiculoCarga carga = new VeiculoCarga("kjh3546", "marca1", 40, 2.0); // placa, marca, kmfial, precokm
		VeiculoPasseio passeio = new VeiculoPasseio("jly6521", "marca1", "modelo1", "1980" ,0, 60, 2.0, true, 2);
		
		System.out.println("Valor locacao: "+ carga.getValorLocação());
		System.out.println("Valor locacao: "+ passeio.getValorLocação());
		
		System.out.println(carga);
		System.out.println(passeio);
	}
}
