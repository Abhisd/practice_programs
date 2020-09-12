package BTree.problems;

class TNode {

	int data;
	TNode left, right;

	public TNode(int item) {
		data = item;
		left = right = null;
	}
}

public class BalancedTree {
	static TNode root;

	int checkHeight(TNode root) {
		if (root == null)
			return -1;

		int leftHeight = checkHeight(root.left);
		if (leftHeight == Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		int rightHeight = checkHeight(root.right);
		if (rightHeight == Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		int heightDifference = leftHeight - rightHeight;

		if (Math.abs(heightDifference) > 1) {
			return Integer.MIN_VALUE;
		} else {

			return Math.max(leftHeight, rightHeight) + 1;
		}

	}

	boolean isBalanced(TNode root) {
		return checkHeight(root) != Integer.MIN_VALUE;

	}

	void inOrder(TNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public static void main(String[] args) {

		BalancedTree tree = new BalancedTree();
		tree.root = new TNode(1);
		tree.root.left = new TNode(2);
		tree.root.right = new TNode(3);
		tree.root.left.left = new TNode(4);
		tree.root.right.right = new TNode(5);

		System.out.println("Balanced Tree???");
		System.out.println(tree.isBalanced(root));
		System.out.println("Tree height is: " + tree.checkHeight(root));
		System.out.println("Tree elements are:");
		tree.inOrder(root);

	}

}
