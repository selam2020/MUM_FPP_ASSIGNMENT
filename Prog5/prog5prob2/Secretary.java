package prog5prob2;

import java.time.LocalDate;

public class Secretary extends DepEmployee {
	double overtimeHours;

	Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		double secretarySalary = salary + 12 * overtimeHours;
		return secretarySalary;
	}

}
