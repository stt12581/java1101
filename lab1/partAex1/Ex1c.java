public class Ex1c
{
	public static void main(String[] args)
	{
		long startTime, endTime, executionTime;//combine ex1c and ex1d to one 
		startTime = System.currentTimeMillis();
		
		for(int i=1;i<=10000;i++)
			System.out.println(isPerfect(i));
		
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(executionTime);//output the time
	}
	
	public static boolean isPerfect(int n)
	{
		int factor=1;
		for(int i=2; i<n;i++)
		{
			if(n/i*i==n)
				factor += i;
		}
		if (factor == n)
			return true;
		else
			return false;
	}

} 