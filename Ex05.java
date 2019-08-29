
public class Ex05{

	private double porHora;
	private double horas;
	
	public double getPorHora() {
		return porHora;
	}
	public void setPorHora(double porHora) {
		this.porHora = porHora;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	public double salarioBruto() {
		return horas*porHora;
	}
	
	public double inss() {
		double INSS = 0.08;
		return (salarioBruto() * INSS);
	}
	
	public double sindicato() {
		double SINDICATO = 0.05;
		return (salarioBruto() * SINDICATO);
	}
	
	public double IR() {
		double IR = 0.11;
		return (salarioBruto() * IR);
	}
	
	public double descontos() {
		return inss() + sindicato() + IR();
		
	}
	
	public double salarioLiquido() {
		return salarioBruto() - descontos();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\ninss()=");
		builder.append(inss());
		builder.append("\nsindicato()=");
		builder.append(sindicato());
		builder.append("\nIR()=");
		builder.append(IR());
		builder.append("\ndescontos()=");
		builder.append(descontos());
		builder.append("\nsalarioLiquido()=");
		builder.append(salarioLiquido());
		return builder.toString();
	}
	
}
