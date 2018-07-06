package Trees;

//this is not done yet. Waiting for insertion and deletion problems on threaded tree.
public class ThreadedBinaryTree 
{
	ThreadedNode root;
	public ThreadedBinaryTree(Object x)
	{
		root = new ThreadedNode(x);
	}

	public void inOrder()
	{
		if(root == null)
		{
			return;
		}
		ThreadedNode current = root;
		while(current.left != null)
		{
			current = current.left;
		}
		while (current != null)
		{
			System.out.print(current.data + " ");

			// If this node is a thread node, then go to
			// inorder successor
			if (current.rightThread)
				current = current.right;
			else // Else go to the leftmost child in right subtree
				current = current.right;
			while(current.left != null)
			{
				current = current.left;
			}
		}
	}
}
