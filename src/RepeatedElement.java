import java.util.Stack;

public class RepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccfdbkk";
		Stack<Character> st = new Stack<>();
		for (Character c : s.toCharArray()) {
			if (!st.empty()) {
				if (!st.peek().equals(c)) {
					st.push(c);
				}
			} else {

				st.push(c);
			}
		}
		String output="";
		while(!st.isEmpty()){
			output = st.pop().toString()+output;
		}
		System.out.println(output);
	}

}
