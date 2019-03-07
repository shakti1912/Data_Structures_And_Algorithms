package CircularLinkedList;
/*
 * Write a function to insert a new value in a sorted Circular Linked List (CLL).
 * Time Complexity: O(n)
 */
public class SortedInsert
{
	public CircularLinkedList cll;
	public SortedInsert(CircularLinkedList l)
	{
		cll = l;
	}
	public void insertInSorted(Object x)
	{
		Node newNode = new Node(x);
		if(cll.last == null)
		{
			newNode.next = cll.last;
			cll.last = newNode;
			cll.last.next = cll.last;
			return;
		}
		Node current = cll.last.next;
		Node prev = cll.last;
		boolean found = false;
		//Node after = null;
		do
		{
			if((int)current.data >= (int) x)
			{
				found = true;
				break;
			}
			else
			{
				prev = current;
				current = current.next;
				
				
			}	
		}while(current != cll.last.next);
		
		if(found)
		{
			newNode.next = prev.next;
			prev.next = newNode;
		}
		else
		{
			
			System.out.println("Position to insert is last. As number to be inserted is greatest.");
			newNode.next = prev.next;
			prev.next = newNode;
			cll.last = newNode;
			
			
		}
	}

}
