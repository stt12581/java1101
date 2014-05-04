public class WalletDemo
{
	public static void main(String[] args)
	{
		Coin coin25= new Coin("quarter",25);
		Coin coin10= new Coin("dime",10);
		Coin coin5= new Coin("nickel",5);
		
		//set the new object
		Wallet wallet = new Wallet();
		wallet.addCoin(coin25);
		wallet.removeCoin(coin10);
		wallet.removeCoin(coin5);

		//print how much coin stored
		System.out.println("We have three kinds of coin: "+coin5+coin10+coin25);
		System.out.println(wallet);
	}
}