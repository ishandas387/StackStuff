import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a stack of integers find if it is paired.
 * 
 * @author ishan
 *
 */
public class StackOfInt {

	public static void main(String[] args) {

		// create a stack of 4, 5, -2, -3, 11, 10, 5, 6, 20
		Stack<Integer> st = new Stack<>();
		st.push(4);
		st.push(5);
		st.push(-2);
		st.push(-3);
		st.push(11);
		st.push(10);
		st.push(5);
		st.push(6);
		st.push(20);

		testHasPair(st);
	}

	private static void testHasPair(Stack<Integer> st) {

		Queue q = new LinkedList();
		int counter = 0;
		while (!st.isEmpty()) {
			q.add(st.pop());
			counter++;

		}

		if (counter % 2 == 0) {
			compareElements(q);
		} else {
			q.poll();
			compareElements(q);
		}
	}

	private static void compareElements(Queue q) {
		boolean t = true;
		while (!q.isEmpty() && t) {
			
			t =compare(q.poll(),q.poll());

		}
		System.out.println("output :  "+t);
	}

	private static boolean compare(Object poll, Object poll2) {
		return ((Integer) poll - (Integer) poll2 == 1 || (Integer) poll2 - (Integer) poll==1);
	}

}
