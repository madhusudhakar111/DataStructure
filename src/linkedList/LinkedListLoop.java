package linkedList;

import java.util.Stack;

public class LinkedListLoop {

	Node head;
	Node tail;
	int length = 0;

	// Crea loop in linked list

	public void add(int data) {
		length++;

		Node newNode = new Node(data);

		if (length != 7) {

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}

		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head.next;

		}

	}

	public void print() {
		Node curNode = head;
		while (curNode != null) {
			System.out.println(curNode.data);
			curNode = curNode.next;
		}
	}

	// 13. Detect loop in a linked list
	public int detectLoop() {

		Node slow_ptr = head;
		Node fast_ptr = head;

		int data = 0;

		while (slow_ptr != null && fast_ptr.next != null) {

			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;

			if (slow_ptr == fast_ptr) {
				return fast_ptr.data;
			}
		}
		return data;
	}

	// 14. Find length of loop in linked list

	public int lengthofLoop() {

		Node slow_ptr = head;
		Node fast_ptr = head;

		int data = 0;

		while (slow_ptr != null && fast_ptr.next != null) {

			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;

			if (slow_ptr == fast_ptr) {
				return countLoop(fast_ptr);
			}
		}
		return data;
	}

	public int countLoop(Node loopNode) {

		Node curNode = head;
		int length = 0;

		while (curNode != loopNode) {
			length++;
			curNode = curNode.next;
		}

		return length;
	}

	

}
