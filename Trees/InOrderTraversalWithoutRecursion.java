package Trees;

import java.util.Stack;

/*
 * InOrder traversal of tree without recursion using stack.
 * First push all the left nodes on the stack. Then pop one, print that 
 * and push right of popped and all the left nodes of that right nodes on the stack.
 * Keeping doing this till stack is not empty.
 * Time : O(n)
 */
public class InOrderTraversalWithoutRecursion
{
	Node rootNode;
	public InOrderTraversalWithoutRecursion(Node r)
	{
		rootNode = r;
	}
	public void traversal()
	{
		if(rootNode == null)
		{
			System.out.print("Tree is empty");
		}
		Stack<Node> stack = new Stack<Node>();
		Node current = rootNode;
		
		//push all the left nodes on the stack.
		while(current != null)
		{
			stack.push(current);
			current = current.left;
		}
		
		//traverse the tree.
		while(!stack.isEmpty())
		{
			Node top = stack.pop();
			System.out.print(top.data + " ");
			current = top.right;
			
			//push right and all the left of the right nodes on the stack.
			while(current != null)
			{
				stack.push(current);
				current = current.left;
			}
		}
	}

}
