package unipe.ex.fabrica;


public class FabricaDeCarro {
private static FabricaDeCarro INSTANCE;
	
	private FabricaDeCarro(){
		
	}
	
	public static FabricaDeCarro getInstance(){
		if(INSTANCE == null){
			INSTANCE = new FabricaDeCarro();
		}
		return INSTANCE; 
	}

	@Override
	public String toString() {
		return "Singleton FabricaDeCarro";
	}
	
	
}
