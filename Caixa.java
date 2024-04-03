import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		
		int part1, part2, amount1, amount2;
		double price1, price2, payment;
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite abaixo o número da peça 1, o valor e o preço. Separe por espaço.");
		part1 = sc.nextInt();
		amount1 = sc.nextInt();
		price1 = sc.nextDouble();
		System.out.println("Agora digite os dados da peça 2.");
		part2 = sc.nextInt();
		amount2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		//Cálculo
		payment = price1*amount1 + amount2*price2;
		
		//Saída
		System.out.printf("O valor total a ser pago é: R$ %.2f%n", payment);
		
		sc.close();
	}

}
