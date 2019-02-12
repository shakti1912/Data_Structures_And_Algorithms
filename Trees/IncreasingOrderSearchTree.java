package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Complexity Analysis
 *	Time Complexity: O(N), where N is the number of nodes in the given tree.
 *	Space Complexity: O(N), the size of the answer. 
 */
public class IncreasingOrderSearchTree
{
	 
	ArrayList<Integer> inList = new ArrayList<Integer>();
	    
	    public Node increasingBST(Node root) {
	       ArrayList<Integer> list = inOrderTraversal(root);
	       // list.forEach(System.out::println);
			root.data = list.get(0);
			Node current = root;
	        current.left = null;
	        for(int i=1; i < list.size(); i++)
	        {
	            if(current.right == null)
	            {
	            	Node n = new Node(list.get(i));
	                current.right = n;
	                
	            }
	            else
	            {
	                current.right.data = list.get(i);
	                
	            }
	            current.left = null;
	            current = current.right;
	            
	        }
			
			return root;

		}
		
		public  ArrayList<Integer> inOrderTraversal(Node r)
		{
			if(r == null)
			{
				return null;
			}
			inOrderTraversal(r.left);			//print left subtree
				inList.add((Integer) r.data);	// print node
			inOrderTraversal(r.right);			//print right subtree
			return inList;
		}
	}
