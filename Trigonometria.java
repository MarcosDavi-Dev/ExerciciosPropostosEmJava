import java.util.Locale;
import java.util.Scanner;


public class Trigonometria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, areaTriangulo, areaQuadrado, areaCirculo, areaTrapezio, areaRetangulo, pi;
		pi = 3.14159;
		
		//Entrada
		System.out.println("Digite os valores de A, B e C, onde ser� mostrado a �rea do tri�ngulo, c�rculo, trap�zio, quadrado e ret�ngulo. A e B s�o base e C altura, considere o valor de C o raio do c�rculo");
		String input = sc.nextLine();
		String[] parts = input.split(",");
		
		if (parts.length != 3){
			System.out.println("Entrada inv�lida. Digite exatemente dois n�meros inteiros separados por v�rgula");
			sc.close();
			return;
		}
		
		try {
			A = Double.parseDouble(parts[0].trim());
			B = Double.parseDouble(parts[1].trim());
			C = Double.parseDouble(parts[2].trim());
		}catch (NumberFormatException e) {
			 System.out.println("Erro ao converter valores. Certifique-se de que os valores fornecidos s�o n�meros v�lidos.");
	            sc.close();
	            return;
		}
		
		//C�lculo
		areaTriangulo = A*C/2;
		areaCirculo = pi*Math.pow(C, 2.0);
		areaTrapezio = (A+B)*C/2;
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A*B;
		
		//Sa�da
		System.out.printf("As �reas s�o: ");
		System.out.printf("Tri�ngulo: %.3f%n", areaTriangulo);
		System.out.printf("C�rculo: %.3f%n", areaCirculo);
		System.out.printf("Trap�zio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Ret�ngulo: %.3f%n", areaRetangulo);
		
		sc.close();
		
	}

}
