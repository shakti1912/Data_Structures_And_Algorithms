package LeetCode;

public class BulberSwitcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bulbSwitch(99999));
		System.out.println(bulbSwitch2(99999));
		
		

	}
	public static int bulbSwitch(int n)
    {
        int totalOn = 0;
        for(int i =2; i < n+1; i++)
        {
           if((totalDiv(i))%2 == 0)
           {
        	   totalOn++;  	   
           }          
        }
        return totalOn+1;
        
    }
    
    public static int totalDiv(int x)
    {
        int div = 0;
        
        for(int i=2; i < x+1; i++)
        {
            if(x%i == 0)
            {
                div++;
            }
           
          
        }
        return div;
        
    }
    public static int bulbSwitch2(int n)
    {
    	return (int) Math.sqrt(n);
    }

}
