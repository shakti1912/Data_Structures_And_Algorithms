import java.util.HashMap;
import java.util.Set;

/*
 * Given two Linked Lists, create union and intersection lists that contain union and 
 * intersection of the elements present in the given lists. Order of elments in output lists doesn’t matter.
 * 
 * Time Complexity: O(mn) where m and n are lengths of two linkedlists.
 */
public class UnionAndIntersectionList
{
	//this function doesn't take care of duplicates in linkedlist a.
	public LinkedList union(LinkedList a, LinkedList b)
	{
		
		HashMap<Integer, Node> map = new HashMap<Integer, Node>();
		Node current = a.head;
		while(current != null)
		{
			if(!map.containsKey(current.data))
			{
				map.put(current.data, current);
			}
			current = current.next;
		}
		
		Node c = b.head;
		while(c != null)
		{
			if(!map.containsKey(c.data))
			{
				a.insert(c.data);
			}
			c = c.next;
			
		}
		return a;
		
	}
	
	//
	public LinkedList intersection(LinkedList a, LinkedList b)
	{
		LinkedList result = new LinkedList();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Node current = a.head;
		while(current != null)
		{
			if(!map.containsKey(current.data))
			{
				map.put(current.data, 1);
			}
			current = current.next;
		}
		Node c = b.head;
		while(c != null)
		{
			if(map.containsKey(c.data))
			{
				map.put(c.data, map.get(c.data)+1);
				
			}
			else
			{
				map.put(c.data, 1);
			}
			c = c.next;
			
		}
		
		Set<Integer> s = map.keySet();
		
		for(int i: s)
		{
			if(map.get(i) >= 2)
			{
				result.insert(i);
			}
		}
		return result;		
		
	}

}
