import java.util.Scanner;

public class Ex07Main {
		
	static Scanner entrada;

	public static void main(String[] args) {
		
		entrada =  new Scanner(System.in);

		Ex07 sqr = new Ex07();
		
		sqr.setLado(4);
		
		
		
		boolean ok = true;
			while(ok) {
				System.out.println("Voc� deseja mudar o valor do lado do quadrado?");
				System.out.println("1- sim, quero mudar");
				System.out.println("0- n�o, n�o quero mudar");
				int n = entrada.nextInt();
					
					if(n > 1 || n < 0) {
						System.out.println("op��o invalida!");
					}else 
						ok = false;
					
					if(n == 1) {
						System.out.print("digite o novo valor:");
						sqr.mudaLado(entrada.nextDouble()); 
					}
			}
			
			
			System.out.println(sqr);
			
	}
}
