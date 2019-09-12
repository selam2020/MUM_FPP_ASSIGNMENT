package prog5prob4;

import java.util.Arrays;

public class DriveMain {

	public static void main(String[] args) {
		
		 BasePlusCommissionEmployee b1=new BasePlusCommissionEmployee("selam","ghide","200-9878-123",100.0,300.0,500.0);
	     CommissionEmployee  c1=new CommissionEmployee("hana","jhon","120-1234-234",200.0,400.0);
	     HourlyEmployee h1=new HourlyEmployee("jirom","mebrahtu","123-7896-124",6,7);
	     SalariedEmployee s1=new SalariedEmployee("eden","esiet","123-4567-789",500.0);
	     SalariedEmployee s2=new SalariedEmployee("eden","esiet","123-4567-789",500.0);
	     
	     Employee[]employees= {b1,c1,h1,s1,s2};
	   // System.out.println (Arrays.toString(employees));
	    
	     int sum=0;
	     for(Employee emp:employees) {
	    	 System.out.println(emp.toString());
	    	 sum+= emp.getPayment();
	    	 
	     }
	     System.out.println("salaries of all the employees is"+" "+sum );
		
	}

}
