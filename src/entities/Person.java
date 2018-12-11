package entities;

public abstract class Person {

	private String name;
	private double annualIncome;
	
	public Person() {
	}

	public Person(String name, double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract Double tax();
	
	@Override
	public String toString() {
		return name + ": $ " + String.format("%.2f", tax());
	}
}
