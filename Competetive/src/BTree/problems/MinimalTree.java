package BTree.problems;
class TreeNode 
{ 
	int data; 
	TreeNode left, right; 
	public TreeNode(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 
public class MinimalTree
{ 
	//Root of the Binary Tree 
	TreeNode root; 

	int minimumDepth() 
	{ 
		return minimumDepth(root); 
	} 

	
	int minimumDepth(TreeNode root) 
	{ 
		
		if (root == null) 
			return 0; 

		
		if (root.left == null && root.right == null) 
			return 1; 

		
		if (root.left == null) 
			return minimumDepth(root.right) + 1; 

		if (root.right == null) 
			return minimumDepth(root.left) + 1; 

		return Math.min(minimumDepth(root.left), 
						minimumDepth(root.right)) + 1; 
	} 

	public static void main(String args[]) 
	{ 
		MinimalTree mt = new MinimalTree(); 
		mt.root = new TreeNode(1); 
		mt.root.left = new TreeNode(2); 
		mt.root.right = new TreeNode(3); 
		mt.root.left.left = new TreeNode(4); 
		mt.root.left.right = new TreeNode(5); 

		System.out.println("The minimum height of Binary Tree is :" + mt.minimumDepth()); 
	} 
} 
