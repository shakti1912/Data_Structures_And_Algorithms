package Trees;

public class isBST 
{
	public boolean check(BSTNode node)
	{
		if(node == null)
		{
			return true;
		}
		if((int) node.left.data > (int) node.data)
		{
			return false;	
		}
		if((int) node.right.data < (int) node.data)
		{
			return false;
		}
		if(!check(node.left) || !check(node.right))
		{
			return false;
		}
		return true;
		
	}

}
