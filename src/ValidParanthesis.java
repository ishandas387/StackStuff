import java.util.Scanner;
import java.util.Stack;

/**
 * Validate paranthesis
 * @author ishan
 *
 */
public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);   
		 System.out.println("input expression");
		 
		 String expression =scan.next();
		 
		 if(expression != null){
			 System.out.println(validateParan(expression));
		 }
		 
	}

	private static boolean validateParan(String expression) {
		
		Stack<String> stack = new Stack<>();
		for(char ch : expression.toCharArray()){
			if(ch == '(' || ch =='{' || ch=='['){
				stack.push(ch+"");
				continue;
			}
			if(ch ==')'){
				String s = stack.pop();
				if(s.charAt(0) == '('){
					continue;
				}
				else{
					return false;
				}
			}
			if(ch =='}'){
				String s = stack.pop();
				if(s.charAt(0) == '{'){
					continue;
				}
				else{
					return false;
				}
			}
			if(ch ==']'){
				String s = stack.pop();
				if(s.charAt(0) == '['){
					continue;
				}
				else{
					return false;
				}
			}
		}
		if(!stack.isEmpty()){
			return false;
		}
		return true;
	}

}
