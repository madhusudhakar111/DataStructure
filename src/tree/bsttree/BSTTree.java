package tree.bsttree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTTree {

	Node root;
	Node parent;
	Node cur;

	// 1. INSERTION
	public void add(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		} else {

			cur = root;

			while (cur != null) {
				parent = cur;
				if (cur.data < newNode.data) {
					cur = cur.right;
				} else if (cur.data > newNode.data) {
					cur = cur.left;
				}
			}

			if (parent.data < newNode.data) {
				parent.right = newNode;
			} else if (parent.data > newNode.data) {
				parent.left = newNode;
			}

		}

	}

	// Level Order
	public void BFS() {

		Queue<Node> queue = new LinkedList();
		queue.add(root);

		while (!queue.isEmpty()) {

			Node tempNode = queue.poll();

			System.out.println(tempNode.data);

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}

		}

	}

	/**
	 * DFS Pre Order In Order Post Order
	 * 
	 */

	public void preOrder() {

		Stack<Node> stack = new Stack();
		stack.push(root);

		while (!stack.isEmpty()) {

			Node tempNode = stack.pop();

			System.out.println(tempNode.data);

			if (tempNode.right != null) {
				stack.push(tempNode.right);
			}

			if (tempNode.left != null) {
				stack.push(tempNode.left);
			}

		}
	}
	
	
	public void postOrder() {

		Node currentNode = root;
		Stack<Node> stack1 = new Stack();
		Stack<Node> stack2 = new Stack();

		stack1.push(root);

		while (!stack1.isEmpty()) {

			Node tempNode = stack1.pop();
			stack2.push(tempNode);

			if (tempNode.left != null) {
				stack1.push(tempNode.left);
			}

			if (tempNode.right != null) {
				stack1.push(tempNode.right);
			}

		}
				
		while (!stack2.isEmpty()) {
			
			Node n = stack2.pop();
			System.out.println(n.data);
			
		}

	}

	public void inOrder() {

		Stack<Node> stack = new Stack();
		Node currentNode = root;

		while (currentNode != null || stack.size() > 0) {

			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}

			currentNode = stack.pop();
			System.out.println(currentNode.data);

			currentNode = currentNode.right;

		}

	}

	

}

class Node {

	Node root;
	Node left;
	Node right;
	int data;

	Node(int dt) {
		data = dt;
		root = null;
		left = null;
		right = null;
	}

}