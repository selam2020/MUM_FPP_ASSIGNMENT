package prog5prob6;

import prog5prob5.Computer;

public class Person implements Cloneable {
	String name;
	Computer computer;

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}

	public String getName() {
		return name;
	}

	public Computer getComputer() {
		return computer;
	}

	@Override // overriding clone method of object
	protected Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

	@Override // overriding toString
	public String toString() {

		return name + " " + computer.toString();
	}

}
