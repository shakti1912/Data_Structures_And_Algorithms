package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumHeightOfBinaryTree
{
	public  static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		   
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);
	        tree.root.left.left.left = new Node(9);
	        tree.root.left.left.left.left = new Node(10);
	        
	        
	        tree.InorderTraversal(tree.root);
	   
	        System.out.println("Height of tree is recursively : " +  
	                                      maxDepth(tree.root)); 
	        System.out.println("Height of tree is iteratively : " +  
                    height(tree.root)); 
	    } 
	
	/*
	 * Maximum depth is the height of the tree.
	 * Time Complexity: O(n)   
	 */
	public static int maxDepth(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		int lHeight = maxDepth(root.left);
		int rHeight = maxDepth(root.right);
		return 1 + Math.max(lHeight, rHeight);
		
	}

	/*
	 * Height of a tree iteratively
	 * Time Complexity: O(n)
	 */
	public static int height(Node root)
	{
		int height = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int nodeCount = 0;
		while(true)
		{
			nodeCount = queue.size();
			if(nodeCount == 0)
			{
				return height;
			}
			height++;
			while(nodeCount > 0)
			{
				Node current = queue.remove();

				 if(current.left != null)
				 {
					 queue.add(current.left);
				 }
				 if(current.right != null)
				 {
					 queue.add(current.right);
				 }
				 nodeCount--;
			}
		}
		
		
		
	}
}
