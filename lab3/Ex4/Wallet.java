public class Wallet
{
	private int totalValue;

	public Wallet()
	{
		totalValue = 0;
	}
	
	//the method of add or remove coin to the wallet
	public void addCoin(Coin coin)
	{
		totalValue += coin.getValue();
	}
	public void removeCoin(Coin coin)
	{
		totalValue -= coin.getValue();
	}
	
	public String toString()
	{
		return "The total value of all coins stored in the wallet is "+totalValue;
	}
}
