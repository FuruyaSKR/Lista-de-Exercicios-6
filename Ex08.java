public class Ex08 {

	private String nome = "";
	private int idade = 0;
	private float altura = 0;
	private float peso = 0;

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso > 0)
			this.peso = peso;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0)
			this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		if (altura > 0)
			this.altura = altura;
	}

	public void Engordar(int peso) {
		if ((this.peso + peso) > 0)
			this.peso = this.peso + peso;

	}

	public void Emagrecer(int peso) {
		if ((this.peso - peso) > 0)
			this.peso = this.peso - peso;

	}

	public void Envelhecer(int idade) {
		int aux = 0;
		for (int i = this.idade; i < this.idade + idade; i++) {
			if (this.idade < 21) {
				aux++;
				this.altura += 0.5;
			} else
				aux++;

		}
		this.idade += aux;
	}

	public void crescer(int altura) {
		this.altura = this.altura + altura;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ex08 [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", getPeso()=");
		builder.append(getPeso());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getIdade()=");
		builder.append(getIdade());
		builder.append(", getAltura()=");
		builder.append(getAltura());
		builder.append("]");
		return builder.toString();
	}

}
