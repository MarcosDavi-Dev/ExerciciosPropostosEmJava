package Secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um n�mero entre 1 e 1000 para mostrar os n�meros �mpares:");
		int x = sc.nextInt();
		
		if(x<=1 || x>=1000){
			System.out.println("O n�mero precisa estar entre 1 e 1000.");
		}else {
			for(int i=1; i<= x; i++){
				if(i % 2 !=0){
					System.out.println(i);
				}
			}
		}
		
		sc.close();
	}

}
