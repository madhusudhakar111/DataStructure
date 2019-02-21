package linkedList.dll;

public class DLL {

	Node head;
	Node tail;
	Node prev;

	// 1. Doubly Linked List Introduction and Insertion
	public void add(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			prev = null;
		} else {
			prev = tail;
			tail.next = newNode;
			tail = tail.next;
			tail.prev = prev;
		}

	}

	public void print() {

		Node curNode = head;

		while (curNode != null) {
			System.out.println(curNode.data);
			curNode = curNode.next;
		}

	}

	// 3. Reverse a Doubly Linked List
	public void reversePrint() {

		Node curNode = tail;

		while (curNode != null) {
			System.out.println(curNode.data);
			curNode = curNode.prev;
		}

	}

	// 2. Delete a node in a Doubly Linked List
	public void deleteNode(int data) {

		Node curNode = head;
		Node prev = null;
	
		while (curNode != null) {

			if (curNode.data == data) {
				prev = curNode.prev;
				prev.next = curNode.next;
			}

			curNode = curNode.next;
		}

	}

}

class Node {

	Node prev;
	Node next;
	int data;

	Node(int dt) {
		data = dt;
	}

}