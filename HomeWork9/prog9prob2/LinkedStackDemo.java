package prog9prob2;


//Singly Linked List Implementation of Stack
class Node1 {
	int data; // data item
	Node1 next; // next node in linked-stack

	Node1(int d) // constructor
	{
		data = d;
	} // next is automatically set to null
}

class LinkedStack {
	int count;
	Node1 top; // top refers to top-node
	Node1 p; // p refers to current node
	
	public void push(int item) // add item onto stack
	{
		p = new Node1(item); // create new node
		p.next = top; // new node refers to old top
		top = p; // top refers to new node
		count++;
		// System.out.println(p.next.data);
		System.out.println(top.data);
	}

	public Node1 pop() // remove a node from the stack
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		Node1 tmp = top; // tmp saves reference to top node
		top = tmp.next; // now, top refers to next node of old top
		System.out.println(top.data);
		count--;
		return tmp; // return the popped item
	}

	public int peek() // get top node from the stack, without deleting
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		return top.data;
	}

	public void displayStack() {
		p = top; // p refers to top
		System.out.print("\nContents of Stack: [ ");
		while (p != null) // start printing from top of stack to bottom of stack
		{
			System.out.print(p.data + " "); // print data
			p = p.next; // move to next node
		}
		System.out.println("]");
	}

	public boolean isEmpty() // true if stack is empty
	{
		return (top == null);
	}
	public int size(){
		return count;
	}
}

public class LinkedStackDemo {

	public static void main(String[] args) {
		LinkedStack stk = new LinkedStack(); // create stack object
		Node1 item; // item stores popped node
		stk.push(20); // add 20, 35, 40 to stack
		stk.push(35);
		stk.push(40);
		stk.displayStack(); // print contents of stack
		item = stk.pop(); // remove a node from the top and print it
		if (item != null) {
			System.out.println("Popped item: " + item.data);
			stk.displayStack();
		}
		stk.push(65); // insert 65, 70, 75
		stk.push(70);
		stk.push(75);
		stk.displayStack(); // display contents of stack
		System.out.println("Size of the Stack :" + stk.size());
		item = stk.pop(); // remove a node from the top and display it
		if (item != null) {
			System.out.println("Popped item: " + item.data);
			stk.displayStack();
		}
		System.out.println("peek(): " + stk.peek());// get top item
		stk.push(90); // insert 90
		stk.displayStack();

	}

}
