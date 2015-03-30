package unipe.ex.google;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
	}
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public void validate() throws DataInvalidaException{
		if((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || (ano < 1)){
			throw new DataInvalidaException(toString()+" (Data Inválida)");
		}
	}
	
	public String toString(){
		return dia+"/"+mes+"/"+ano;
	}

}