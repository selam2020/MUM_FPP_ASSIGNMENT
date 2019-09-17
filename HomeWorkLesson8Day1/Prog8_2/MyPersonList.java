package Prog8_2;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public Person(String last, String first, int a) {
		// constructor
		lastName = last;
		firstName = first;
		age = a;
	}

	// --------------------------------------------------------------
	public String getLast()
	// get last name
	{
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
	}
	// end class Person
}

public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] PersonArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		PersonArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// Add at last
	public void add(Person s) {
		if (size == PersonArray.length)
			resize();
		PersonArray[size++] = s;
	}

	// get person information by passing index
	public Person get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return PersonArray[i];
	}

	// Find the Person object using lastname
	public boolean find(String lastName) {
		for (Person test : PersonArray) {
			if (test != null) {
				if (test.getLast().equals(lastName))
					return true;
			}
		}
		return false;
	}
 // Adding Person object using specific index
	public void insert(Person s, int pos) {
		if (pos > size)
			return;
		if (pos >= PersonArray.length || size + 1 > PersonArray.length) {
			resize();
		}
		Person[] temp = new Person[PersonArray.length + 1];
		System.arraycopy(PersonArray, 0, temp, 0, pos);
		temp[pos] = s;
		System.arraycopy(PersonArray, pos, temp, pos + 1, PersonArray.length - pos);
		PersonArray = temp;
		++size;
	}
  // Remove the person object by passing its lastname
	public boolean remove(String lastName) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (PersonArray[i].getLast().equals(lastName)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] temp = new Person[PersonArray.length];
		System.arraycopy(PersonArray, 0, temp, 0, index);
		System.arraycopy(PersonArray, index + 1, temp, index, PersonArray.length - (index + 1));
		PersonArray = temp;
		--size;
		return true;
	}
  // Resizing the list
	private void resize() {
		System.out.println("Resizing");
		int len = PersonArray.length;
		int newlen = 2 * len;
		Person[] temp = new Person[newlen];
		System.arraycopy(PersonArray, 0, temp, 0, len);
		PersonArray = temp;
	}
   // To displa all the persons list
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(PersonArray[i] + ", \n");
		}
		sb.append(PersonArray[size - 1] + "]");
		return sb.toString();
	}
   // Return the size
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Amanuel", "Gebreendrias", 30));
		list.add(new Person("Petros", "Habteslasie", 31));
		list.add(new Person("Samuel", "Abrhe", 32));
		list.add(new Person("Mussie", "Isack", 55));
		System.out.println("\n Size() : " + list.size() + " is\n " + list);
		list.remove("Amanuel");
		System.out.println("\n Size() : " + list.size() + " is \n" + list);
		list.insert(new Person("Tesfu", "Mengstab", 32), 2);
		System.out.println("\n Searching of Petros: " + list.find("Petros"));
		System.out.println(list.get(2));
	}
}