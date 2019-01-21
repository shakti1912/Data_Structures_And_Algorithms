package LinkedList;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode first = new ListNode(1);
		first.next = new ListNode(2);
		first.next.next = new ListNode(6);
		first.next.next.next = new ListNode(3);
		first.next.next.next.next = new ListNode(4);
		first.next.next.next.next.next = new ListNode(5);
		first.next.next.next.next.next.next = new ListNode(6);
		
		ListNode n = removeElements(first, 6);
		while(n != null)
		{
			System.out.print(n.val + " ");
			n = n.next;
		}

	}

	public static ListNode removeElements(ListNode head, int val) 
	{
		//		if(head.val == val)
		//		{
		//			head = head.next;
		//		}
		ListNode current = head;
		ListNode prev = head;

		while(current != null)
		{
			if(current.val == val)
			{
				prev.next = current;
				current = current.next;

			}
			else
			{
				prev = current;
				current = current.next;
			}

		}
		return prev;
		


	}
}
