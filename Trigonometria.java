import java.util.Locale;
import java.util.Scanner;


public class Trigonometria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, areaTriangulo, areaQuadrado, areaCirculo, areaTrapezio, areaRetangulo, pi;
		pi = 3.14159;
		
		//Entrada
		System.out.println("Digite os valores de A, B e C, onde será mostrado a área do triângulo, círculo, trapézio, quadrado e retângulo. A e B são base e C altura, considere o valor de C o raio do círculo");
		String input = sc.nextLine();
		String[] parts = input.split(",");
		
		if (parts.length != 3){
			System.out.println("Entrada inválida. Digite exatemente dois números inteiros separados por vírgula");
			sc.close();
			return;
		}
		
		try {
			A = Double.parseDouble(parts[0].trim());
			B = Double.parseDouble(parts[1].trim());
			C = Double.parseDouble(parts[2].trim());
		}catch (NumberFormatException e) {
			 System.out.println("Erro ao converter valores. Certifique-se de que os valores fornecidos são números válidos.");
	            sc.close();
	            return;
		}
		
		//Cálculo
		areaTriangulo = A*C/2;
		areaCirculo = pi*Math.pow(C, 2.0);
		areaTrapezio = (A+B)*C/2;
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A*B;
		
		//Saída
		System.out.printf("As áreas são: ");
		System.out.printf("Triângulo: %.3f%n", areaTriangulo);
		System.out.printf("Círculo: %.3f%n", areaCirculo);
		System.out.printf("Trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retângulo: %.3f%n", areaRetangulo);
		
		sc.close();
		
	}

}
