package CircularLinkedList;

public class CLLTester
{

	public static void main(String[] args) throws Exception
	{
		/*
		CircularLinkedList cll = new CircularLinkedList();
		cll.firstInsert(10);
		cll.insertStart(5);
		cll.insertEnd(20);
		cll.insertBetweenNodes(15, 10);
		cll.insertBetweenNodes(8, 5);
		cll.insertBetweenNodes(25, 20);
		cll.traversal();
		
		System.out.println("cll2 ");
		CircularLinkedList cll2 = new CircularLinkedList();
		SortedInsert in2 = new SortedInsert(cll2);
		in2.insertInSorted(2);
		in2.insertInSorted(1);
		in2.cll.traversal();
		SortedInsert in = new SortedInsert(cll);
		
		in.insertInSorted(13);
		in.cll.traversal();
		in.insertInSorted(30);
		in.insertInSorted(1);
		in.insertInSorted(14);
		
		in.cll.traversal();
		*/
		CircularLinkedList cll = listReturn();
		SplitCLL split = new SplitCLL(cll);
		System.out.println("length is " + split.length());
		Node[] nodes = split.split();
		System.out.print("First List: ");
		printList(nodes[0]);
		System.out.print("Second List: ");
		printList(nodes[1]);
		
		
	}
	public static CircularLinkedList listReturn()
	{
		CircularLinkedList cll = new CircularLinkedList();
		cll.firstInsert(10);
		cll.insertStart(5);
		cll.insertEnd(20);
		cll.insertBetweenNodes(15, 10);
		cll.insertBetweenNodes(8, 5);
		//cll.insertBetweenNodes(25, 20);
		return cll;
	}
	
	public static void printList(Node node)
	{
		Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
        System.out.println();
		
	}
}
