import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Replace with next largest element to right
 * if no element set to -1
 * brute force O(n^2) 
 * stack O(n)
 * @author ishan
 *
 */
public class NextLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//O(n^2)
		int [] input = {2,5,3,1,6,2,8,1};
		boolean isChanged = false;
		for(int i=0;i<input.length;i++){
			isChanged = false;
			for(int j=i+1; j<input.length;j++)
			{
				if(input[i]<input[j]){
					input[i] = input[j];
					isChanged=true;
					break;
				}
				
			}
			if(!isChanged){
				input[i] =-1;
			}
		}

		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
		
		//try it using stak O(n) 
		
		tryingUsingStack();
	}

	private static void tryingUsingStack() {
		int [] input = {2,5,3,16,6,2,8,1};
		// TODO Auto-generated method stub
		Stack<Integer> stackBucket = new Stack<>();
		//int [] output = new int[input.length];
		List<Integer> list = new ArrayList<>();
		for(Integer i : input){
			if(stackBucket.isEmpty()){
				stackBucket.push(i);
			}
			else{
				while (!stackBucket.isEmpty()) {
					if (i > stackBucket.peek()) {
						stackBucket.pop();
						list.add(i);
						
					} else {
						break;
					}
				}
				stackBucket.push(i);
			}
		}
		System.out.println("******");
		for(Integer t :list){
			System.out.println(t);
		}
	}

}
