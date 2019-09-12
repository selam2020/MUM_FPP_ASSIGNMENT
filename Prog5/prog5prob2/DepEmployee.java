package prog5prob2;
import java.util.Date;
import java.time.LocalDate;

public class DepEmployee {
	String name;
	double salary;
	LocalDate hireDay;
	 public DepEmployee(){
		
	}
	 public DepEmployee(String name,double salary,LocalDate hireDate){
		this.name=name;
		this.salary=salary;
		this.hireDay=hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}
	public double  computeSalary () {
		return salary;
	}
	
}
