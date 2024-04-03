package Secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int a, b;
		double resultado;
		
		System.out.println("Diga quantas vezes serão solicitada a divisão");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			System.out.println("Insira dois números para serem divididos");
			a = sc.nextInt();
			b = sc.nextInt();
			if(b == 0){
				System.out.println("Não se pode dividir um número por zero.");
			} else if(a == 0){
				resultado = 0;
				System.out.println("O resultado é: " + resultado);
			} else {
				resultado = a/b;
				System.out.println("O resultado da divisão é: " + resultado);
			}
		}
		
		sc.close();
	}

}
