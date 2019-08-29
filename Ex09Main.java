import java.util.Scanner;

public class Ex09Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Ex09 ex9 = new Ex09();

		System.out.println("Número da conta: ");
		ex9.setNum(entrada.next());
		
		System.out.println("Nome: ");
		ex9.setNome(entrada.next());
		
		System.out.println("Saldo: ");
		ex9.setSaldo(entrada.nextFloat());

		boolean somente = false;

		while (somente == false) {

			System.out.println("\n1- Incluir uma conta \n2- Alterar nome \n3 - Deposito\n4 - Saque");
			int menu = entrada.nextInt();

			switch (menu) {
			case 1:
				System.out.println(ex9);
				break;
			case 2:
				System.out.println("Digite o novo Nome:");
				ex9.setNome(entrada.next());
				break;
			case 3:
				System.out.println("Quanto você deseja depositar?");
				ex9.deposito(entrada.nextFloat());
				break;
			case 4:
				System.out.println("Quanto você deseja sacar?");
				ex9.saque(entrada.nextFloat());
				break;
			default: 
				System.out.println("Error404");
			}
			
			System.out.println("Deseja continuar? Y - N");
			String resposta = entrada.next();
			if ("n".equalsIgnoreCase(resposta)) {
				somente = true;
			}
		}

		entrada.close();
	}
}