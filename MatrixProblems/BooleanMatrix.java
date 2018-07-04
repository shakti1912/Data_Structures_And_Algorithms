package MatrixProblems;

// **Done**
public class BooleanMatrix 
{
	/*
	 * Using temporary matrix.
	 * Time : O(m*n)
	 * Space: O(m*n)
	 */
	public int[][] bool(int[][] n)
	{
		int[][] temp = new int[n.length][n[0].length];
		for(int i = 0; i < n.length; i++)
		{
			for (int j = 0; j < n[0].length; j++)
			{
				if(n[i][j] == 1)
				{
					for(int x = 0; x < temp.length; x++)
					{
						temp[x][j] = 1;
					}
					for(int x = 0; x < temp[0].length; x++)
					{
						temp[i][x] = 1;
					}
				}
				
			}
		}
		return temp;
	}
	
	/*
	 * 
	 */
	

}
