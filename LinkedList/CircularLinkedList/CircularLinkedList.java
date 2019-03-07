package CircularLinkedList;


public class CircularLinkedList 
{
	Node last;
	public CircularLinkedList()
	{
		last = null;
	}

	//inserting first node when list is empty.
	public Node firstInsert(Object x)
	{
		if(last != null)
		{
			return last;
		}
		Node newNode = new Node(x);
		newNode.next = last;
		last = newNode;
		last.next = last;
		return newNode;
		
	}
	//inserting at the beginning of the list.
	public Node insertStart(Object x)
	{
		if(last == null)
		{
			return firstInsert(x);
		}
		Node newNode = new Node(x);
		newNode.next = last.next;
		last.next = newNode;
		return newNode;
		
	}
	
	//inserting at the end of the list
	public Node insertEnd(Object x)
	{
		if(last == null)
		{
			return firstInsert(x);
		}
		Node newNode = new Node(x);
		newNode.next = last.next;
		last.next = newNode;
		last = newNode;
		return newNode;
			
	}
	
	//inserting between two nodes.
	public Node insertBetweenNodes(Object x, Object after)
	{
		Node newNode = new Node(x);
		if(last == null)
		{
			return null;
		}
		Node current = last.next;
		do
		{
			if(current.data == after)
			{
				newNode.next = current.next;
				current.next = newNode;
				if(current == last)
				{
					last = newNode;
				}
				return newNode;
			}
			
			
			current = current.next;
		}while(current != last.next);
		
		System.out.println(after + " is not present.");
		return null;
		
	}
	
	/*
	 * Prints each node of the list
	 */
	public void traversal()
	{
		System.out.println("last "+ last.data);
		int c =0;
		Node current = last.next;
		System.out.println("LinkedList traversal. Printing all the nodes.");
		
		while(current.data != last.data)
		{
			System.out.print(current.data + " ");
			current = current.next;
			c++;
		}
		System.out.print(last.data + " ");
		c++;
		
		
		System.out.println("length " + c );
	}
}
