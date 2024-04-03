import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, pi = 3.14159;
        
        // Entrada
        System.out.println("Digite o raio do círculo no formato <00.0> para calcular pela fórmula A = pi * R²");
        String input = sc.nextLine();
        
        R = Double.parseDouble(input);
        
        A = pi * Math.pow(R, 2);

        // Saída
        System.out.printf("A área do círculo é: %.4f%n", A);
        
        
        sc.close();
    }
}
