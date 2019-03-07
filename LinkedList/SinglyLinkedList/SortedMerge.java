/*
 *  first linked list a is 5->10->15 and the other linked list b is 2->3->20, 
 *  then SortedMerge() should return a pointer to the head node of the merged list 2->3->5->10->15->20.
 */
public class SortedMerge
{
	public LinkedList merge(LinkedList l1, LinkedList l2)
	{
		LinkedList temp = new LinkedList();
		Node current1 = l1.head;
		Node current2 = l2.head;
		
		while(current1 != null && current2 != null)
		{
			if(current1.data > current2.data)
			{
				temp.insertLast(current2.data);
				current2 = current2.next;
			}
			else if(current1.data < current2.data)
			{
				temp.insertLast(current1.data);
				current1 = current1.next;
			}
			else	// when both nodes are equal
			{
				temp.insertLast(current1.data);
				temp.insertLast(current2.data);
				current1 = current1.next;
				current2 = current2.next;
			}	
			
		}
		
		if(current1 != null)
		{
			while(current1 != null)
			{
				temp.insertLast(current1.data);
				current1 = current1.next;
			}
		}
		else if(current2 != null)
		{
			while(current2 != null)
			{
				temp.insertLast(current2.data);
				current2 = current2.next;
			}
		
		}
		else
		{
			return temp;
		}
		return temp;
		
	}
	
	
	/*
	 * Recursive method to merge two list.
	 */
	public Node recursiveMerge(LinkedList l1, LinkedList l2)
	{
		Node result = null;
		return recursiveMergeHelper(l1.head, l2.head, result);
	}
	public Node recursiveMergeHelper(Node l1, Node l2, Node result)
	{
		if(l1 == null)
		{
			return l2;
		}
		if(l2 == null)
		{
			return l1;
		}
		if(l1.data < l2.data)
		{
			result = l1;
			result.next = recursiveMergeHelper(l1.next, l2, result);
			
			
		}
		if(l1.data >= l2.data)
		{
			result = l2;
			result.next = recursiveMergeHelper(l1, l2.next, result);
		}
		return result;		
		
	}
}
