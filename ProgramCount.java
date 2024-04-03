package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramCount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int x = 0;
		System.out.println("Quantos números você vai digitar? ");
		x=sc.nextInt();
		double[] vetor= new double[x];
		
		Calculator calculator = new Calculator(x);
		
		for(int i=0; i<x;i++){
			System.out.println("Digite um número");
			vetor[i]=sc.nextDouble();
			calculator.soma(vetor[i]);			
		}
		
		System.out.println();
		for(int i=0; i<x;i++){
        	System.out.printf("Valores: %.2f ", vetor[i]);
		}
		
		System.out.println();
		System.out.printf("Soma: %.2f", calculator.getSoma());
		System.out.println();
		System.out.printf("Media: %.2f", calculator.getMedia());
		
		sc.close();
	}

}
