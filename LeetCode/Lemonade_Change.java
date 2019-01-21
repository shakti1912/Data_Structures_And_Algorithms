package LeetCode;

import java.util.HashMap;

public class Lemonade_Change 
{
	public static void main(String[] args)
	{
		int[] a = {5,5,10,10,20};
		lemonadeChange(a);
	}
	public static boolean lemonadeChange(int[] bills) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(5, 0);
        map.put(10,0);
        map.put(20,0);
        for(int i=0; i<bills.length; i++)
        {
            if(bills[i] == 5)
            {
                map.put(5, map.get(5)+1);
            }
           if(bills[i] == 10)
            {
               map.put(10, map.get(10)+1);
               if( map.get(5) != 0)
               {
                
                map.put(5, map.get(5)-1);
               }
               else
               {
                    return false;
               }
                        
            }
            if(bills[i] == 20 )
               {
                int x  = 0;
                map.put(20, map.get(20)+1);
               if(map.get(10) != 0)
               {
                   x = 1;
                    map.put(10, map.get(10)-1);
                  
               }
                if(x == 1)
               {
                    if(map.get(5) > 0)
                    {
                    map.put(5, map.get(5)-1);   
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(map.get(5) >= 3)
                    {
                        map.put(5, map.get(5)-3);     
                    }
                    else
                    {
                        return false;
                    }
                } 
            }
             }
        return true;
               }

}
