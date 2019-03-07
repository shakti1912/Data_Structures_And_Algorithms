/*
 * swap nodes for two given keys
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 */
public class swapNodes
{
	/*
	 * First: get pointers to two nodes and their previous nodes by searching keys.
	 * Second: check if p1 or p2 is not present, if yes -  exit 
	 * Third: if(one of them is head) : make other node the head of the linkedlist
	 * 		else make both previous pointers point to the other nodes.
	 * Fourth: make two next pointers swap.
	 */
	public void swap(LinkedList LL, int x, int y)
	{
		Node p1 = null;
		Node p2 = null;
		Node p1Prev = null;
		Node p2Prev = null;
		Node prev = null;
		Node temp = null;
		Node current = LL.head;
		while(current != null)
		{
			if(current.data == x)
			{
				p1 = current;
				p1Prev = prev;
			}
			if(current.data == y)
			{
				p2 = current;
				p2Prev = prev;
			}
			prev = current;
			current = current.next;
			
		}
		if(p1 == null || p2 == null)
		{
			System.out.println("One of the element is not present.");
			return;
		}
		//if p1 is the head of the linkedlist
		if(p1Prev == null)
		{
			LL.head = p2;	
		}
		else
		{
			p1Prev.next = p2;
		}
		
		//if p2 is the head of the linkedlist
				if(p2Prev == null)
				{
					LL.head = p1;	
				}
				else
				{
					p2Prev.next = p1;
				}
				
		 temp = p1.next;
		p1.next = p2.next;
		p2.next = temp;
	
	}
}
