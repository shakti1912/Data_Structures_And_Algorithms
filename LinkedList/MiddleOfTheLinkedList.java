package LinkedList;

public class MiddleOfTheLinkedList 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ListNode first = new ListNode(1);
		first.next = new ListNode(2);
		first.next.next = new ListNode(3);
		first.next.next.next = new ListNode(4);
		first.next.next.next.next = new ListNode(5);

		ListNode middle = middleNode(first);
		System.out.println(middle.val);



	}

	public static ListNode middleNode(ListNode head) 
	{
		int len = 0;
		ListNode current= head;
		while(current != null)
		{
			len++;
			current = current.next;
		}

		for(int i=0; i < len/2; i++)
		{
			head = head.next;		
		}

		return head;
	}
	
	public static ListNode middleNode2(ListNode head)
	{
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}

