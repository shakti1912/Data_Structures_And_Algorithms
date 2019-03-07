/*
 * Reverse a linkedlist
 */
public class ReverseLinkedList
{
	//Using extra buffer. Time: O(n) Space: O(n)
	public LinkedList reverse(Node headNode)
	{
		LinkedList ret = new LinkedList();
		if(headNode == null)
		{
			System.out.println("LinkedList is empty.");
			return null;
		}
		else if(headNode.next == null)
		{
			ret.insert(headNode.data);
			return ret;
		}
		else
		{
			Node current = headNode;
			
			while(current != null)
			{
				ret.insert(current.data);
				current = current.next;
			}
			return ret;
		}
			
	}
	/*
	 * 
	 */
	public Node reverse2(Node headNode)
	{
		Node current = headNode;	
		
		
		//Node change = current;
		Node prev = null;
		Node next = current.next;
		
		while(current != null)
		{
			
			prev = next;
			next = prev;
			current = current.next;
			
			
		}
		return current;
	}

}
