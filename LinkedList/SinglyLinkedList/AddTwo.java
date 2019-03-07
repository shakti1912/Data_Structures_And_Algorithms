/*
 * Input:
  First List: 5->6->3  // represents number 365
  Second List: 8->4->2 //  represents number 248
Output
  Resultant list: 3->1->6  // represents number 613
  
  Time Complexity: O(m + n) where m and n are number of nodes in first and second lists respectively.
 */
public class AddTwo 
{
	
	public LinkedList add(LinkedList n1, LinkedList n2)
	{
		LinkedList ret = new LinkedList();
		int sum =0;
		int carry = 0;
		int s = 0;
		Node current1 = n1.head;
		Node current2 = n2.head;
		while(current1 != null && current2 != null)
		{ 
			s = current1.data + current2.data ;
			s  = s  + carry;
			if(s > 9)
			{
				carry = 1;
				ret.insertLast(s%10);
			}
			else
			{
				carry = 0;
				ret.insertLast(s);
			}
			current1 = current1.next;
			current2 = current2.next;
		}
		
		if(current1 != null)
		{
			s = carry + current1.data;
			while(current1 != null)
			{
				if(s > 9)
				{
				 ret.insertLast(s%10);
				 carry = 1;
				}
				else
				{
					carry =0;
					ret.insert(s);
				}
				current1 = current1.next;
			}
		}
		if(current2 != null)
		{
			s = carry + current2.data;
			while(current2 != null)
			{
				s = carry + current2.data;
				if(s > 9)
				{
				 ret.insertLast(s%10);
				 carry = 1;
				}
				else
				{
					carry =0;
					ret.insertLast(s);
				}
				current2 = current2.next;
			}
		}
		
		return ret;
	}

}
