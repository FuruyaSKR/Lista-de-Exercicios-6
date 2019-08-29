import java.util.Scanner;

public class Ex10Main {

	static Scanner entrada;
	
	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		
		int n = 0;
		
		Ex10 tv = new Ex10();
		
		tv.setCanal(30);
		tv.setVolume(40);
		
		boolean ok = true;
		
			while(ok) {
				System.out.println("Digite uma opção!");
				System.out.println("1- mudar de canal");
				System.out.println("2- aumentar/diminuir volume");
				System.out.println("0- sair do menu");
				n = entrada.nextInt();
				
				if(n<0 && n>2) { 
					System.out.println("Opção invalida!");	
				}else if(n == 1) {
					System.out.print("Qual canal você quer?");
					tv.setCanal(entrada.nextInt());
				}else if(n == 2) {
					System.out.println("\nVolume atual: "+ tv.getVolume());
					System.out.print("Qual o volume desejado? ");
					tv.setVolume(entrada.nextInt());
				}else
					ok = false;
		}
			
	}
}
