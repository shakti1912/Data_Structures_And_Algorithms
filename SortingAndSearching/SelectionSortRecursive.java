package SortingAndSearching;

import java.util.Arrays;

public class SelectionSortRecursive 
{
	public static void main(String[] args)
	{
		int[] a = {105, 102, 107, 103, 106, 100, 104, 101};
		System.out.println(Arrays.toString(selectionSort(a)));
		
	}
	
	public static int[] selectionSort(int[] a)
	{
		//selection sort
		for(int i = 0; i < a.length; i++)
		{
			int index = 0;
			int small = a[i];
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[j] < small)
				{
					small = a[j];
					index = j;
					
				}
				
			}
			//swap
			int temp = a[i];
			a[i] = small;
			a[index] = temp;
			
		}
		return a;
		
	}


}
