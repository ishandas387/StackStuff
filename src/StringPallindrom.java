import java.util.Scanner;
import java.util.Stack;

/**
 * String pallindrome 
 * String with special char in middle
 * @author ishan
 *
 */
public class StringPallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string something as --- abaXaba");
		String expression = s.nextLine();
		Stack<Character> stack = new Stack<>();
		char[] charArray = expression.toCharArray();
		int count = 0;
		for(Character c : charArray){
			if(c!='X'){
				stack.push(c);
				count++;
			}else if(c=='X'){
				break;
			}
			
		}
		boolean isPallindrom= true;
		for(int i = count+1;i<charArray.length;i++){
			if(stack.isEmpty() || charArray[i] != stack.pop()){
				isPallindrom = false;
			}
		}
		if(isPallindrom){
			System.out.println("pallindrome");
		}
		else{
			System.out.println("not");
		}
		
	}

}
