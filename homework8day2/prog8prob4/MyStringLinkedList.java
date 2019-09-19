package prog8prob4;


public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addSort(String item) {
		// Implement
		// If the list is empty
		if (header == null) {
			header = new Node(null, item, null);
		} else
		// Check if the item is less than the header
		if (header.value.compareTo(item) > 0) {
			Node newNode = new Node(null, item, header);
			header = newNode;
		} else {
			// Finding the correct position to insert a node
			Node current = header;
			Node previous = null;
			while (current != null && item.compareTo(current.value) > 0) {
				previous = current;
				current = current.next;
			}
			// Inserting node in the end
			if (current == null) {
				previous.next = new Node(previous, item, null);
			} else // Node to be insert in between previous and next
			{
				Node n = new Node(previous, item, current);
				previous.next = n;
				current.previous = n;
			}
		}
	} // insert in a Sorted Order

	public int size() {
		// Implement
		int count = 0;
		if (header != null) {
			Node temp = header;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
		}
		return count;
	}

	public boolean isEmpty() {
		// Implement
		return header == null ? true : false;
	}

	public Node getFirst() {
		// Implement
		return header;
	}

	public Node getLast() {

		// Implement
		Node temp = header;
		Node lastNode = null;

		if (header != null) {

			while (temp != null) {
				lastNode = temp;
				temp = temp.next;
			}
		}
		return lastNode == null ? temp : lastNode;
	}

	public boolean contains(String item) {
		// Implement
		if (header != null) {
			Node temp=header;
		
			while (temp != null) {
			    if (item.equals(temp.value)) {
					return true;
				}
				temp = temp.next;
			}
		}
		return false;
	}

	public void removeFirst() {
		// Implement
		if (header != null) {
			header.next.previous = null;
			header = header.next;
		}
	    else
	    	System.out.println("List is empty");
	}

	void removeLast() {
		// Implement
		if (header != null) {
			Node temp=header;
			Node lastNode=null;
			while (temp.next != null) {
				
				temp = temp.next;
			}
			temp.previous.next=null;
			lastNode=null;
		}
	}

	public void print() {
		print(header);
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		// base case
		if (n == null)
			return;
		System.out.println(" " + n.value);
		print(n.next);
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		
		System.out.println(mySL);
		mySL.addSort("Banana");
		mySL.addSort("Apple");
		mySL.addSort("Dates");
		mySL.addSort("Carrot");
		mySL.addSort("Tomato");
		System.out.println(mySL);
		System.out.println("Size of the List  " + mySL.size());
		System.out.println("IsEmpty : " + mySL.isEmpty());
		System.out.println("First Node : " + mySL.getFirst().value);
		System.out.println("Last Node : " + mySL.getLast().value);
		System.out.println("Check Apple is in the List  : " + mySL.contains("Apple"));
		System.out.println("Check Grapes is in the List  : " + mySL.contains("Grapes"));
		mySL.removeFirst();
		mySL.removeLast();
		System.out.println(mySL);
		mySL.print();

	}

}
