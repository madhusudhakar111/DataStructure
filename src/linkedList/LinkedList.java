package linkedList;

public class LinkedList {

	Node head;
	Node tail;
	int length;

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

	public void removeFirst() {
		if (head.next != null) {
			head = head.next;
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

}

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;

	}

}