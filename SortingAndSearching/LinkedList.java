package SortingAndSearching;

/*
 * My implementation of linked list.
 * Supports: traversal, three types of insert, three types of delete, 
 */
public class LinkedList 
{
	Node head;

	//to create empty linkedlist
	public LinkedList() {}

	//to create linkedlist with given node
	public LinkedList(int h)
	{
		head = new Node(h);
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
	/*
	 * Printing linked list nodes in reverse order.
	 */
	public void traversalReverse(Node r)
	{
		if(r == null)
		{
			return;
		}

		traversalReverse(r.next);
		System.out.print(r.data + " ");
	}
	/*
	 * print alternative nodes from head to tail then from tail to head
	 */
	public void traversalAlternative(Node r)
	{
			if(r == null)
				return;
			System.out.print(r.data + " ");

			if(r.next != null )
				traversalAlternative(r.next.next);
			System.out.print(r.data + " "); 
	}

	/*
	 * Three different types of insertion in LinkedList
	 * First Insert - Insert at the front of the linked list. 
	 * 			Time : O(1)
	 */
	public Node insert(int in)
	{
		Node toInsert = new Node(in);
		toInsert.next = head;
		this.head = toInsert;
		return toInsert;
	}
	/*
	 * Second Insert - Insert new node after given prev node
	 * Time: O(1)
	 */
	public void insertAfter(int x, Node prev)
	{
		if(prev == null)
		{
			System.out.println("Given node is null. Cannot insert new node at null.");
			return;
		}
		Node toInsert = new Node(x);
		toInsert.next = prev.next;
		prev.next = toInsert;
	}
	/*
	 * Add node at the end of the linked list.
	 * First get to the last node of the list then make the next of the last node the new node.
	 * Time: O(n)
	 */
	public void insertLast(int x)
	{
		Node toInsert = new Node(x);
		toInsert.next = null;
		Node current = head;
		if(head == null)
		{
			head = toInsert;
			return;
		}
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = toInsert;

	}
	/*
	 * delete first node of the list.
	 */
	public void deleteFirst()
	{
		head = head.next;
	}
	/*
	 * Given a ‘key’, delete the first occurrence of this key in linked list.
	 * Time: O(n)
	 */
	public void delete(int x)
	{
		Node current = head;
		Node prev = null;
		//if head is the desired node to be deleted.
		if(head != null && head.data == x)
		{
			deleteFirst();
			return;
		}
		while(current != null)
		{
			if(current.data == x)
			{
				break;
			}
			prev = current;
			current = current.next;

		}
		//if key was not found in the list
		if(current == null)
		{
			System.out.println("Key was not found in the linked list.");
			return;
		}
		//Unlink the node from linked list
		prev.next = current.next;

	}
	/*
	 * Given a singly linked list and a position, delete a linked list node at the given position.
	 * Time: O(n)
	 */
	public void deleteNode(int position)
	{
		//head needs to be removed
		if(position == 0)
		{
			head = head.next;
			return;
		}
		Node current = head;
		Node prev = null;
		int count = 0;
		while(position != count && current != null)
		{
			prev = current;
			current = current.next;
			count++;	
		}
		if(current == null)
		{
			System.out.println("Given Position is bigger than length of the list.");
			return;
		}
		prev.next = current.next;
	}

	/*
	 * Returns head node of the linked list
	 */
	public Node headNode()
	{
		return head;
	}
	/*
	 * Find length of the linkedlist iteratively.
	 * Time O(n)
	 */
	public int length(Node h)
	{
		Node current = h;
		int count = 0;
		while(current != null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	/*
	 * Find length of the linkedlist recursively.
	 * Time O(n)
	 */
	public int lengthRecursively(Node h)
	{
		if(h == null)
		{
			return 0;
		}
		return lengthRecursively(h.next) + 1;
	}

	//Now all methods have there own classes.

	/*
	 * This is a linkedlist method so in this class. 
	 * Search for element if key is given.
	 * 
	 */
	public boolean searchIteratively(int x)
	{
		Node current = head;
		while(current != null){
			if(current.data == x)
			{
				return true;
			}
			current = current.next;
		}
		return false;
	}

	/*
	 * This is a linkedlist method so in this class. 
	 * Search for element if key is given.
	 * 
	 */
	public boolean searchRecursivelyHelper(Node current, int x)
	{
		if(current == null)
		{
			return false;
		}
		else if(current.data == x)
		{
			return true;
		}
		else 
		{
			return searchRecursivelyHelper(current.next, x);
		}

	}
	public boolean searchRecursively(int x)
	{

		Node current = head;

		return searchRecursivelyHelper(current, x);
	}

	public void delete()
	{
		head = null;
	}
}
