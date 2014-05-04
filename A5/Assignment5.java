import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Assignment5
{
	public static void main(String[] args)
	{
		//declare variables
		Stack post = new Stack();
		ArrayList<String> postfix = new ArrayList<String>();
		Stack count = new Stack();
		double oper1, oper2;
		String result;

		//read the input infix expression
		System.out.print("Give an infix expression: ");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		String component;

		//tokenize it and extract the individual components
		StringTokenizer str = new StringTokenizer(input, " ");
		while (str.hasMoreTokens())
		{
			component = str.nextToken();
			
			//as you extract the components use the infix to postfix conversion algorithm and convert to postfix
			//when the component is "("
			if (component.equals("("))
				post.push(component);
			
			//when its an operator
			else if (component.equals("+") || component.equals("-") || component.equals("*") || component.equals("/") ){
				if (post.isEmpty())
					post.push(component);

				else{
					if(component.equals("+") || component.equals("-") ){
							while(!post.peek().equals("(")){
								postfix.add(post.pop());
								if(post.isEmpty())
									break;
							}
						post.push(component);
					}
					else{
						while(post.peek().equals("*") || post.peek().equals("/"))
							postfix.add(post.pop());
						post.push(component);
					}
				}
			}
			//when its )
			else if (component.equals(")")){
				while(!(post.peek().equals("(")))
					postfix.add(post.pop());
				post.remove();
			}
			//when its a number
			else if(component.matches("[0-9][0-9]*") || component.matches("[0-9][0-9]*.[0-9][0-9]*"))
				postfix.add(component);
			//error handling. when it's a wrong character
			else{
				System.out.println("Error!Wrong character.");
				System.exit(0);
			}
		}
		
		//add the remaining operator
		while(!post.isEmpty()){
			String remain = post.pop();
			if (remain.equals("(")){//error handling. when left bracket remaining.
				System.out.println("Error! Left bracket is more than right bracket.");
				System.exit(0);
			}
			postfix.add(remain);
		}
		
		//print the postfix string
		System.out.print("The postfix expression is: ");
		for(int i=0; i<postfix.size(); i++)
			System.out.print(postfix.get(i)+" ");
		System.out.println();
		
		//read the postfix string and evaluate it
		for(int i=0; i<postfix.size(); i++){
			String st = postfix.get(i);
			if(!st.equals("+") && !st.equals("-") && !st.equals("*") && !st.equals("/"))
				count.push(st);
			else{
				oper2 = Double.parseDouble(count.pop());
				oper1 = Double.parseDouble(count.pop());
				if(st.equals("+")){
					result = Double.toString(oper1+oper2);
					count.push(result);
				}
				else if(st.equals("-")){
					result = Double.toString(oper1-oper2);
					count.push(result);
				}
				else if(st.equals("*")){
					result = Double.toString(oper1*oper2);
					count.push(result);
				}
				else if(st.equals("/")){
					if(oper2 != 0){
						result = Double.toString(oper1/oper2);
						count.push(result);
					}
					else{
						System.out.println("denominator cannot be zero.");
						System.exit(0);
					}
				}
			}	
		}
		
		//print the answer
		System.out.println("The expression evaluates to "+count.pop());
	}
}
