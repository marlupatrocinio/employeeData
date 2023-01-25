package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name:");
		employee.name = sc.nextLine();
		
		System.out.println("Gross Salary:");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax:");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $" + employee.netSalary());
		
		System.out.println("wich percentagem to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee.name + ", $" + employee.increaseSalary(percentage));
	
		sc.close();
	}

}
