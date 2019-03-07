package strings;

public class DIString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =  "IDID";
		
		//Output: [0,4,1,3,2]
		
		int[] r    = diStringMatch(input);
		//input::diStringMatch
		//int[] r = diStringMatch(input);
		
		for(int i=0; i< r.length; i++)
		{
			//(System.out::println);
			System.out.print(r[i]+ " ");
		}
		

	}
	public static int[] diStringMatch(String S)
	{
		int[] ret = new int[S.length()+1];
		char[] arr = S.toCharArray();
		int start = 0;
		int end = arr.length;
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] == 'I')
			{
				ret[i] = start;
				start++;
			}
			else
			{
				ret[i] = end;
				end--;
			}
			
		}
		//name = ((city.getName() == null) ? "N/A" : city.getName());
		
		ret[ret.length-1] =  (arr[arr.length-1] == 'I') ? ret[ret.length-2]+1 : ret[ret.length-2]-1;
		return ret;
		

	}

}
