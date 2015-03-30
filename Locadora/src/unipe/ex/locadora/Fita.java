package unipe.ex.locadora;

public class Fita {
	protected String titulo;
	protected static double preco;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	@Override
	public String toString() {
		return "Fita [titulo=" + titulo + ", preco=" + getPreco() + "]";
	}
	
	
}
