package Arrays;

/*
 * Given an array nums, write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
 */

public class MoveZeroes 
{
	public static void main(String args[])
	{
		int[] a = {0,1,0,3,12};
		for(int i=0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		moveZeroes(a);
		for(int i=0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}

	public static void moveZeroes(int[] arr)
	{
		int zeroPointer = -1;
		int nZeroPointer = -1;
		for(int i = 0; i <  arr.length; i++)
		{
			if(arr[i] == 0)
			{
				//swap
				int temp = arr[end];
				arr[i] = temp;
				arr[end] = 0;
				end--;


			}
		}


	}

}

