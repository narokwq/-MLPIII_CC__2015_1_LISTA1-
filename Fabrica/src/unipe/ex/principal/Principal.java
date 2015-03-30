package unipe.ex.principal;

import unipe.ex.fabrica.FabricaDeCarro;
import unipe.ex.fabrica.FabricaDeCarroEnum;

public class Principal {

	public static void main(String[] args) {
		FabricaDeCarro minhaInstancia = FabricaDeCarro.getInstance();
		System.out.println(minhaInstancia.toString());
		
		//Implementação de Joshua Bloch
		FabricaDeCarroEnum minhaInstancia2 = FabricaDeCarroEnum.INSTANCE;
		System.out.println(minhaInstancia2.toString());
	}

}
