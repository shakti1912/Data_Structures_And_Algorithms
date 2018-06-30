package SortingAndSearching;

public class SortExceptOne
{
	public static void main(String args[])
	{
		
	}
	
	public static int[] sort(int[] a, int k)
	{
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < a.length && i != k; i++)
		{
			small = a[i];
			int j = i;
			for( int j = i; j < a.length && j != k; j++)
			{
				if (small > a[j])
				{
					small = a[j];
				}
					
				
			}
			//swap
			int temp = a[i];
			a[i] = small;
			a[j] = temp;
		}
		
	}

}
