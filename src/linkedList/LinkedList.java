package linkedList;

public class LinkedList {

	Node head;
	Node tail;
	int length;

	// 3. Linked List Insertion
	
	public void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		length++;
	}

	public void print() {
		Node curNode = head;
		while (curNode != null) {
			System.out.println(curNode.data);
			curNode = curNode.next;
		}
	}

	
	public void removeLast() {

		Node prev = null;
		Node curNode = head;

		while (curNode.next != null) {
			prev = curNode;
			curNode = curNode.next;
		}

		prev.next = null;

	}

	// 4. Linked List Deletion (Deleting a given key)
	public void removeNode(int data) {

		Node prev = null;
		Node curNode = head;

		while (curNode.data != data) {
			prev = curNode;
			curNode = curNode.next;
		}

		prev.next = curNode.next;

	}
	//5. Linked List Deletion (Deleting a key at given position)
	public void removePosition(int position) {

		Node prev = null;
		Node curNode = head;
		int counnter = 1;

		while (counnter != position) {
			prev = curNode;
			curNode = curNode.next;
			counnter++;
		}

		prev.next = curNode.next;
	}
	
	// 6. Write a function to delete a Linked List
	
	public void removeFirst() {
		if (head.next != null) {
			head = head.next;
		}

	}

	// 7.Find Length of a Linked List 

	public int getCount() {
		int counter = 0;
		Node curNode = head;
		while (curNode != null) {
			curNode = curNode.next;
			counter++;
		}

		return counter;
	}

	// 9. Write a function to get Nth node in a Linked List
	public int findNthNode(int index) {

		int counter = 1;
		Node curNode = head;

		while (counter != index) {
			curNode = curNode.next;
			counter++;
		}

		return curNode.data;
	}

	// 10. Nth node from the end of a Linked List
	public int nthNodefromEnd(int position) {
		int index = (length - position) + 1;
		return findNthNode(index);
	}
	
	// 11. Print the middle of a given linked list
	public int middleElement() {
		
		// case 1 : 
		
		/**			
			int count = getCount();	
			int index = count/2;
			int data = findNthNode(index);
			return data;
			
			*/
		
		// case 2 : 
				
		Node slow_ptr = head;
		Node fast_ptr = head;
		
		while(fast_ptr!=null && fast_ptr.next !=null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			
		}
		
		return slow_ptr.data;
		
	}
	
	
	//12. Write a function that counts the number of times a given int occurs in a Linked List
	public int countGivenInt(int data) {
		
		Node curNode = head;
		int counter = 0;
		
		while(curNode !=null) {
			if(curNode.data == data) {
				counter++;
			}
			curNode = curNode.next;
		}
		
		return counter;
	}
	
	
	
	

}

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;

	}

}