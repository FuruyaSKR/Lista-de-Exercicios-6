
public class Ex08Main {
	
	public static void main(String[] args) {
		
		Ex08 a = new Ex08();
		
		a.setNome("Pedro");
		a.setAltura(180);
		a.setIdade(18);
		a.setPeso(80);
		a.Envelhecer(20);
		
		System.out.println(a);
		a.Envelhecer(20);
		a.Engordar(10);
		System.out.println(a);

	}

}
