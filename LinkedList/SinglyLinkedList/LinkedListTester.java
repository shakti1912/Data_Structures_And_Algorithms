
public class LinkedListTester
{
	public static void main(String[] args)
	{
		/*
		LinkedList LL = new LinkedList();
		Node h = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		
		LL.head = h;
		h.next = second;
		second.next = third;
		//LL.head.next.next.next = new Node(6);
		Node head = LL.insert(10);
		//LL.insert(12);
		LL.insertAfter(5, second);
		LL.insertLast(20);
		*/
		//LL.delete(5);
		//LL.deleteNode(5);
		//LL.traversal();
		//LL.traversalReverse(head);
		//System.out.println();
		//LL.traversalAlternative(head);
	//	DeleteLinkedList del = new DeleteLinkedList(LL);
		//del.delete();
		
	//System.out.println(LL.head.data);
		//FindMiddle mid = new FindMiddle(LL);
		//Node middle  = mid.middle();
		//System.out.println("Middle element is " + middle.data);
		//System.out.println(LL.searchIteratively(5));
		//System.out.println(LL.searchRecursively(0));
		//GetNthNode nth = new GetNthNode();
		//int data = (int) nth.GetNth(head, 6);
		//System.out.println(data);
		
		
		
	//LL.deleteNode(2);
		//System.out.println("Deleting node at postion = 2");
		//LL.traversal();
		
	//	int length = LL.length(LL.headNode());
		//System.out.println("Length of the linkedlist using iterative method : " + length);
		
		//int lengthRecursively = LL.lengthRecursively(LL.headNode());
		//System.out.println("Length of the linkedlist using recursive method : " + lengthRecursively);
		
		//swapNodes sN = new swapNodes();
		//sN.swap(LL,5,4);
		//LL.traversal();
		//LL.traversal();
		
		//ReverseLinkedList rev = new ReverseLinkedList();
		//LinkedList reversed = rev.reverse(LL.head);
		//reversed.traversal();
		
		//Node n = rev.reverse2(LL.head);
		//Node c = n;
		//addTwoTester();
		//DeleteNodeTester();
		//SortedMergeTester();
		//swapKthTester();
		
		//countObjectTester(head);
		
		//detectLoopTester();
		//insertSortedTester();
		PalindromeCheckerTester();
		
		//UnionAndIntersectionChecker();
	}
	
	public static void addTwoTester()
	{
		LinkedList l1 = new LinkedList();
		l1.insert(4);
		l1.insert(8);
		//l1.insert(5);
		
		LinkedList l2 = new LinkedList();
		l2.insert(7);
		l2.insert(5);
		l2.insert(4);
		l2.insert(3);
		l2.insert(2);
		AddTwo add = new AddTwo();
		LinkedList sum = add.add(l1, l2);
		System.out.println("Sum is : ");
		sum.traversal();	
	}
	
	public static void DeleteNodeTester()
	{

		DeleteNode del = new DeleteNode();
		del.printList();
		del.delete();
		del.printList();
		
	}
	
	public static void SortedMergeTester()
	{
		LinkedList l1 = new LinkedList();
		l1.insert(15);
		l1.insert(10);
		l1.insert(5);
		l1.insert(2);
		//l1.insert(5);
		
		LinkedList l2 = new LinkedList();
		l2.insert(20);
		l2.insert(3);
		l2.insert(2);
		//l2.insert(3);
		//l2.insert(2);
		SortedMerge sorted = new SortedMerge();
		LinkedList sortedMerge = sorted.merge(l1, l2);
		Node merged = sorted.recursiveMerge(l1, l2);
		while(merged != null)
		{
			System.out.print(merged.data + " ");
			merged = merged.next;
		}
		System.out.println("second method");
		sortedMerge.traversal();
		
	}
	public static void swapKthTester()
	{
		SwapKthNode swap = new SwapKthNode();
		LinkedList l1 = new LinkedList();
		l1.insert(15);
		l1.insert(10);
		l1.insert(5);
		l1.insert(2);
		l1.insert(3);
		l1.traversal();
		swap.swapKth(l1, 3);
		l1.traversal();
		
	}
	
	public static void countObjectTester(Node head)
	{
		CountObject c = new CountObject(head);
		int num = c.count(10);
		System.out.print(num);
	}
	
	public static void detectLoopTester()
	{
		LinkedList LL = new LinkedList();
		Node h = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		
		LL.head = h;
		h.next = second;
		second.next = third;
		third.next = fourth;
		//fourth.next = second;
		
		DetectLoop detect = new DetectLoop(LL.head);
		boolean bool = detect.findLoop();	
		if(bool)
		{
		System.out.print("Loop found");
		}
		else
		{
			System.out.print("Loop not found");
		}
	}
	
	public static void insertSortedTester()
	{
		LinkedList LL = new LinkedList();
		Node h = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		Node fifth = new Node(10);
		
		LL.head = h;
		h.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		SortedInsert in = new SortedInsert(LL);
		in.insertSorted(8);
		in.insertSorted(9);
		in.insertSorted(1);
		LL.traversal();
		
		LinkedList LL2 = new LinkedList();
		SortedInsert in2 = new SortedInsert(LL2);
		in2.insertSorted(1);
		LL2.traversal();
		
	}
	
	
	public static void PalindromeCheckerTester()
	{
		LinkedList LL = new LinkedList();
		Node h = new Node(2);
		Node second = new Node(1);
		Node third = new Node(4);
		Node fourth = new Node(2);
		Node fifth = new Node(2);
		
		LL.head = h;
		h.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		PalindromeChecker check = new PalindromeChecker();
		boolean b = check.checker(LL.head);
		System.out.print(b);
		
	}
	
	public static void UnionAndIntersectionChecker()
	{
		UnionAndIntersectionList UI = new UnionAndIntersectionList();
		LinkedList a = new LinkedList();
		a.insert(20);
		a.insert(4);
		a.insert(15);
		a.insert(10);
		LinkedList b = new LinkedList();
		b.insert(10);
		b.insert(2);
		b.insert(4);
		b.insert(8);
		//LinkedList union = UI.union(a, b);
		LinkedList intersection = UI.intersection(a, b);
		//union.traversal();
		intersection.traversal();
					
	}
	
}
