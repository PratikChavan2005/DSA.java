import java.util.*;
class ReversePolishNotation{
	
	public static void main(String[] args){
	
		String[] tokens={"3","1","+","2","*"};
		Stack<Integer>stack = new Stack<>();
		
		for(String t : tokens){
		
			if(t.equals("+") || t.equals("-") ||t.equals("*") || t.equals("/")){
			
				int a=stack.pop();
				int b=stack.pop();
			
			if(t.equals("+")){
				stack.push(a+b);
			}
			else if (t.equals("-")){
				stack.push(a-b);
			}
			else if (t.equals("*")){
				stack.push(a*b);
			}
			else{
				stack.push(a/b);
			}
		    }
			else {
				stack.push(Integer.parseInt(t));
			}
		}
		System.out.println(stack.pop());
	}	
}