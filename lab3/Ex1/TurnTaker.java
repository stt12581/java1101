public class TurnTaker
{
	private static int turn = 0;
	private int myTurn;
	private String name;
	public TurnTaker(String n, int t)
	{
		name = n;
		myTurn = t;
	}
	//get name and turn
	public String getName()
	{
		return name;
	}
	public static int getTurn()
	{
		turn++;
		return turn;
	}
	
	//check if the turn equals myTurn
	public boolean isMyTurn()
	{
		myTurn++;
		if (turn==myTurn)
			return true;
		else
			return false;
	}
}
