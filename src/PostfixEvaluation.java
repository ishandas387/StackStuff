import java.util.Stack;

/**
 * postfix evaluation
 * 23*4+
 * 6+4= 10
 * @author ishan
 *
 */
public class PostfixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression="123*+5-";
		Stack<Character> stack = new Stack<>();
		int evaluation = 0;
		for(Character c: expression.toCharArray()){
			if(!isOperator(c)){
				stack.push(c);
			}
			else{
				if(!stack.isEmpty() && stack.size()>1){
					int a =Integer.parseInt(stack.pop()+"");
					int b =Integer.parseInt(stack.pop()+"");
					evaluation = evaluate(c,b,a);
				}
				else if(!stack.isEmpty() && stack.size()==1){
					int a =Integer.parseInt(stack.pop()+"");
					evaluation =evaluate(c,evaluation,a);
				}
			}
		}
		System.out.println(evaluation);

	}
	
	private static int evaluate(Character c, int b, int a) {
		switch (c) {
		case '+':
			return b+a;
		case '-':
			return b-a;
		case '/':
			return b/a;
		case '*':
			return b*a;
		default:
			return 0;
		}
	}

	private static boolean isOperator(Character c) {

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
