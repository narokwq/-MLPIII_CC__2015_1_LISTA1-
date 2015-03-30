package unipe.ex.locadora;

public class Veiculo {
	protected String placa;
	protected String marca;
	protected String modelo;
	protected String ano;	
	protected int kmInicial;
	protected int kmFinal;
	protected double valorKmRodado;
	protected double valorLocação;
	
	
	public Veiculo(String placa, String marca, int kmFinal,
			double valorKmRodado) {
		this(placa, marca, "Sem modelo", "0000", 0, kmFinal, valorKmRodado);
	}
	
	public Veiculo(String placa, String marca, String modelo, String ano,
			int kmInicial, int kmFinal, double valorKmRodado) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		setKmInicial(kmInicial);
		setKmFinal(kmFinal);;
		this.valorKmRodado = valorKmRodado;
		this.valorLocação = (this.kmFinal-this.kmInicial)*this.valorKmRodado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public int getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(int kmInicial) {
		if(kmInicial >= 0){
			this.kmInicial = kmInicial;
		}
	}
	public int getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(int kmFinal) {
		if(kmFinal>=this.kmInicial){
			this.kmFinal = kmFinal;
		}else{
			this.kmFinal = this.kmInicial;
		}
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public double getValorLocação() {
		return valorLocação;
	}
	public void setValorLocação() {
		this.valorLocação = (kmFinal-kmInicial)*valorKmRodado;
	}
	
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo="
				+ modelo + ", ano=" + ano + ", kmInicial=" + kmInicial
				+ ", kmFinal=" + kmFinal + ", valorKmRodado=" + valorKmRodado
				+ ", valorLocação=" + getValorLocação() + "]";
	}
	
}
