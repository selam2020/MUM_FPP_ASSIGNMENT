package prog5prob4;

public class CommissionEmployee  extends Employee{
	 private double grossSale;
	private double commissionRate;
	
	CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double commissionRate){
		super(firstName, lastName, socialSecurityNumber);
		this.grossSale=grossSale;
		this.commissionRate=commissionRate;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public double getPayment() {
		 return grossSale*commissionRate;
		
	}
	}

	
	
	


