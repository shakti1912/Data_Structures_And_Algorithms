package CircularLinkedList;

/*
 * Split circular linked list(cll) into two halves.
 * Time Complexity: O(n)
 * 
 */
public class SplitCLL
{
	CircularLinkedList cll;
	public SplitCLL(CircularLinkedList l)
	{
		this.cll = l;
	}
	
	/*
	 * If length of list is odd, then first list has one element less than second list.
	 */
	public Node[] split() throws Exception
	{
		Node firstHead = null;
		Node fLast = null;
		Node secondHead = null;
		Node sLast = null;
		Node[] result = new Node[2];
		int length = length();
		int lengthOfSplit = length/2;
		int lengthOfSplit2 = length - lengthOfSplit;
		Node cllFirst = cll.last.next;
		if(cllFirst == null)
		{
			throw new Exception("List is empty");
		}
		int count  = 0;
		
		while(count < lengthOfSplit)
		{
			if(firstHead == null)
			{
				firstHead = cllFirst;
			}
			else
			{
				fLast = cllFirst;
			}
			cllFirst = cllFirst.next;
			count++;
		}
		fLast.next = firstHead;
		count = 0;
		while(count < lengthOfSplit2 && cllFirst != cll.last.next)
		{
			if(secondHead == null)
			{
				secondHead = cllFirst;
			}
			else
			{
				sLast = cllFirst;
			}
			cllFirst = cllFirst.next;
			count++;
		}
		sLast.next = secondHead;
		result[0] = firstHead;
		result[1] = secondHead;
		return result;
	}
	
	/*
	 * finds the length of the list.
	 */
	public int length()
	{
		int count = 0;
		Node current = cll.last;
		do
		{
			count++;
			current = current.next;
		}
		while(current != cll.last);
		return count;
	}

}
