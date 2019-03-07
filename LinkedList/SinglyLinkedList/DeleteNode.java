/*
 * Given a pointer to a node to be deleted, delete the node. Note that we don’t have pointer to head node.
 * Approach: copy next node's data to given node then delete next node because we have  previous node 
 * which is given node.
 */
public class DeleteNode
{
	Node head;
	Node toDelete;
	
	public DeleteNode()
	{	
		toDelete =	 push(2);
		push(4);
	  push(6);
		push(8);
	}

	public Node push(int in)
	{
		Node toInsert = new Node(in);
		if(head == null)
		{
			head = toInsert;
			return head;
		}
		
		toInsert.next = head;
		this.head = toInsert;
		return toInsert;
	}
	
	public void delete()
	{
		//we cannot delete last node with given constraint so we make 
		//last node as dumpy node by deleting content of the last node.
		if(toDelete.next == null)
		{
			toDelete.data = Integer.MIN_VALUE;
			return;
		}
		toDelete.data = toDelete.next.data;
		toDelete.next = toDelete.next.next;
		
	}
	 public  void printList()
     {
        Node tNode = head;
        while (tNode != null) {
           System.out.print(tNode.data+" ");
           tNode = tNode.next;
        }
        System.out.println();
     }

}
