import java.util.Scanner;
public class StockDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String sym1, sym2;
		double prc1, prc2;
		int sh1, sh2;
		//get the values for two stocks
		System.out.print("Enter the symbols for the two stocks: ");
		sym1 = keyboard.next();
		sym2 = keyboard.next();
		System.out.print("Enter their prices: ");
		prc1 = keyboard.nextDouble();
		prc2 = keyboard.nextDouble();
		System.out.print("Enter the number of shares for the two stocks: ");
		sh1 = keyboard.nextInt();
		sh2 = keyboard.nextInt();
		
		//create the first Stock
		Stock s1 = new Stock(sym1,prc1,sh1);
		
		//create the second Stock
		Stock s2 = new Stock(sym2,prc2,sh2);
		
		System.out.println("I have the following stocks: ");
		System.out.println(s1);
		System.out.println(s2);
		
		//compare two stocks
		double value1 = s1.getShares()*s1.getPrice();
		double value2 = s2.getShares()*s2.getPrice();
		int i = s2.compare(s1);
		if (i==1)
			System.out.println("The value of "+sym1+" is higher than "+sym2+" by $"+String.format("%.2f",(value1-value2)));
		else if (i==-1)
			System.out.println("The value of "+sym2+" is higher than "+sym1+" by $"+String.format("%.2f",(value2-value1)));
		else
			System.out.println("The value of "+sym1+" is the same as the value of "+sym2);
		System.out.println("The total value of my portfolio is $"+(value1+value2));
	}
}

		
