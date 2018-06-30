package SortingAndSearching;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		int[] a = {105, 102, 107, 103, 106, 100, 104, 101};
		System.out.println("Array before Bubble Sort : " + Arrays.toString(a));
		System.out.println("Array after Bubble Sort " + Arrays.toString(bubbleSort(a)));
	}
	
	public static int[] bubbleSort(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			int current = a[i];
			for( int j = 1; j < a.length; j++)
			{
				if(a[j] < current)
				{
					a[i] = a[j];
				}
				
			}
			
		}
		
	}

}
