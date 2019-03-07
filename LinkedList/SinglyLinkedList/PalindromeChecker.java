import java.util.Stack;

/*
 * Given a singly linked list of characters, write a function that returns true if the given list is palindrome, else false.
 */
public class PalindromeChecker
{

	/*
	 * Using a stack
	 * Time is O(n), but it requires O(n) extra space
	 */
	public boolean checker(Node n)
	{
		Stack<Node> stack = new Stack<Node>();
		Node current = n;
		while(current != null)
		{
			stack.push(current);
			current = current.next;
		}
		
		Node secondRun = n;
		while(secondRun != null)
		{
			if(stack.pop().data != secondRun.data)
			{
				return false;
			}
			secondRun = secondRun.next;
		}
		return true;
	}
	
	/*
	 * Using recursive method to check if list is palindrome
	 */
	public boolean recursiveChecker(Node n)
	{
		if(n == null)
		{
			return false;
		}
		boolean b = recursiveChecker(n.next);
		//if(n.data ==  null  )
		//need to finish this
		return true;
	}
	
}
