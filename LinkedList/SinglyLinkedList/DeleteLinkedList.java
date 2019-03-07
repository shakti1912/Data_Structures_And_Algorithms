/*
 * Delete linked list.
 * In Java, automatic garbage collection happens, so deleting a linked list is easy. We just need to change head to null.
 */
public class DeleteLinkedList 
{
	public LinkedList list;
	
	public DeleteLinkedList(LinkedList l)
	{
		list = l;	
	}
	
	public void delete()
	{
		list.head = null;
	}
}
