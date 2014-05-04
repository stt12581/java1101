public class SalesDemo
{
	public static void main(String[] args)
	{
		Sales sales1,sales2;
		
		sales1 = new Sales(2.50,4,10);//build two new sales
		sales2 = new Sales(1.99,20,15);

		sales1.setName("Shampoo");
		sales1.setNumber(10);
		sales1.registerSale(10);
		
		sales2.setName("Toothpaste");
		sales2.setNumber(10);
		sales2.registerSale(10);
		
		System.out.println(sales1.displaySales());//print the whole information
		System.out.println();
		System.out.println(sales2.displaySales());			
	}
}