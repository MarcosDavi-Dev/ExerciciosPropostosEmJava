package application;

import java.util.Locale;
import java.util.Scanner;

public class Dados_Pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i=0; i<n; i++){
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menoraltura = altura[0];
		double maioraltura = altura[0];
		
		for(int i=0; i<n; i++){
			if(altura[i] > maioraltura){
				maioraltura = altura[i];
			}
			if(altura[i] < menoraltura){
				menoraltura = altura[i];
			}
		}
		
		int qtdHomens = 0, qtdMulheres = 0;
		double alturafemtotal = 0;
		
		for(int i=0; i<n; i++){
			if(genero[i] == 'M'){
				qtdHomens++;
			} else {
				qtdMulheres++;
				alturafemtotal += altura[i];
			}
		}
		
		double alturafemMedia = alturafemtotal / qtdMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menoraltura);
		System.out.printf("Maior altura = %.2f\n", maioraltura);
		System.out.printf("Média das alturas das mulheres = %.2f\n", alturafemMedia);
		System.out.printf("Número de homens = %d\n", qtdHomens);
		
		
		sc.close();
	}

}
