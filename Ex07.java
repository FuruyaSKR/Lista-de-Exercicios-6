
public class Ex07 {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void mudaLado(double lado) {
		this.lado = lado;
	}
	
	public double areaSqr() {
		return lado*lado;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Area do quadrado: ");
		builder.append(areaSqr());
		return builder.toString();
	}
	
	
	
}
