package queue;

import java.util.Stack;

public class QueueUsingStack {

	
	private Stack<Integer> stack = new Stack();	
	private Stack<Integer> tempstack = new Stack();
	
	
	public void push(int value) {
		stack.add(value);
	}
	
	
	public int pop() {
		
		while(stack.size() >1) {
			tempstack.add(stack.pop());
		}
			
		int removedData = stack.pop();		
		stack = tempstack;
		
		return removedData;		
	}
	
	
	public void print() {
		
		for(int i : stack) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		
		QueueUsingStack stack = new QueueUsingStack();
				
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.print();
		
		System.out.println(" Removed element "+ stack.pop());
		
		
		stack.print();
		
		

	}

}
