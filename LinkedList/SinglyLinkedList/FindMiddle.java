
/*
 * Given a singly linked list, find middle of the linked list. 
 * For example, if given linked list is 1->2->3->4->5 then output should be 3.

 *	If there are even nodes, then there would be two middle nodes, 
 *	we need to print second middle element. For example, 
 *	if given linked list is 1->2->3->4->5->6 then output should be 4.
 */
public class FindMiddle 
{
	LinkedList list;
	public FindMiddle(LinkedList l)
	{
		list = l;
	}
	/*
	 * Time : O(n)
	 */
	public Node middle()
	{
		int length = list.length(list.head);
		Node current = list.head;
		if(list.head == null)
		{
			System.out.println("List is empty.");
			return null;
		}
		for(int i = 0; i < length/2; i++)
		{
			current = current.next;
		}
		return current;
		
	}
	
}
