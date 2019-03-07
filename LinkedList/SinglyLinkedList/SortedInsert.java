/*
 *	Given a sorted linked list and a value to insert, write a function to insert the value in sorted way
 */
public class SortedInsert 
{
public LinkedList list;
	public SortedInsert(LinkedList l)
	{
		list = l;
	}
	
	// Time: O(n)
	//Using two pointers.
	// Another approach: one pointer but keep track of current.next in the loop.
	public void insertSorted(int x)
	{
		Node newNode = new Node(x);
		Node current = list.head;
		Node previous = null;
		while(current != null)
		{
			if(current.data >= (int) x)
			{
				break;
			}
			previous = current;
			current = current.next;	
		}

		if(previous == null)		// to be inserted elements is the smallest
		{
			newNode.next = list.head;
			list.head = newNode;
			
		}
		else if(previous.next != null)		// insert between two nodes case.
		{
			newNode.next = previous.next;
			previous.next = newNode;
		}
		else						// insert at last.
		{
			previous.next = newNode;
		}
		
	}
}
