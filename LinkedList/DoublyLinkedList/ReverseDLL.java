package DoublyLinkedList;

import DoublyLinkedList.DoublyLinkedList.Node;

public class ReverseDLL
{
	public void reverse(DoublyLinkedList dll)
	{
		Node current = dll.head.next;
		Node first = dll.head;
		Node prev = null;
		Node next = null;
		while(current != null)
		{
			next= current.next;
			prev = current.previous;
			current.next = prev;
			current.previous = next;
		}
		first.next = null;
		first.previous = current;
		dll.head = current;
		current.previous = null;
		
		
	}

}
