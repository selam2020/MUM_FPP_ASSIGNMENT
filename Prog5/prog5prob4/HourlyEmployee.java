package prog5prob4;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wage, double hours) {
		super(firstName,firstName,socialSecurityNumber);
		this.hours=hours;
		this.wage=wage;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public double getPayment() {
		 return wage*hours;
		
	}

}
