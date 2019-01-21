package LeetCode;

import java.util.Arrays;

public class NumberOfLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "bbbcccdddaaa".toLowerCase();
		System.out.println(Arrays.toString(numberOfLines(widths, S)));

	}
	public static int[] numberOfLines(int[] widths, String S) 
	{
		int counter = 0;
		int nlines = 1;
		
		
		for(int i = 0; i < S.length(); i++)
		{
			int c = S.charAt(i) - 97;
			counter = counter + widths[c];	
			
			if(counter > 100)
			{
				nlines++;
				counter =0;
				counter  = counter + widths[c];		
			}
				
		}
		int[] res = {nlines, counter};
		return res;
		

	}

}
