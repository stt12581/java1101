public class PizzaStandDemo
{
	public static void main(String[] args)
	{
		System.out.println("Pizza Sales:");
		//set the new object
		PizzaStand stand1 = new PizzaStand(1,2);
		PizzaStand stand2 = new PizzaStand(2,1);
		PizzaStand stand3 = new PizzaStand(3,1);
		PizzaStand stand4 = new PizzaStand(4,1);
		PizzaStand stand5 = new PizzaStand(5,1);

		System.out.println(stand1+"\n"+stand2+"\n"+stand3+"\n"+stand4+"\n"+stand5);
		System.out.println("\nTotal pizzas sold: "+PizzaStand.getTotalPizza());
		System.out.println("Total sales: "+PizzaStand.getTotalSold());
	}
}