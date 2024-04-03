package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("First Grade: ");
		student.primeiroTrimestre = sc.nextDouble();
		System.out.println("Second Grade: ");
		student.segundoTrimestre = sc.nextDouble();
		System.out.println("Thirst Grade: ");
		student.terceiroTrimestre = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() <= 60.0){
			System.out.println("Failed");
			System.out.printf("Missing %.2f points%n", student.missingPoints());
		} else {
			System.out.println("Pass");
		}
		sc.close();
	}

}
