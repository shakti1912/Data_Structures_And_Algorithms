package MatrixProblems;
// ** NOT DONE**
public class SpiralFormPrint 
{
	public void print(int[][] n)
	{
		int colSize = n[0].length;
		int rowSize = n.length;
		
		int i = 0;
		int x = colSize;
		
		for(  i = 0; i < colSize; i++)
		{
			System.out.print(n[i][x] + " ");	
		}
		for(int j = colSize; j >=0 ; j--)
		{
			System.out.print(n[x][j] + " ");
		}
		//for(int x = colSie)
		
	}
}
