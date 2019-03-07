package Trees;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BinarySearchTree 
{
	public BSTNode root;
	public BinarySearchTree()
	{
		root = null;
	}

	/**************************************
	 *             Seach Methods
	 **************************************/

	/*
	 * search for an element recursively. 
	 * Time: O(h) where h is the height of  tree.
	 */
	public BSTNode search(BSTNode r, Object x)
	{
		if(r == null || r.data == x)
		{
			return r;
		}
		if((int) x < (int) r.data )
		{
			return search(r.left, x);
		}
		return search(r.right, x);
	}

	/*
	 *search for an element iteratively. 
	 * Time: O(h) where h is the height of  tree. 
	 */
	public BSTNode searchIterative(BSTNode r, Object x)
	{
		while(r != null)
		{
			if(r.data == x)
			{
				return r;
			}
			else if((int)x < (int) r.data)
			{
				r = r.left;
			}
			else
			{
				r = r.right;
			}
		}
		throw new NoSuchElementException("Element not found");
	}
	
	/*
	 * Returns height of the tree. Recursive method
	 */
	public int heightRecursive(BSTNode root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			int leftHeight = heightRecursive(root.left);
			int rightHeight = heightRecursive(root.right);
			
			if(leftHeight > rightHeight)
			{
				return leftHeight+1;
			}
			else
			{
				return rightHeight+1;
			}
		}
	}
	
	/*
	 * Returns height of the tree. Iterative method
	 */
	public int heightIterative(BSTNode root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			BSTNode current = root;
			int leftHeight = 1;
			int rightHeight = 1;
			while(current.left != null || current.right != null)
			{
				if(current.left)
			}
			
			
			if(leftHeight > rightHeight)
			{
				return leftHeight+1;
			}
			else
			{
				return rightHeight+1;
			}
		}
	}
	
	
	

	/************************************
	 *       Different Traversals
	 ************************************/

	/*
	 * Inorder traversal prints bst in increasing order.
	 * Time: O(n)
	 */
	public void inOrderTraversal(BSTNode r)
	{
		if(r == null)
		{
			return;
		}
		inOrderTraversal(r.left);			//print left subtree
		System.out.print(r.data + " ");		// print node
		inOrderTraversal(r.right);			//print right subtree
	}	

	/*
	 * Preorder traversal.
	 * Time: O(n)
	 */
	public void preOrderTraversal(BSTNode r)
	{
		if(r == null)
		{
			return;
		}

		System.out.print(r.data + " ");		// print node
		preOrderTraversal(r.left);			//print left subtree
		preOrderTraversal(r.right);			//print right subtree
	}	

	/*
	 * Postorder traversal.
	 * Time: O(n)
	 */
	public void postOrderTraversal(BSTNode r)
	{
		if(r == null)
		{
			return;
		}
		postOrderTraversal(r.left);			//print left subtree
		postOrderTraversal(r.right);			//print right subtree
		System.out.print(r.data + " ");		// print node
	}	
	/*
	 * Level Order Traversal. Level order traversal of a tree is breadth first traversal for the tree. 
	 * (This is using a queue)
	 * Time: O(n)
	 */public void levelOrderTraversal(BSTNode r)
	 {
		 Queue<BSTNode> queue = new LinkedList<BSTNode>();
		 BSTNode current = r;
		 queue.add(r);
		 while(!queue.isEmpty())
		 {
			 current = queue.remove();
			 System.out.print(current.data+ " ");
			 if(current.left != null)
			 {
				 queue.add(current.left);
			 }
			 if(current.right != null)
			 {
				 queue.add(current.right);
			 }
		 }
	 }
	 
	 /*
		 * Level Order Traversal. Level order traversal of a tree is breadth first traversal for the tree. 
		 * (This is using a without queue)
		 * Time: O(n)
		 */public void levelOrderTraversalWithoutQueue(BSTNode r)
		 {
			 
			 

		 }



	 /******************************************
	  *       Minimum && Maximum Methods
	  ******************************************/

	 /*
	  * find minimum node in the tree.
	  * Time: O(h)
	  */
	 public BSTNode minimum(BSTNode r)
	 {
		 if(r == null)
		 {
			 System.out.println("Tree is empty.");
			 return null;
		 }
		 if(r.left == null)
		 {
			 return r;
		 }
		 return minimum(r.left);
	 }
	 /*
	  * find maximum node in the tree.
	  * Time: O(h) but O(n) in case of left skewed trees.
	  */
	 public BSTNode maximum(BSTNode r)
	 {
		 if(r == null)
		 {
			 System.out.println("Tree is empty.");
			 return null;
		 }
		 if(r.right == null)
		 {
			 return r;
		 }
		 return maximum(r.right);
	 }


	 /*
	  * Find successor of the given node.
	  */
	 public BSTNode successor(BSTNode r)
	 {
		 BSTNode succ = null;
		 if(r.right != null)
		 {
			 return minimum(r.right);
		 }
		 else
		 {
			 return null; //finish this later.
		 }
	 }
	 /*
	  * Insert element in BST.
	  * Time: O(h)
	  */
	 public BSTNode insert(Object x)
	 {
		 BSTNode toInsert = new BSTNode(x);
		 BSTNode temp = null;
		 BSTNode current = root;
		 while(current != null)
		 {
			 temp = current;
			 if((int) current.data >= (int) x)
			 {
				 current = current.left;
			 }
			 else
			 {	
				 current = current.right;
			 }	
		 }
		 if(temp == null)	// tree is empty
		 {
			 root = temp;
		 }
		 if((int) temp.data >(int) x)
		 {
			 temp.left = toInsert;		
		 }
		 else
		 {
			 temp.right = toInsert;
		 }
		 return toInsert;
	 }
	 /*
	  * insert recursively. This method does not need to keep track of parent pointer.
	  * Time: O(h)
	  */
	 public BSTNode insertRecursive( BSTNode root, int key)
	 {
		 if (root == null)
		 {
			 root = new BSTNode(key);
			 return root;
		 }
		 if (key < (int) root.data)
		 {
			 root.left = insertRecursive(root.left, key);
		 }
		 else if (key > (int)root.data)
		 {
			 root.right = insertRecursive(root.right, key);
		 }
		 return root;
		 //insertRecursiveHelper(root, root, new BSTNode(x));	// uncomment this if wanna use helper method.
	 }

	 /*
	  * This insert recursive method needs to keep track of the node where we need insert new node therefore one
	  * more argument.
	  * Time: O(h)
	  */
	 public BSTNode insertRecursiveHelper(BSTNode rootNode, BSTNode parent, BSTNode toInsert)
	 {
		 if(rootNode == null)
		 {
			 if((int) parent.data >= (int) toInsert.data)
			 {
				 parent.left = toInsert;
				 return toInsert;
			 }
			 else
			 {
				 parent.right = toInsert;
				 return toInsert;
			 }
		 }
		 if((int) rootNode.data >= (int) toInsert.data)
		 {
			 return insertRecursiveHelper(rootNode.left, rootNode, toInsert);
		 }
		 return insertRecursiveHelper(rootNode.right, rootNode, toInsert);
	 }
	 /*
	  * Delete operation 
	  */
	 public BSTNode delete(BSTNode del)
	 {
		 BSTNode toDelete = del;
		 if(del.left == null && del.right == null)
		 {
			 del = null;

		 }
		 return toDelete;

	 }
}


