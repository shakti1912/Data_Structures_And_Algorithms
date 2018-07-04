package MatrixProblems;

public class MatrixTester 
{
	public static void main(String[] args)
	{
		int[][] mat = { {10, 20, 30, 40},
                 		{15, 25, 35, 45},
                 		{27, 29, 37, 48},
                 		{32, 33, 39, 50}};
		
		//SearchMatrix SM = new SearchMatrix();
		//System.out.println(SM.search(mat, 33));
		
		//SpiralFormPrint print = new SpiralFormPrint();
		//print.print(mat);
		
		int[][] mn = {
				{1,0,0,1},
				{0,0,1,0},
				{0,0,0,0}
				
		};
		BooleanMatrix BM = new BooleanMatrix();
		int[][] t = BM.bool(mn);
		
		print(t);
			
	}
	public static void print(int[][] t)
	{
		for(int i = 0; i < t.length ;i++)
		{
			for(int j = 0; j < t[0].length; j++)
			{
				System.out.print(t[i][j]+ " ");
			}
			System.out.println();
			
		}
	}

}
