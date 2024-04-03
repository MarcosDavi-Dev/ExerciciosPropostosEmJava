package application;

import java.util.Scanner;
import Entities.Pessoa;

public class Mais_Velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoas = new Pessoa[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
        	System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            pessoas[i] = new Pessoa(nome, idade);
        }
        
        
        Pessoa pessoaMaisVelha = encontrarPessoaMaisVelha(pessoas);

        System.out.println("A pessoa mais velha é: " + pessoaMaisVelha.getNome());
        sc.close();
    }
    
    public static Pessoa encontrarPessoaMaisVelha(Pessoa[] pessoas) {
        Pessoa maisVelha = pessoas[0];

        for (int i = 1; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoas[i];
            }
        }

        return maisVelha;
    }
}
