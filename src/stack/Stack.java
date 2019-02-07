package stack;

public class Stack {

	int arr[];
	int top = -1;

	public Stack(int size) {
		super();
		this.arr = new int[size];

	}

	private void push(int value) {
		arr[++top] = value;
	}

	private int pop() {
		return arr[top--];
	}

@Override
protected Object clone() throws CloneNotSupportedException {	
	// TODO Auto-generated method stub
	return super.clone();
}
	
	private void print() {
		int size = size();
		while(size != -1 ) {
			System.out.println(arr[size--]);
		}
		

	}

	private int size() {
		return top;
	}
	
	
	
	public static void main(String[] args) {

		Stack stack = new Stack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		stack.print();
		System.out.println("Removed >>"+stack.pop());
		
		stack.print();
	}

}
