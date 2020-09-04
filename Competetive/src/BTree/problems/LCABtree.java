package BTree.problems;
//finding Least Common Ancestor for pair of nodes
class Tree {

	int data;
	Tree left, right;

	public Tree(int item) {
		data = item;
		left = right = null;
	}
}

public class LCABtree {
	static Tree root;

	Tree findLCA(int n1, int n2) {
		return findLCA(root, n1, n2);
	}

	Tree findLCA(Tree node, int n1, int n2) {
		//checking root
		if (node == null)
			return null;
		//if root of nodes n1 and n2 is same then return that node
		if (node.data == n1 || node.data == n2) {
			return node;
		}
		//recursively checking for  left of the node and right of the node
		//if leftLCA and rightLCA are not null then return the root node of the 
		//left node and right node
		Tree left_lca = findLCA(node.left, n1, n2);
		Tree right_lca = findLCA(node.right, n1, n2);

		if (left_lca != null && right_lca != null) {
			return node;
		}

		//if left_lca is not null then return it otherwise return right_lca.
		return (left_lca != null) ? left_lca : right_lca;

	}
	//to show the binary tree 
	//root at the middle
	void inOrder(Tree root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.data+" ");
			inOrder(root.right);
		}
	}
	public static void main(String[] args) {

			LCABtree tree=new LCABtree();
			LCABtree.root=new Tree(1);
			LCABtree.root.left=new Tree(2);
			LCABtree.root.right=new Tree(3);
			LCABtree.root.left.left=new Tree(4);
			LCABtree.root.left.right=new Tree(5);
			LCABtree.root.right.left=new Tree(6);
			LCABtree.root.right.right=new Tree(7);
			System.out.println("Binary tree :");
			tree.inOrder(root);
			System.out.println("LCA of (4,5) is "+tree.findLCA(4, 5).data);
			
	}

}
