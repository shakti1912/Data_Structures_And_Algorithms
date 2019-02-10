package Arrays;

public class DeleteColumnstoMakeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Input[] = {"a","b"};
		System.out.println(minDeletionSize(Input));

	}

	public static int minDeletionSize(String[] A) {
		int total = 0;
		int len = A[0].length();
		for(int i =0; i < len; i++)
		{
			
			int current = A[0].charAt(i);
			boolean flag = false;
			label2:
				for(int j=1; j < A.length; j++){
					if(current <= A[j].charAt(i))
					{
						current = A[j].charAt(i);
						flag = true;
					}
					else
					{
						flag = false;
						break label2;
					}

				}
			if(!flag)
			{
				total++;
			}
		}


		return total;
	}
}
