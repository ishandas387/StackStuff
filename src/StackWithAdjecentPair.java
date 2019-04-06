import java.util.Stack;

/**
 * Finding if the stack has all pair of adjecent numbers.
 * @author ishan
 *
 */
public class StackWithAdjecentPair {

	public static void main(String[] args) {

		//If stack has odd number of elements ignore the top one
		 Stack<Integer> s = new Stack<Integer> ();  
		 Stack<Integer> aux = new Stack<Integer> ();
		    s.push(4);  
		    s.push(5);  
		    s.push(-2);  
		    s.push(-3);  
		    s.push(11);  
		    s.push(10);  
		    s.push(5);  
		    s.push(64);  
		    s.push(20);
		    
		    while(!s.isEmpty()){
		    	aux.push(s.pop());
		    }
		    
		    boolean result=true;
		    while(aux.size()>1){
		    	int a = aux.peek();
		    	s.push(aux.pop());
		    	int b = aux.peek();
		    	s.push(aux.pop());
		    	if(Math.abs(a-b)!=1){
		    		result = false;
		    	}
		    			
		    }
		    if(aux.size()==1){
		    	
		    	s.push(aux.pop());
		    }
		    
		    System.out.println(result);
		
	}

}
