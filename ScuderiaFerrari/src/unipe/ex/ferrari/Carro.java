package unipe.ex.ferrari;

public class Carro {
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private boolean ligado;
	
	public Carro(String cor, String modelo) {
		this(cor,modelo, 0, 100, false);
	}
	
	public Carro(String cor, String modelo, int velocidadeMaxima) {
		this(cor,modelo, 0, velocidadeMaxima, false);
	}
	
	public Carro(String cor, String modelo, int velocidadeAtual, int velocidadeMaxima, boolean ligado) {
		this.ligado = ligado;
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
		
	}
	
	public boolean isLigado() {
		return ligado;
	}
	public void ligar() {
		ligado = !ligado;
		if(!ligado){
			velocidadeAtual = 0;
		}
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void acelerar(int velocidade) {
		if(ligado){
			this.velocidadeAtual += velocidade;
			if(this.velocidadeAtual >= this.velocidadeMaxima){
				System.out.println("Velocidade maxima excedida");
			}else{
				System.out.println("Velocidade atual: "+velocidadeAtual+"\n");
			}
		}else{
			System.out.println("Carro esta desligado");
		}
	}
	
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		return "\nCarro [cor=" + cor + ", modelo=" + modelo
				+ ", velocidadeAtual=" + velocidadeAtual
				+ ", velocidadeMaxima=" + velocidadeMaxima + ", ligado="
				+ ligado + "]";
	}
	
	
}
