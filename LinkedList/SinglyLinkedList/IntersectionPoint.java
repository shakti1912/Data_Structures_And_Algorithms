import java.util.HashMap;

public class IntersectionPoint
{
	public Node point(Node l1, Node l2)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		while(l1 != null)
		{
			map.put(l1.hashCode(), 1);
			l1 = l1.next;
			
		}
		while(l2 != null)
		{
			if(map.containsKey(l2.hashCode()))
			{
				return l2;
			}
			l2 = l2.next;
			
		}
		System.out.print("There is no intersection");
		return null;
		
		
		
	}
	
	public int h(Node n)
	{
		if( n == null)
		{
			return 0;
		}
		return n.data*17 + n.next.hashCode();
	}
	
	public Node point2(Node l1, Node l2)
	{
		
	}

}
