import java.util.ArrayList;

public class Stack{
	private ArrayList<String> s;
	
	public Stack(){
		s = new ArrayList<String>();
	}
	
	//check if arraylist is empty
	public boolean isEmpty(){
		return s.size()==0;
	}
	
	//push the element into arraylist
	public void push(String x){
		s.add(0,x);
	}
	
	//pop the newest element out
	public String pop(){
		String x = null;
		if(isEmpty()){//error handling. When stack is empty.
			System.out.println("Stack is empty.");
			System.exit(0);
		}
		else
			x = s.remove(0);
		return x;
	}
	
	//remove the newest element
	public void remove(){
		s.remove(0);
	}
	
	//get the newest element
	public String peek(){
		if(isEmpty()){//error handling. When stack is empty.
			System.out.println("Stack is empty.");
			System.exit(0);
		}
		return s.get(0);
	}
}
