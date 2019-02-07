package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

;

public class StackUsingQueue {

	private Queue <Integer> queue = new LinkedList();
	private Queue tempQueue = new LinkedList<Integer>();

	public void push(int value) {
		queue.add(value);
	}

	public int pop() {
		
		if(queue.size() == 0) {
			System.out.println("Nothing to pop");
			return -1;
		}
		
		while (queue.size() > 1) {
			tempQueue.add(queue.remove());
		}

		int removedData = (int) queue.remove();
		queue = tempQueue;
		return removedData;
	}
	
	
	
	public void print() {
		
		for(int i : queue) {
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		
		StackUsingQueue queue = new StackUsingQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		
		queue.print();
		System.out.println("Removed Element  >>>"+ queue.pop());
		queue.print();


	}

}
