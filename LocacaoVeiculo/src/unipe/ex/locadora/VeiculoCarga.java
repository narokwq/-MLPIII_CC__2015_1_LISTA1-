package unipe.ex.locadora;

public class VeiculoCarga extends Veiculo{
	private String capCarga;

	public VeiculoCarga(String placa, String marca, int kmFinal,
			double valorKmRodado) {
		this(placa, marca, "Sem Modelo", "0000", 0, kmFinal, valorKmRodado, "Normal");
		
	}

	public VeiculoCarga(String placa, String marca, String modelo, String ano,
			int kmInicial, int kmFinal, double valorKmRodado, String capCarga) {
		super(placa, marca, modelo, ano, kmInicial, kmFinal, valorKmRodado);
		this.capCarga = capCarga;
	}

	public String getCapCarga() {
		return capCarga;
	}

	public void setCapCarga(String capCarga) {
		this.capCarga = capCarga;
	}

	@Override
	public String toString() {
		return "VeiculoCarga [capCarga=" + capCarga + ", placa=" + placa
				+ ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano
				+ ", kmInicial=" + kmInicial + ", kmFinal=" + kmFinal
				+ ", valorKmRodado=" + valorKmRodado + ", valorLocação="
				+ getValorLocação() + "]";
	}
	
	
}
