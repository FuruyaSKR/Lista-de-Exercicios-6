import java.util.Scanner;
	
public class Ex06Main {

	public static void main (String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		Ex06 ex6 = new Ex06();
		
		System.out.println("Bem vindo a nossa lanchonete, aqui está o cardápio!\n");
		System.out.println("Especificação    Código     Preço \nCachorro Quente   100      R$ 1,20\nBauru Simples     101      R$ 1,30\nBauru com ovo     102      R$ 1,50\nHambúrguer        103      R$ 1,20\nCheeseburguer     104      R$ 1,30\nRefrigerante      105      R$ 1,00");
		
		boolean somente = false; 
		
		while(somente == false) {
			
			System.out.println("\nO que o senhor deseja?");
			int pedido = entrada.nextInt();
			
			switch(pedido) {
			
			case(100):
				System.out.println("Cachorro Quente, Quantos?");
				ex6.setCq(entrada.nextInt());  
			break;
			case(101):
				System.out.println("Bauru Simples, Quantos?");
				ex6.setBs(entrada.nextInt());  
			break;
			case(102):
				System.out.println("Bauru com ovo, Quantos?");
				ex6.setBo(entrada.nextInt());  
			break;
			case(103):
				System.out.println("Hambúrguer, Quantos?");
				ex6.setHm(entrada.nextInt());  
			break;
			case(104):
				System.out.println("Cheeseburguer, Quantos?");
				ex6.setChs(entrada.nextInt());  
			break;
			case(105):
				System.out.println("Refrigerante, Quantos?");
				ex6.setRef(entrada.nextInt());  
			break;
			default: 
				System.out.println("Desculpe, estamos em falta");
			}
			
			System.out.println("Mais alguma coisa? Y - N");
			String resposta = entrada.next();
			if("n".equalsIgnoreCase(resposta)) {
				somente = true;
			}
		}
		
		System.out.println("Já trago o seu pedido!\n\n• • •\n");
		System.out.println(ex6); 
		
			entrada.close();
	}
}
