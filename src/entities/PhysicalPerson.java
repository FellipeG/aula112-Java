package entities;

public final class PhysicalPerson extends Person {

	private Double spentOnHealth;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, double annualIncome, Double spentOnHealth) {
		super(name, annualIncome);
		this.spentOnHealth = spentOnHealth;
	}

	public Double getSpentOnHealth() {
		return spentOnHealth;
	}

	public void setSpentOnHealth(Double spentOnHealth) {
		this.spentOnHealth = spentOnHealth;
	}
	
	@Override
	public Double tax() {
		double tax=0.0;
		double health=0.0;
		if (super.getAnnualIncome() < 20000.00)
			tax = super.getAnnualIncome() * 0.15;
		else
			tax= super.getAnnualIncome() * 0.25;
		
		if (spentOnHealth > 0.0)
			health = spentOnHealth * 0.50;
		
		return tax - health;
			
	}
	
}
