package DoublyLinkedList;

import DoublyLinkedList.DoublyLinkedList.Node;

public class DLLTester
{
	public static void main(String[] args)
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		Node h = dll.insertFront(4);
		Node given = dll.insertFront(3);
		Node hh = dll.insertFront(2);
		dll.traversal();
		Node g = dll.insertAfter(1, given);
		dll.insertAfter(0, g);
		dll.insertAfter(-1, g);
		Node last = dll.insertAfter(5, h);
		dll.insertBefore(10, g);
		Node first = dll.insertBefore(-20,hh);
		dll.insertBefore(25, last);
		dll.traversal();
		dll.delete(last);
		dll.traversal();
		
		ReverseDLL rev = new ReverseDLL();
		//rev.reverse();
	}

}
