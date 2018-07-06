package Trees;

/*
 * Binary tree node class that contains data and pointers to left child and right child.
 */
public class Node
{
	public Object data;
	public Node left;
	public Node right;
	
	public Node(Object x)
	{
		data = x;
		left = right = null;		
	}

}
