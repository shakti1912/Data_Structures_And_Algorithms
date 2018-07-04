package MatrixProblems;
// **Done**
/*
 * Given an n x n matrix and a number x, find position of x in the matrix if it is present in it. Else print “Not Found”. 
 * In the given matrix, every row and column is sorted in increasing order.
 *  The designed algorithm should have linear time complexity.
 */
public class SearchMatrix 
{
	/*
	 * Time Complexity: O(n)
	 */
	public String search(int[][] n, int x)
	{
		int colSize = n[0].length;
		int rowSize = n.length;
		int row = -1;;
		for(int i = 0; i < rowSize; i++)
		{
			if((n[i][0] <= x) && (n[i][colSize-1] >= x))
			{
				row = i;
			}
		}
		if(row == -1)
		{
			return "Not Found";
		}
		for(int j = 0; j < colSize; j++)
		{
			if(n[row][j] == x)
			{
				return "("+row+"," +j+")";
			}	
		}
		return "Not found";
		
		
		
		
		
	}

}
