package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal 
{
	
	/*
	 * Level Order Traversal.
	 * Time: O(n)
	 */
	public static List<Integer> levelOrderTraversal(Node r)
	 {
		// List<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
		 Queue<Node> queue = new LinkedList<Node>();
		 boolean sameParent = false;
		 Node current = r;
		 queue.add(r);
		 while(!queue.isEmpty())
		 {
			 current = queue.remove();
			 
			 //System.out.print(current.data+ " ");
			 list.add((Integer) current.data);
			 
			 if(current.left != null)
			 {
				 queue.add(current.left);
			 }
			 if(current.right != null)
			 {
				 queue.add(current.right);
			 }
		 }
		 return list;
	 }
	 

	 public static List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int nodeCount = 0;
		while(true)
		{
			ArrayList<Integer> to_Add = new ArrayList<Integer>();
			nodeCount = queue.size();
			if(nodeCount == 0)
			{
				break;
			}
			while(nodeCount > 0)
			{
				Node current = queue.remove();
				to_Add.add((Integer) current.data);

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
			 ret.add(to_Add);
			 //to_Add.clear();
			 
		}
		return ret;
	 }
	 
	 /*
	  * Pretty similar to Level order traversal problem. 
	  * Question: Univalued Binary Tree - A binary tree is univalued if every node in the tree has the same value. Return true if and only if the given tree is univalued.
	  */
	     public boolean isUnivalTree(Node root)
	     {
	         List<Integer> list = levelOrderTraversal(root);
	         
	 		 int sum = 0;
	 		 for(int i=0;i<list.size(); i++)
	 		 {
	 			 sum = sum  + list.get(i);
	 		 }
	 		 // check if first element * length of list is equal to sum of all the elements of the list
	 		 if(list.get(0) * list.size() == sum)
	 		 {
	 			 return true;
	 		 }
	 		 return false;
	     }
	 
	 
	 
	 public  static void main(String args[])
		{
			BinaryTree tree = new BinaryTree();
			   
		        tree.root = new Node(3); 
		        tree.root.left = new Node(9); 
		        tree.root.right = new Node(20); 
		        
		        tree.root.right.left = new Node(15);
		        tree.root.right.right = new Node(7);
		        
		        
		        
		        tree.InorderTraversal(tree.root);
		   
		        System.out.println("Level Order Traversal: Returning List " + levelOrderTraversal(tree.root)); 
		        System.out.println("Level Order: Returning List of Lists : " + levelOrder(tree.root)); 
		    } 
	 
	 
		
	 
	 /*
	  * Wrong approach. Was trying to break the list returned by levelOrderTraversal method but it clearly wont work as we are not getting perfect number of children such as 1,2,4,8,....
	  */
//	 
//	 //break list
	 
//	        List<Integer> list = levelOrderTraversal(root);
//	        // break
//	       int index = 0;
//	       int x = 0;
//	       int len =1;
//	       while(index < list.size())
//	       {
//	    	  // int temp = (int) (index * Math.pow(2, x));
//	    	   ArrayList<Integer> to_Add = break_array(list, index, len);
//	    	   index = (int) Math.pow(2, index);
//	    	   len = len*2;
//	    	   ret.add(to_Add);
//	       }
//	       return ret;
	    }
//	 
//	 public ArrayList<Integer> break_array(List<Integer> l, int start , int len)
//	 {
//		 ArrayList<Integer> ret = new ArrayList<Integer>();
//		 while(start < l.size() && len>=0)
//		 {
//			 ret.add(l.get(start));
//			 start++;
//			 len--;
//		 }
//		 return ret;
//		  
//	 }
