import java.util.ArrayList;
import java.util.Random;

public class Number {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){//creat arraylist for 10 times
			ArrayList<Integer> permutation = new ArrayList<Integer>(); //creat an arraylist
			Random generator = new Random();
		
	 		int a = generator.nextInt(10)+1;
			while(permutation.size()<=9){
				if(permutation.contains(a)==false)//it will continue to generate random number until it generates a new number
					permutation.add(a);

				a = generator.nextInt(10)+1;//change 0-9 to 1-10
			}
			System.out.println("List "+(i+1)+permutation);
		}
   }
}