package LeetCode;

import java.util.HashMap;

public class StudentAttendance 
{

	public static boolean checkRecord(String s) 
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 0);
		for(Character c: s.toCharArray())
		{
			if(c == 'A')
			{
				map.put('A', map.get('A')+1);
			}
		}
		if(map.get('A') > 1)
		{
			return false;
		}
		int num_A = 0;
		int con_Num_L = 0;
		for(int i =0 ; i < s.length()-2; i++)
		{
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			char c3 = s.charAt(i+2);
			if(c1 == 'L' && c2 == 'L' &&  c3 == 'L')
			{
				return false;
			}
		}
		return true;
		
		
		

	}
	
	public static void main(String args[])
	{
		System.out.println(checkRecord("PPALLP"));
	}


}
/* Best Solution
 * 
 * int a = 0;
        int l = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'A'){
                a++;
                if(a > 1)
                    return false;
                l = 0;
            }
            else if(ch == 'L'){
                l++;
                if(l > 2){
                    return false;
                }
            }
            else{
                l = 0;
            }
        }
        return true;
        }
  */
