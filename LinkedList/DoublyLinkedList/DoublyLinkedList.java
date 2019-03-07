package DoublyLinkedList;
/*
 * Doubly Linked List (DLL)
 */
public class DoublyLinkedList
{

	public Node head;
	public class Node
	{
		Object data;
		Node next;
		Node previous;
		public Node(Object d)
		{
			data = d;
			next = null;
			previous = null;
		}
	}
	
	public DoublyLinkedList()
	{
		this.head = null;
	}
	
	/*
	//Different insertion operations on DLL.
	//All inserts except insertion at last node are O(1). Insertion at last is O(n)
	//At the front of the DLL
	*/
	public Node insertFront(Object x)
	{
		Node n = new Node(x);
		n.next = head;
		n.previous = null;
		if(head != null)
		{
			head.previous = n;			 
		}
		
		head = n;	
		return n;
	}
	
	//Add node after a given node
	public Node insertAfter(Object x, Node given)
	{
		if(given == null)
		{
			System.out.println("Given node is null. Cannot insert new node at null.");
			return null;
		}
		Node n = new Node(x);
		n.next = given.next;
		if(given.next != null)
		{
			given.next.previous = n;
		}
		given.next = n;
		n.previous = given;
		return n;
	}
	
	//insert add a node at the end
	public Node insertLast(int x)
	{
		Node n = new Node(x);
		n.next = null; // make next of the new node as null because it will be last node
		if(head == null)
		{
			n.previous = null;
			head = n;
			return n;
		}
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = n;
		n.previous = current;
		return n;
	}
	
	//add a node before the given node
	public Node insertBefore(int x, Node given)
	{
		Node n = new Node(x);
		if(given == null)
		{
			System.out.println("Given node is null. Cannot insert new node at null.");
			return null;
		}
		// this means given is the head node then we have to make new node n as the head node
		if(given.previous == null)
		{
			n.next = given;
			given.previous = n;
			n.previous = null;
			head = n;
			return n;
		}
		// now normal case
		Node prev = given.previous;
		n.next = given;
		prev.next = n;
		given.previous = n;
		n.previous = prev;
		return n;	
		
	}
	/*
	 * delete a node.
	 * Time: O(1)
	 * consider all four cases.
	 */
	public void delete(Node del)
	{
		// node is not present in the list
		if(del.previous == null && del.next == null)
		{
			System.out.println("Node is not present in the list.");
		}
		//del is head node.
		else if(del.previous == null)
		{
			head = del.next;
			head.previous = null;
			
		}
		// del is the last node
		else if(del.next == null)
		{
			Node prev = del.previous;
			prev.next = null;
			del.previous = null;
		}
		
		// middle node
		else
		{
			del.next.previous = del.previous;
			del.previous.next = del.next;
		}
	}
	/*
	 * Prints each node of the list
	 */
	public void traversal()
	{
		Node current = head;
		System.out.println("LinkedList traversal. Printing all the nodes.");
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
}
