import java.util.Scanner;
public class Ex3
{
	public static void main(String[] args)
	{
		System.out.print("Please enter a sentence: ");
		Scanner keyboard = new Scanner(System.in);
		String line=keyboard.nextLine();//get the sentence from keyboard
		String newline="";
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i)!=' '&& line.charAt(i)!='\t'&& line.charAt(i)!='\''&& line.charAt(i)!='\"'&& line.charAt(i)!='!'&& line.charAt(i)!=','&& line.charAt(i)!='?'&& line.charAt(i)!='-'&& line.charAt(i)!=';'&& line.charAt(i)!=':'&& line.charAt(i)!='.')
				newline += line.charAt(i);//remove all the punctuation and whitespace
		}
		String sentence = newline.toLowerCase();
		System.out.println(isReverse(sentence));
	}
	
	public static boolean isReverse (String line)
	{
		
		for(int i=0;i<(line.length()/2);i++)
		{
			if(line.charAt(i)!=line.charAt(line.length()-i-1))
				return false;	//check if the word is palindrome
		}
		return true;
	}

}
