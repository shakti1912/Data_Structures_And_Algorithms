package Arrays;
// **DONE**
/*
 * Search O(n)
 * Insert O(1)
 * Delete O(n)
 */
public class OpsOnUnsortedArray 
{
	public  int search(int[] a, int key)
	{
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == key)
			{
				return i;
				
			}
		}
		return -1;
		
	}
	public  int insert(int[] a, int insertKey, int n)
	{
		if(n >= a.length)
		{
			return -1;
		}
		a[n] = insertKey;
		return n+1;
		
	}
	
	public  int delete(int[] a, int delKey, int n)
	{
		int index = search(a, delKey);
		if(index == -1)
		{
			System.out.println("Element not found");
			return n;
		}
		
		for(int i=index; i < n-1; i++)
		{
			a[i] = a[i+1];
		}
		return n-1;
		
	}

}
