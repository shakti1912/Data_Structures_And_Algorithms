package Trees;

public class MergeBinaryTrees
{
	public Node mergeTrees(Node t1, Node t2)
	{
		Node res = null;
		if(t1 == null && t2 == null)
		{
			return res;
		}
		else if( t1 == null)
		{
			return t2;
		}
		else if(t2 == null)
		{
			return t1;
		}
		else
		{
			 res = new Node((int)t1.data + (int)t2.data);
		}
			
		
		while(t1 != null || t2 != null)
		{
			//left
			res.left = new Node((int)t1.left.data + (int)t2.left.data);
			t1 = t1.left;
						
			//right
			res.right = new Node((int)t1.right.data + (int)t2.right.data);
					
		}
		
		
		
	}

}
