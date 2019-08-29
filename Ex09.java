
public class Ex09 {

	private String num;
	private String nome;
	private float saldo;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		if(saldo > 0)
			this.saldo = saldo;
	}
	
	public float deposito(float deposito) {
		deposito = deposito + saldo;
		return deposito;	
	}
	public float saque(float saque) {
		saldo = saldo - saque;
		return saque;
}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nNúmero da Conta: ");
		builder.append(num);
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nSaldo Atual: ");
		builder.append(saldo);
		return builder.toString();
	}
}