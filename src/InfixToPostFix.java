import java.util.Stack;

/**
 * InfixToPostFix
 * (a+b)*c
 * ab+c*
 * @author ishan
 *
 */
public class InfixToPostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expression="(a+b)*c";
		Stack<Character> stack = new Stack<>();
		String post="";
		for(Character c: expression.toCharArray()){
			if(c =='('){
				
			}
			if(isOperand(c)){
			
				stack.push(c);
			}
			else{
				post =c+"";
				if(!stack.isEmpty()) {
					Character pop = stack.pop();
					post =post+pop;
				}
			}
			
		}
		System.out.println(post);

	}

	private static boolean isOperand(Character c) {

		switch (c) {
		case '+':
			return true;
		case '-':
			return true;
		case '/':
			return true;
		case '*':
			return true;
		default:
			return false;
		}
	}

}
