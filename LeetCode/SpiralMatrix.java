package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) 
	{
		List<Integer> list = new ArrayList<Integer>();
		if(matrix.length == 0)
		{
			return list;
		}
		int m = matrix.length; //4
		int n = matrix[0].length; // 7
		
		for(int i= 0; i < matrix.length/2+1; i++)		
		{
					
			for(int a = i; a < n-i; a++)
			{
				list.add(matrix[i][a]);		
			}
			
			for(int b = i+1; b < m-i; b++)
			{
				list.add(matrix[b][n-i-1]);		
			}
			for(int c = n-2-i; c >= i; c--)
			{
				list.add(matrix[m-i-1][c]);		
			}
			for(int d = m-2-i; d >= i+1; d--)
			{
				list.add(matrix[d][i]);		
			}
			
		}
		return list;	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				 { 1, 2, 3, 4,21},
//			     {5, 6, 7, 8,22},
//			     {9,10,11,12,23 },
//			     {13,14,15,16,24},
//			     {17,18,19,20,25}
			     
		      };
		List<Integer> ret = spiralOrder(matrix);
		
		for(int a = 0; a < ret.size(); a++)
		{
			System.out.print(ret.get(a) + " ");
			
		}

	}

}
