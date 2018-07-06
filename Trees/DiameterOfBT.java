package Trees;

/*
 * The diameter of a tree (sometimes called the width) is the
 *  number of nodes on the longest path between two leaves in the tree
 */
public class DiameterOfBT 
{
	Node root;
	public DiameterOfBT(Node r)
	{
		root = r;
	}
	
	public int diameter(Node root)
	{
		int nleft = 0;
		int nright = 0;
		if(root == null)
		{
			return  0;
		}
		 nleft +=  diameter(root.left);
		 nright +=  diameter(root.right);
		return 1 + nleft + nright;
		
		
		
	}
	
	public int diameter2(Node root)
	{
		int count = 0;
		if(root == null)
		{
			return 0;
		}
		else
		{
			count = 1;
		}
		Node leftTree = root.left;
		Node rightTree = root.right;
		
		return count;
	}
}
