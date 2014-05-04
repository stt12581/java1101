public class TurnTakerDemo
{
	public static void main(String[] args)
	{
		TurnTaker person1 = new TurnTaker("Romeo", 0);
		TurnTaker person2 = new TurnTaker("Juliet", 0);
		
		//continue to check for five times and print the name out
		for(int i = 1; i<= 5; i++)
		{
			System.out.println("Turn = " + TurnTaker.getTurn());
			if (person1.isMyTurn())
				System.out.println("Love from "+ person1.getName());
			if (person2.isMyTurn())
				System.out.println("Love from " + person2.getName());
		}
	}
}
