import java.util.Scanner;


public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2 , resultado;
		
		//Entrada
		System.out.println("Digite dois números inteiros, separados por vírgulas para efetuar a soma: ");
		String input = sc.nextLine();
		String[] parts = input.split(",");
		
		if (parts.length != 2){
			System.out.println("Entrada inválida. Digite exatemente dois números inteiros separados por vírgula");
			sc.close();
			return;
		}
		
		try {
			num1 = Integer.parseInt(parts[0].trim());
			num2 = Integer.parseInt(parts[1].trim());
		} catch (NumberFormatException e) {
			 System.out.println("Erro ao converter valores. Certifique-se de que os valores fornecidos são números válidos.");
	            sc.close();
	            return;
		}

		//Cálculo e saída
		resultado = ((num1) + (num2));
		System.out.println("O resultado da soma é: " + resultado);
		
		sc.close();
		System.exit(0);
		
	}

}
