package linkedList.dll;

public class Test {

	
	
	public static void main(String[] args) {
		
		
		DLL lst = new DLL();
				
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		lst.print();
		
		//lst.reversePrint();
		
		lst.deleteNode(4);
		
		lst.print();
	}
	
	
	
}
