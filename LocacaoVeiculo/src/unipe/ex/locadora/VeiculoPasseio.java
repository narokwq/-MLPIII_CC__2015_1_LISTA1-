package unipe.ex.locadora;

public class VeiculoPasseio extends Veiculo{
	
	
	
	public VeiculoPasseio(String placa, String marca,
			int kmFinal, double valorKmRodado) {
		this(placa, marca, "Sem Modelo", "0000", 0, kmFinal, valorKmRodado, true, 4);

	}
	public VeiculoPasseio(String placa, String marca, String modelo,
			String ano, int kmInicial, int kmFinal, double valorKmRodado,
			boolean arCondicionado, int qntPortas) {
		super(placa, marca, modelo, ano, kmInicial, kmFinal, valorKmRodado);
		
		this.arCondicionado = arCondicionado;
		this.qntPortas = qntPortas;
	}

	private boolean arCondicionado;
	private int qntPortas;
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public int getQntPortas() {
		return qntPortas;
	}
	public void setQntPortas(int qntPortas) {
		this.qntPortas = qntPortas;
	}
	
	@Override
	public String toString() {
		return "VeiculoPasseio [arCondicionado=" + arCondicionado
				+ ", qntPortas=" + qntPortas + ", placa=" + placa + ", marca="
				+ marca + ", modelo=" + modelo + ", ano=" + ano
				+ ", kmInicial=" + kmInicial + ", kmFinal=" + kmFinal
				+ ", valorKmRodado=" + valorKmRodado + ", valorLocação="
				+ getValorLocação() + "]";
	}
	
}
