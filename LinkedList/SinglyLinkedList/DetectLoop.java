import java.util.HashMap;

/*
 * Given a linked list, check if the the linked list has loop or not. Below diagram shows a linked list with a loop/
 */
public class DetectLoop 
{
	Node headNode;
	public DetectLoop(Node h)
	{
		headNode = h;
	}
	/*
	 * using hash table to keep track of visited node.
	 * Time: O(n)
	 * Space: O(n)
	 * Other ways: Change linked list data structure to have one more flag called visited. Now, when traversing 
	 * set this flag to true. if current node has visited flag true return loop found.
	 */
	public boolean detect()
	{
		Node current = headNode;
		HashMap<Integer, Node> map = new HashMap<Integer, Node>();
		while(current != null)
		{
			int hash = current.hashCode();
			if(map.containsKey(hash))
			{
				return true;
			}
			else
			{
				map.put(hash, current);
			}
			current = current.next;
		}
		return false;
		 
	}
	/*
	 * Using floyd-Cycle finding algorithm.
	 * Two pointers. One moving one by one and second jumping two nodes.
	 * Time: O(n)
	 * Space: O(1)
	 */
	public boolean findLoop()
	{
		Node fast = headNode;
		Node slow = headNode;
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				return true;
			}
		}
		return false;
	}
	
}
