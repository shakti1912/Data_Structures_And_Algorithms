/*
 * Given a singly linked list and a key, count number of occurrences of given key in linked list. 
 * For example, if given linked list is 1->2->1->2->1->3->1 and given key is 1, then output should be 4.
 * 
 * Time : O(n)
 */
public class CountObject
{
	Node h;
	public CountObject(Node head)
	{
		h = head;
	}
	
	/*
	 * Recursive solution.
	 */
	public int count(int x)
	{
		return countHelper(x, h);
	}
	
	public int countHelper(int number, Node head)
	{
		if(head == null)
		{
			return 0;
		}
		if(head.data == number)
		{
			return 1 + countHelper(number, head.next);	
		}
		return countHelper(number, head.next);
	}

}
