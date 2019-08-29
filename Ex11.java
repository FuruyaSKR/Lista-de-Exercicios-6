public class Ex11 {

	private String tipocomb = "";
	private double valorlitro = 0;
	private float quantidade = 0;

	public String getTipocomb() {
		return tipocomb;
	}

	public void setTipocomb(String tipocomb) {
		this.tipocomb = tipocomb;
	}

	public double getValorlitro() {
		return valorlitro;
	}

	public void setValorlitro(double d) {
		this.valorlitro = d;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public double setporvalor(double d) {
		double litros = 0;
		if (d > valorlitro && (this.quantidade - (d / valorlitro)) > 0)
			litros = d / valorlitro;
		this.quantidade += -litros;
		return litros;
	}

	public double setporlitros(float litros) {
		double valor = 0;
		if (litros < this.quantidade)
			valor = litros * valorlitro;
		quantidade += -litros;
		return valor;
	}

	public void alteracomb(String nome) {
		if (nome != this.tipocomb)
			tipocomb = nome;
	}

	public void alteravalor(float valor) {
		if (valor != valorlitro && valor > 0)
			valorlitro = valor;
	}

	public void alteraquant(float quant) {
		if (quant != quantidade && quantidade > 0)
			quantidade = quant;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ex11 [tipocomb=");
		builder.append(tipocomb);
		builder.append(", valorlitro=");
		builder.append(valorlitro);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", getTipocomb()=");
		builder.append(getTipocomb());
		builder.append(", getValorlitro()=");
		builder.append(getValorlitro());
		builder.append(", getQuantidade()=");
		builder.append(getQuantidade());
		builder.append("]");
		return builder.toString();
	}

}
