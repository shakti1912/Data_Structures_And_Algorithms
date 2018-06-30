package Hashing.General_Problems;
import java.util.HashMap;
import java.util.Set;

public class EmployeeManager 
{
	//using hashmap and loops.
	// another approach is using DP.
	//
	public HashMap<String, Integer> find(HashMap<String, String> map)
	{
		HashMap<String, Integer> res = new HashMap<String, Integer>();
		HashMap<String, String> rMap = new HashMap<String, String>();
		Set<String> set = map.keySet();
		
		for(String s: set)
		{
			String inMap = map.get(s);
			
			if(rMap.containsKey(inMap))
			{
				rMap.put(inMap, rMap.get(inMap) + s);
			}
			else
			{
				rMap.put(inMap, s);
			}
			
		}
		//now rMap contains managers and their employees in (manager, employees) form
		Set<String> set2 = rMap.keySet();
		
		//first handle people who are only employees and not managers
		for(String s: set)
		{
			if(!rMap.containsKey(s))
			{
				res.put(s, 0);
			}
		}
		
		// now handle managers
		
		
		for(String s: set2)
		{
			int i =0;
			String employees = rMap.get(s);
			if(employees.contains(s))		//CEO case
			{
				i =rMap.get(s).length()-1;
			}
			else
			{
				i =rMap.get(s).length();
			}
			int length = i;
			
			for(int index = 0; index < length; index++)
			{
				if(rMap.containsKey(employees.charAt(index)+""))
				{
					i = i + rMap.get(employees.charAt(index) + "").length();
				}
				
			}
			res.put(s, i);		
				
		}		
		return res;
	}

}
