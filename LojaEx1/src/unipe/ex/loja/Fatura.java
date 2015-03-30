package unipe.ex.loja;

public class Fatura {
	private String numero;
	private String descricao;
	private int qnt_comprada;
	private double preco;
	
	public Fatura(String numero, String descricao, int qnt_comprada,
			double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		setQnt_comprada(qnt_comprada);
		setPreco(preco);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQnt_comprada() {
		return qnt_comprada;
	}
	public void setQnt_comprada(int qnt_comprada) {
		if(qnt_comprada>0){
			this.qnt_comprada = qnt_comprada;
		}else{
			this.qnt_comprada = 0;
		}
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(qnt_comprada>0){
			this.preco = preco;
		}else{
			this.preco = 0.0;
		}
	}
	public double getValorFatura(){
		return qnt_comprada*preco;
	}

	@Override
	public String toString() {
		return "\nFatura \n  Numero: " + numero + "\n  Descricao: " + descricao
				+ "\n  Quantidade: " + qnt_comprada + "\n  Preco: " + preco 
				+ "$\n  Valor da fatura: " + getValorFatura() + "$";
	}
	
	
}
