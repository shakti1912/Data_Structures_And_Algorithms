package Arrays;
 // ** DONE **
public class ArrayRotation
{
	/*
	 * Rotate an array by given rotation rot.
	 * Time: O(n)
	 * Space : O(n) because creating extra array
	 */
	public int[] rotation(int[] a, int rot)
	{//
		// creating second array
		int[] temp = new int[a.length];
		int c = 0;
		for(int i = rot; i < a.length;i++)
		{
			temp[c] = a[i];
			c++;
		}
		for(int i = 0; i < rot; i++)
		{
			temp[c] = a[i];
			c++;
		}
		return temp;
		
	}
	/*
	 * Time: O(n*d) where n = length of the array and d = number by which to rotate
	 * Space: O(1)
	 */
	public int[] onebyone(int[] a, int d)
	{
		int temp = a[0];
		for(int i = 0; i < d; i++)
		{
			for(int j = 0; j < a.length-1; j++)
			{
				a[j] = a[j+1];
			}
			a[a.length-1] = temp;
			temp = a[0];
		}
		return a;
	}
	
//	public int[] betterSolution(int[] a)
//	{
//		
//	}

}
