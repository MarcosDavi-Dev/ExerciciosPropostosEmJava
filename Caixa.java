import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		
		int part1, part2, amount1, amount2;
		double price1, price2, payment;
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite abaixo o n�mero da pe�a 1, o valor e o pre�o. Separe por espa�o.");
		part1 = sc.nextInt();
		amount1 = sc.nextInt();
		price1 = sc.nextDouble();
		System.out.println("Agora digite os dados da pe�a 2.");
		part2 = sc.nextInt();
		amount2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		//C�lculo
		payment = price1*amount1 + amount2*price2;
		
		//Sa�da
		System.out.printf("O valor total a ser pago �: R$ %.2f%n", payment);
		
		sc.close();
	}

}
