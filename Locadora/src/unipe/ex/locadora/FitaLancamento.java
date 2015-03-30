package unipe.ex.locadora;

public class FitaLancamento extends Fita{
	public FitaLancamento(String titulo){
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public double getPreco(){
		return preco+(preco*0.2);
	}
	
	public String toString() {
		return "Fita Lancamento [titulo=" + titulo + ", preco=" + getPreco() + "]";
	}
}
