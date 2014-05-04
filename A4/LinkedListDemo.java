import java.util.Scanner;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList cold = new LinkedList();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the pair name: ");
		String d1 = keyboard.next();
		String d2 = keyboard.next();
		
		//check if the first one of d1,d2 is done
		if((!d1.equals("done")&&d2.equals("done")) || (d1.equals("done")&&!d2.equals("done"))){
			System.out.println("Two names should be all done.");
			System.exit(0); 
		}
		
		//get two names until either of them are done	
		while(!d1.equals("done") && !d2.equals("done")){
			cold.addToEnd(d1,d2);
			System.out.print("Enter the pair name: ");
			d1 = keyboard.next();
			d2 = keyboard.next();
		}	
		
		//give error if only one of them is done
		if(!d1.equals("done") || !d2.equals("done"))
			System.out.println("Two names should be all done.");
		
		else{
			//print responsible
			System.out.println("People responsible for spreading cold virus: ");
			System.out.println(cold.responsible());
			//print not responsible
			System.out.println("People NOT responsible for spreading cold virus: ");
			System.out.println(cold.notResp());
			
			//check people directly infected
			System.out.print("\nGive a name: ");
			String d3 = keyboard.next();
			System.out.println("People directly infected by "+d3+": \n"+cold.direct(d3));
			
			//get the name who has constracted from a given name
			System.out.print("\nGive a name and a positive number: ");
			String d4 = keyboard.next();
			int n = keyboard.nextInt();
			
			System.out.println("People who may have contracted the cold virus from "+d4+": \n"+cold.contract(d4,n));
		}
	}
}
