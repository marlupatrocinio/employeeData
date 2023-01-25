package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		double result = netSalary() + (netSalary() * (percentage/100));
		return result;
	}
	
}
