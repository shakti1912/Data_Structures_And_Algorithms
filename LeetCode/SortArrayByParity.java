package LeetCode;

import java.util.Arrays;

public class SortArrayByParity
{
	public static void main(String args[])
	{
		int[] a = {0,2,1,3};
		System.out.println(Arrays.toString(a));
		sortA(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] sortA(int[] a)
	{
		int first = 0;
		int last = a.length-1;
		
		while(last > first)
		{
			if(a[first] % 2 == 0)
			{
				first++;
			}
			else
			{
				if(a[last] % 2 == 0)
				{
					//swap
					int temp = a[last];
					a[last] = a[first];
					a[first] = temp;
				}
				else
				{
					//find  odd from last
					while(last > first && a[last] % 2 != 0)
					{
						last--;
						
					}
					if(last <= 0)
					{
						return a;
					}
					//swap
					int temp = a[last];
					a[last] = a[first];
					a[first] = temp;
					first++;
					last--;
					
					
				}
				
			}
		}
		return a;
		
	}
	

}
