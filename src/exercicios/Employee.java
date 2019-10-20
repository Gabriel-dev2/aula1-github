package exercicios;

public class Employee {
	
	private String name;
	private double grossSalary;
	private double tax;
	

	public Employee() {
	}
	
	public double netSalary() {
		double calc = this.grossSalary - this.tax;
		return calc;
	}
	
	public double increaseSalary(double percentage) {
		double calc = this.grossSalary * (percentage/100);
		this.grossSalary += calc;
		return this.grossSalary;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getGrossSalary() {
		return grossSalary;
	}


	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
	}
	
	

}
