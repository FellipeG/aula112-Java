package entities;

public final class LegalPerson extends Person {
	
	private Integer employeesNumber;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, double annualIncome, Integer employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public Double tax() {
		if (employeesNumber > 10)
			return super.getAnnualIncome() * 0.14;
		else
			return super.getAnnualIncome() * 0.16;
	}
	
}
