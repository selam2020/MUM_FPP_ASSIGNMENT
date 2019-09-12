package prog5prob2;

import java.time.LocalDate;

public class Proffesor extends DepEmployee {
	int numberOfPublications;

	Proffesor(String name, double salary, LocalDate hireDate, int numberOfPublications) {
		super(name, salary, hireDate);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
