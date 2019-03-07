/*
 * Given a singly linked list, swap kth node from beginning with kth node from end.
 * Time: 
 */
public class SwapKthNode
{
	LinkedList list;
	public void swapKth(LinkedList l, int k)
	{
		int n = list.length(list.head);
		//if k is greater than length of linkedlist.
		if (n < k)
		{
			return;
		}

        // If x (kth node from start) and y(kth node from end)
        // are same
        if (2*k - 1 == n)
        {
        	return;
        }
        
		list = l;
		Node first = KthNodeFromStart(k);
		Node second = KthFromLast(k);
		//System.out.println(first.data);
		//System.out.println(second.data);

		// using my code for swapping from swapNodes class. 
		swapNodes s = new swapNodes();
		s.swap(l, first.data, second.data);	
	}


	public Node KthNodeFromStart(int k)
	{

		Node current = list.head;
		int count = 0;
		while(current != null && count != k-1) // k-1 because index starts from 0
		{
			count++;
			current = current.next;
		}
		return current;
	}

	public Node KthFromLast(int k)
	{
		int kNew = list.length(list.head) - k + 1;
		//System.out.println(kNew);
		Node current = list.head;
		int count = 0;
		while(current != null && count != kNew-1)
		{
			count++;
			current = current.next;
		}
		return current;
	}




}
