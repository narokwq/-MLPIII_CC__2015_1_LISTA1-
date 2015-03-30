package unipe.ex.principal;

import unipe.ex.google.Data;
import unipe.ex.google.DataInvalidaException;

public class Principal {
	public static void main(String[] args) {
		Data data = new Data(80,88,-1);
		
		try {
			data.validate();
			System.out.println(data);
		} catch (DataInvalidaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
