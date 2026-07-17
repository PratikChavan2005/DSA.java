import java.util.*;
import java.util.Stack;
class StackData{
	public static void main(String[]args){
		String Str="{[[(])]}";
		boolean valid = true;
		Stack<Character>stack=new Stack<>();
		
		for(char ch:Str.toCharArray()){
			if(ch=='{' || ch=='[' || ch=='('){
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()){
					valid = false;
					break;
					}
				
				
			char top=stack.pop();
				
			
		if(top=='{' && ch!='}' || 
		   top=='[' && ch!=']' || 
		   top=='(' && ch!=')'){
			valid = false;
			break;
			
		}
	     }		
	}
		if(valid){
			System.out.println("true");
			}
		else {
			System.out.println("false");
		}
	}	
	
}