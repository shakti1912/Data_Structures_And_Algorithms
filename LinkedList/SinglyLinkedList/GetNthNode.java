/*
 * Write a GetNth() function that takes a linked list and an integer index and
 * returns the data value stored in the node at that index position.
 */
public class GetNthNode 
{
	/*
	 * Returns data of the node if it is present else returns -1;
	 * Time Complexity: O(n)
	 */
	public Object GetNth(Node headNode, int index)
	{
		Node cur = headNode;
		while(cur != null && index != 0)
		{
			cur = cur.next;	
			index--;
		}
		if(cur == null)
		{
			//assertFalse("Node not present." ,false);
			return -1;
		}
		else
		{
			return cur.data;
		}
		
	}

}
