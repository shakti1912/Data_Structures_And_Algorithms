package Arrays;
// **DONE**
/*
 * Binary Search : O(log n)
 * Insert : O(n) if all the elements need to be moved
 * Delete: O(n) 
 */
public class OpsOnSortedArray 
{

	public int LinearSearch(int[] a, int key)
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

	public  int BinarySearchRecursive(int[] a, int key, int first, int last)
	{
		if(first > last)
		{
			return -1;
		}
		else
		{
			int middle = (first + last)/2;
			if(key < a[middle])
			{
				return BinarySearchRecursive(a, key, 0, middle);
			}
			else if(key > a[middle])
			{
				return BinarySearchRecursive(a, key, middle+1, last);
			}
			else
			{
				return middle;
			}
		}


	}
	
	public int BinarySearchIterative(int[] a, int key, int first, int last)
	{
		int middle = -1;
		while(last >= first)
		{
			middle = (first + last) / 2;
			if(a[middle] == key)
			{
				
				return middle;
			}
			else if(a[middle] < key)
			{
				first = middle + 1;
			}
			else
			{
				last = middle - 1;
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
		int index = 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i] > insertKey)
			{
				index = i;
				break;
			}
		}
		for(int i = n+1; i>index; i--)
		{
			a[i] = a[i-1];

		}
		a[index] = insertKey;
		return index;

	}

	public  int delete(int[] a, int delKey, int n)
	{
		int index = LinearSearch(a, delKey);
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
