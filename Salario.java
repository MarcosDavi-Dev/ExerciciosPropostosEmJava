import java.util.Locale;
import java.util.Scanner;


public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int number, hour;
		double payHour, salary;
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite abaixo o n�mero do funcion�rio:");
		number = sc.nextInt();
		System.out.println("Digite abaixo a quantidade de horas trabalhadas do funcion�rio:");
		hour = sc.nextInt();
		System.out.println("Por fim, o quanto � pago por hora-trabalhada:");
		payHour = sc.nextDouble();
		
		//Processamento
		salary = (payHour * hour);
		
		//Sa�da
		System.out.println("Funcion�rio: " + number);
		System.out.printf("Sal�rio � U$ %.2f%n", salary);
		
		sc.close();
	}

}
