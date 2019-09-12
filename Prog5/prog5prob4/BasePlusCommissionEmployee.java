package prog5prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	  double baseSalary;

	public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double commissionRate,double baseSalary) {
		super(firstName, lastName, socialSecurityNumber,grossSale,commissionRate);
		this.baseSalary = baseSalary;

	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public  double getPayment() {
		return baseSalary +super.getPayment();
	
		
	}
	
	
	
}