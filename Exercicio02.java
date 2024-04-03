package Secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos números serão inseridos, após inseri-os: ");
		int n= sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++){
			int x = sc.nextInt();
			if( x>=10 && x <=20){
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
