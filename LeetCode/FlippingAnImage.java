package LeetCode;

import java.util.Arrays;

public class FlippingAnImage 
{
	public static int[][] flipAndInvertImage(int[][] A)
	{
		//flip
		int f = 0;
		int l = A[0].length-1;
				
		for(int i=0; i < A.length;i++)
		{
			while(l > f)
			{
				int temp = A[i][f];
				A[i][f] = A[i][l];
				A[i][l] = temp;
				f++;
				l--;
			}
			f =0;
			l = A[0].length -1;
				
		}
		//invert
		for(int i=0; i < A.length; i++)
		{
			for(int j=0; j<A[0].length; j++)
			{
				if(A[i][j] == 0)
				{
					A[i][j] = 1;
				}
				else
				{
					A[i][j] = 0;
				}
			}
		}
		return A;

		
	}

	public static void main(String args[])
	{
		
		int[][] a = {{1,1,0},{1,0,1},{0,0,0}};
		System.out.println("Array before operation");
		printArrays(a);
		flipAndInvertImage(a);
		System.out.println("Array after operation");
		printArrays(a);
	}
	
	public static void printArrays(int[][] A)
	{
		for(int i=0; i < A.length; i++)
		{
			for(int j=0; j<A[0].length; j++)
			{
				System.out.print(A[i][j]);
			}
			System.out.println();
		
		}
	}
}
