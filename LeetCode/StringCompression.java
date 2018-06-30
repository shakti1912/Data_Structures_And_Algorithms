package LeetCode;

import java.util.ArrayList;

public class StringCompression
{

	public static int compress(char[] chars)
	{
		int cont = 1;
		int index = 0;
		ArrayList<Character> finalChars = new ArrayList<Character>();
		//char[] finalChars = new char[chars.length];
		for(int i=0; i < chars.length-1; i++)
		{
			
			if(chars[i]  == chars[i+1])
			{
				cont++;
			}
			else
			{
				//finalChars[index] = chars[i];
				finalChars.add(chars[i]);
				index++;
				if(cont > 1)
				{
					//finalChars[index] =  (char) cont;
					while(cont > 0)
					{
						
					}
					finalChars.add((char) cont);
					
				}
				cont = 1;
			}		
			
		}
		finalChars.add(chars[chars.length-1]);
		if(cont > 1)
		{
			finalChars.add((char) (cont));
		}
		
		for(int i= 0; i < finalChars.size(); i++)
		{
			chars[i] = finalChars.get(i);
			
		}
		System.out.println(finalChars.toString());
		return finalChars.size();
		
	}
	
	public static void main(String args[])
	{
		char[] a = {'a','a','b','b','c','c','c'};
		System.out.println(compress(a));
	}

}
