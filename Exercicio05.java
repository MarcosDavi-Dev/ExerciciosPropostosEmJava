package Secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número a ser calculado o fatorial: ");
		int num = sc.nextInt();
		
		int fatorial = 1;
		for(int i=1; i<=num; i++){			
			fatorial *= i;
		}
		
		System.out.println(num + "! é: " +fatorial);
		sc.close();
	}

}
