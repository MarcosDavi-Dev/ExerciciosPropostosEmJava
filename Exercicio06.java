package Secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int resultado = N;
		
		for(int i=1; i<=N;i++){
			if (resultado % i == 0){
				System.out.println(i);
			}
		}
			
		sc.close();
	}

}
