import java.util.Locale;
import java.util.Scanner;


public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int number, hour;
		double payHour, salary;
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite abaixo o número do funcionário:");
		number = sc.nextInt();
		System.out.println("Digite abaixo a quantidade de horas trabalhadas do funcionário:");
		hour = sc.nextInt();
		System.out.println("Por fim, o quanto é pago por hora-trabalhada:");
		payHour = sc.nextDouble();
		
		//Processamento
		salary = (payHour * hour);
		
		//Saída
		System.out.println("Funcionário: " + number);
		System.out.printf("Salário é U$ %.2f%n", salary);
		
		sc.close();
	}

}
