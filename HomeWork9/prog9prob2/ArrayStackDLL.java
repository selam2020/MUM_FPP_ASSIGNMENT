package prog9prob2;
	//User Implementation of Stack 
	interface Stack1 {
		public void push(Object ob);

		public Object pop();

		public Object peek();

		public boolean isEmpty();

		public int size();
	}


	// Stack using Doubly Linked List
	public class ArrayStackDLL implements Stack1{

		private class Node {
			Object value;
			Node next;
			Node previous;

			Node(Node previous, Object item, Node next) {
				this.previous = previous;
				this.value = item;
				this.next = next;
			}

			public String toString() {
				return value+" ";
			}
		}
			private Node top;
			private int size; // stack top

			 ArrayStackDLL() // constructor
			{
				top = null; // create stack array
				size = 0; // no items in the stack
			}

			public void push(Object item) // add an item on top of stack
			{
				if (top == null){
					top = new Node(null, item, null);
					size++;
				}
				else {
					Node n = new Node(null, item, top);
				    	top.previous = n;
				    	top = n;
				    	size++;
				}

			}

			public Object pop() // remove an item from top of stack
			{
				Object temp = null;
				if(top==null)
				{
					System.out.println("Stack is Empty");
					return null;
				}
				if (top != null) {
					temp = top.value;
					top.next.previous = null;
					top = top.next;
					size--;
				}
				return temp;
			}

			public Object peek() // get top item of stack
			{
				if (isEmpty())
					return null;
				return top.value;
			}

			public boolean isEmpty() // true if stack is empty
			{
				return (top == null);
			}

			public int size() // returns number of items in the stack
			{
				return size;
			}
			public String toString() {
				String str = "";
				Node temp = top;
				while (temp != null) {
					str = str + "-->[" + temp.value.toString() + "]";
					temp = temp.next;
				}
				str = str + "-->[" + "NULL" + "]";
				return str;
			}
		public static void main(String[] args) {
			ArrayStackDLL stk = new ArrayStackDLL(); // create stack of size 4
			Object item;
			stk.push('A'); // push 3 items onto stack
			stk.push('B');
			stk.push('C');
			stk.push('D');
	        System.out.println("Stack Elements : " + stk);
			System.out.println("size(): " + stk.size());
			item = stk.pop(); // delete item
			System.out.println(item + " is deleted");
			stk.push('D'); // add three more items to the stack
			stk.push('E');
			System.out.println(stk.pop() + " is deleted");
			stk.push('G'); // push one item
			 System.out.println("Stack Elements : " + stk);
			item = stk.peek(); // get top item from the stack
			System.out.println(item + " is on top of stack");
			System.out.println("Size of the Stack : " + stk.size());
			ArrayStackDLL stk1 = new ArrayStackDLL();
			stk1.push("Java");
			stk1.push(20);
		}
	}



