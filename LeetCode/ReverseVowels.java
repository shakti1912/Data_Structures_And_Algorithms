package LeetCode;

public class ReverseVowels
{
	public static String reverseVowels(String s) 
	{
        StringBuilder sb = new StringBuilder(s);
       int l = 0;
       int r = sb.length()-1;
       int indexLeft = -1;
       int indexRight = -1;
        while(l > r)
        {
        	char left = sb.charAt(l);
        	char right = sb.charAt(r);
        	boolean chL = checkVowel(left);
        	boolean chR = checkVowel(right);
        	if(chL && chR)
        	{
        		sb.replace(l, l+1,""+ right);
            	sb.replace(r, r+1, "" + left); 
        	}
        	else if(chL && !chR)
        	{
        		indexLeft = l;
        	}
        	else if(!chL && chR)
        	{
        		indexRight = r;
        	}
        	if()
        	
        	
        	if(checkVowel(left))
        	{
        		l = i;
        		if(checkVowel(right))
        		{  			
        			r = sb.length()-i-1;
        			sb.replace(l, l+1,""+ right);
                	sb.replace(r, r+1, "" + left); 
        		}
        		
        	}
        	else
        	{
        		if(checkVowel(right))
        		{	
        			r = sb.length()-i-1;
        		}
        		else
        		{
        			continue;
        		}
        	}
        	  	
        }
        return sb.toString();
		
	}
	public static boolean checkVowel(char ch)
	{
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			return true;
		}
		return false;
				
	}
	
	public static void main(String args[])
	{
		System.out.println(reverseVowels("leetcode"));
	}

}
