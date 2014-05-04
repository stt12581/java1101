public class Lottery
{
	//instance variables
	private int [] lotteryNumbers = new int [5];
	private int [] userArray = new int [5];
	private int match;
	
	//constructor
	public Lottery()
	{
		for(int i=0; i<5; i++)
			lotteryNumbers[i] = (int)(Math.random()*9+1);
	}
	
	//input the userArray
	public void user(int [] u)
	{
		for(int i=0; i<5; i++)
			userArray[i] = u[i];
	}
	
	//compare how many numbers match
	public int compare()
	{
		int same = 0;
		for (int i=0; i<5; i++)
			if ( lotteryNumbers[i] == userArray[i] )
				same++;
		return same;
	}
	public String printPrize()
	{
		int same = compare();
		String prize = "";
		if (same == 5)
			prize += "$1 million prize";
		else if (same == 4)
			prize += "$500,000 prize";
		else if (same == 3)
			prize += "$1000 prize";
		else if (same == 2)
			prize += "$10 prize";
		else if (same == 1)
			prize += "$2 prize";
		else 
			prize += "Sorry, nothing for you.";
		
		return prize;	
	}
	
	//toString method
	public String toString()
	{
		String result = "LotteryNumbers array: ";
		for (int i=0; i<5; i++)
			result += lotteryNumbers[i]+" ";
		result += "\nuserArray: ";
		for (int i=0; i<5; i++)
			result += userArray[i]+" ";
		
		result += "\n"+compare()+" numbers match. \nThe result is .."+ printPrize();	
		
		return result;
	}
}