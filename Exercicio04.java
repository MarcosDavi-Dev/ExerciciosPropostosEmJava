package Secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int a, b;
		double resultado;
		
		System.out.println("Diga quantas vezes ser�o solicitada a divis�o");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			System.out.println("Insira dois n�meros para serem divididos");
			a = sc.nextInt();
			b = sc.nextInt();
			if(b == 0){
				System.out.println("N�o se pode dividir um n�mero por zero.");
			} else if(a == 0){
				resultado = 0;
				System.out.println("O resultado �: " + resultado);
			} else {
				resultado = a/b;
				System.out.println("O resultado da divis�o �: " + resultado);
			}
		}
		
		sc.close();
	}

}
