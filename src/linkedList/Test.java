package linkedList;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		LinkedList lst = new LinkedList();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(1);

		lst.print();
	
		/**	System.out.println(" Remove First Element");
		lst.removeFirst();
		lst.print();
		System.out.println(" Remove Last Element");
		lst.removeLast();
		lst.print();
		*/
		
		/**
		System.out.println(" Remove Node");
		lst.removeNode(3);
		lst.print();
		*/
		
		
	   /**System.out.println(" Remove Position");
		lst.removePosition(4);
		lst.print();
		*/
		
		/**
		 * System.out.println(" Get Count"); 
		 * System.out.println(lst.getCount());
		 */
				
		 /** System.out.println(" Find Nth node "); 
		  System.out.println(lst.findNthNode(4));
		   
		*/
		
		
		/**
		 * System.out.println(" Find Nth node from end of Linked List ");
		 * System.out.println(lst.nthNodefromEnd(2));
		 */
		

		
		  System.out.println(" Find count for given elements  Linked List ");
		  System.out.println(lst.countGivenInt(1));
		  
		  
		 
		
		
	}

}
