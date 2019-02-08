package linkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList lst = new LinkedList();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);

		lst.print();
		System.out.println(" Remove First Element");
		lst.removeFirst();
		lst.print();
		System.out.println(" Remove Last Element");
		lst.removeLast();
		lst.print();

	}

}
