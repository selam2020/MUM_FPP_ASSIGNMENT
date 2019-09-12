package prog5prob6;

import prog5prob5.Computer;

public class MainTestingPersonCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Computer c = new Computer("toshiba", "i5", 4, 25);
		Person originalPerson = new Person("Selam", c);
		// shallow copying by cloning
		Person clonedPerson = (Person) originalPerson.clone();
		clonedPerson.setName("dell");
		// Printing after shallow copying
		System.out.println("Object before cloning is :" + originalPerson.toString());
		System.out.println("Object after cloning is :" + clonedPerson.toString());
		// check if changes made in either of the objects affects the other object
// to prove this is shallow copying      
		clonedPerson.computer.getManufacturer();
		System.out.println();
		System.out.println("----Shallow Copying---");
		System.out.println("Changes made on either one afect both original and cloned objects");
		System.out.println("==================================== ===========================");
		System.out.println("Original object changed to :" + originalPerson.toString());
		System.out.println("Cloned object changed to  :" + clonedPerson.toString());
	}

}
