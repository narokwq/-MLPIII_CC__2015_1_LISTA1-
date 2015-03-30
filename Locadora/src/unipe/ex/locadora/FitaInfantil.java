package unipe.ex.locadora;

public class FitaInfantil extends Fita{
	
	
	public FitaInfantil(String titulo){
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public double getPreco(){
		return preco-(preco*0.4);
	}
	
	@Override
	public String toString() {
		return "Fita Infantil [titulo=" + titulo + ", preco=" + getPreco() + "]";
	}
}
