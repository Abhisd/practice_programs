package BTree.problems;

class Node{
	int data;
	Node left,right;
	
	public Node(int item) {
		data=item;
		left=right=null;
	}
}



public class InvertedBinaryTree {

	Node root;
	
	void mirror() {
		root=mirror(root);
	}
	Node mirror(Node node ) {
		if(node==null)return node;
		Node left=mirror(node.left);
		Node right=mirror(node.right);
		
		//swapping left and right sub trees
		
		node.left=right;
		node.right=left;
		return node;
	}
	
	void inOrder() {
		inOrder(root);
	}
	
	void inOrder(Node node) {
		if(node==null)return;
		
		inOrder(node.left);
		System.out.print(node.data);
		System.out.print(" ");
		inOrder(node.right);
	}
	public static void main(String[] args) {

		InvertedBinaryTree bt=new InvertedBinaryTree();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.right.right=new Node(5);
		
		System.out.println("Binary tree is");
		bt.inOrder();
		
		//Mirroring the Binary tree
		bt.mirror();
		System.out.println("");
		System.out.println("Inverted Binary Tree is");
		bt.inOrder();
	}

}
