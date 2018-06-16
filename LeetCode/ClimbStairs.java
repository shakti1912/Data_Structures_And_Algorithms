package LeetCode;

public class ClimbStairs
{
	public static int[] table;
	public static int climbStairs(int n) 
	{
		table[0] = 1;
		table[1] = 1;
		if(n == 0)
		{
			return table[0];
		}
		if(n == 1)
		{
			return table[1];
		}
		if(table[n-1] == 0)
		{
			int l = climbStairs(n-1);
			table[n-1] = l;
			
		}
		if(table[n-2] == 0)
		{
			int ll = climbStairs(n-2);
			table[n-2] = ll;
		}
		return table[n-1] + table[n-2];
		

	}
	
	public static void main(String args[])
	{
		int n = 23;
		table = new int[n];
		System.out.println(climbStairs(n));
	}
}


//function (t, precision, width)
//{
//	return 
//}
//format().center(width)