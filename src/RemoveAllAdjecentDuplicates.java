import java.util.Stack;

/**
 * Remove all adjecent duplicates in a string
 * axxy-> ay
 * aaccbbz->z
 * @author ishan
 *
 */
public class RemoveAllAdjecentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "axxyyz";
		Stack<Character> stack = new Stack<>();
		String result="";
		for(Character c: exp.toCharArray()){
			if(stack.isEmpty()){
				stack.push(c);
				result = result+c;
			}
			else{
				if(c == stack.peek()){
					stack.pop();
					continue;
				}
				else{
					stack.push(c);
					result = result+c;
					
				}
			}
		}
		System.out.println(result);
		
	}

}
