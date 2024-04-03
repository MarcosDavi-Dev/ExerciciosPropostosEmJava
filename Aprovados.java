package application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Student;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int numAluno = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[numAluno];

        for (int i = 0; i < numAluno; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "° aluno: ");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            sc.nextLine(); 

            students[i] = new Student(nome, nota1, nota2);
        }
        
        System.out.println("Alunos aprovados: ");
        
       for(int i=0; i<numAluno; i++){
    	   double media = students[i].calculaMedia();
    	   if(media >= 6.0){
    	   System.out.println(students[i].getNome());
    	   }
       }

        sc.close();
    }
}
