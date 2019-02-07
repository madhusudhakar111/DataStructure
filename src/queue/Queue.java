package queue;

public class Queue {

	int arr[];
	int front;
	int rear;
	int length = 0;

	public Queue(int size) {
		super();
		this.arr = new int[size];
		this.front = 0;
		this.rear = 0;
	}

	private void add(int value) {
		arr[rear++] = value;
		length++;

	}

	private int remove() {
		int i = 0;
		int deletedValue = arr[front];

		while (front < length) {
			arr[front] = arr[++front];
		}

		return deletedValue;

	}

	private void print() {
		int length = length();
		;
		int i = 0;
		while (i <= length) {
			System.out.println(arr[i++]);
		}

	}

	private int length() {
		return length;
	}
	
	public int size() {
		return length;
	}

	public static void main(String[] args) {

		Queue queue = new Queue(10);

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);

		int[] i = new int[5];

		i[0] = 2;

		queue.print();

		System.out.println("Removed >>>" + queue.remove());

		queue.print();

	}

}
