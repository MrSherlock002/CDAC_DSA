package com.acts;

public class BST {
	Node root;
	static int counter =0;
	static int element = 0;
	static Boolean flag = false;

	static class Node{
		int data;
		Node lchild;
		Node rchild;



		Node(int element){
			this.data = element;
			lchild = null;
			rchild = null;
		}

		boolean isLeaf() {
			return lchild == null ? rchild == null : false;
		}
	}



	public BST() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}


	public int countLeafNodes() {
		return countLeaves(root);
	}

	public int countLeaves(Node a) {
		if(a==null) {
			return 0;
		}
		if(a.isLeaf()) {
			return 1;
		}
		else {
			return countLeaves(a.lchild) + countLeaves(a.rchild);
		}
	}

	public int freqCounter(int element) {
		this.element = element;
		return freqcnt(element);

	}
	public int freqcnt(int element) {		
		preOrder(this.root);
		return this.counter;
	}



	void insertInTree(Node ptr, int data) {
		if(ptr==null) {
			ptr = new Node(data);
			this.root = ptr;
		}
		else {
			if(ptr.data>data && ptr.lchild!=null) {
				insertInTree(ptr.lchild, data);
			}
			else if(ptr.data>data) {
				ptr.lchild = new Node(data);
			}
			else if(ptr.data<data && ptr.rchild!=null) {
				insertInTree(ptr.rchild, data);
			}
			else {
				ptr.rchild = new Node(data);
			}
		}
	}

	public void preOrder(Node root) {
		if(root==null) {
			return;
		}
		//Step 1 : Process the root node.
		System.out.print(" "+root.data);
		if(root.data == element) {
			counter +=1;
		}

		//Step 2 : Process the root's left side.
		if(root.lchild!=null) {
			preOrder(root.lchild);
		}

		//Step 3 : Process the root's right side.
		if(root.rchild!=null) {
			preOrder(root.rchild);
		}
	}



	public void inOrder(Node root) {
		
		
		if(root==null) {
			return;
		}
		//Step 1 : Process the root's left side.
		if(root.lchild!=null) {
			inOrder(root.lchild);
		}
		
		//Step 2 : Process the root node.
		System.out.print(" "+root.data);
		if(root.data==element) {
			flag=true;
		}

		//Step 3 : Process the root's right side.
		if(root.rchild!=null) {
			inOrder(root.rchild);
		}
	}


	public void postOrder(Node root) {
		if(root==null) {
			return;
		}
		//Step 1 : Process the root's left side.
		if(root.lchild!=null) {
			postOrder(root.lchild);
		}

		//Step 2 : Process the root's right side.
		if(root.rchild!=null) {
			postOrder(root.rchild);
		}

		//Step 3 : Process the root node.
		System.out.print(" "+root.data);
	}
	
	public void ElementSearch(int element) {
		this.element =element;
		inOrder(root);
		if(flag==true) {
			System.out.println("\nWe found the element");
		}
		else {
			System.out.println("\nElement not found.");
		}
	}

	public int heightOfTree(Node temp) {

		if(root==null) {
			System.out.println("Tree is empty.");
			return 0;
		}
		else {
			int leftHeight = 0, rightHeight = 0;

			//Calculate the height of left subtree.
			if(temp.lchild != null) {
				leftHeight = heightOfTree(temp.lchild);
			}
			//Calculate the height of right subtree.
			if(temp.rchild != null) {
				rightHeight = heightOfTree(temp.rchild);
				}
			int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;
			return (max+1);
			}
		}
	}
