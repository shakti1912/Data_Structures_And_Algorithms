package strings;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String a = "shakti";
		System.out.println(reverse(a));	
	}
	/*
	 * reversing recursively
	 */
	public static String reverse(String given)
	{
		if(given == null)
		{
			return given;
		}
		if(given.length() <= 1)
		{ 
			return given;
		}
		return (reverse(given.substring(1)) + given.substring(0, 1));
	}
	
	

}
