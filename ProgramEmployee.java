package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("What is the name?");
		emp.name = sc.nextLine();
	
		System.out.println("Enter with the gross salary: ");	
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("What is the tax?");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Update data: " + emp);
		
		sc.close();
	}

}
