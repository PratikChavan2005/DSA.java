import java.util.*;
class ExpressionOfEvalution{

	public static void main(String[] args){
		
	    	Stack<Integer> stack = new Stack<>();
		String s="3+2*2";
		int num=0;
		int op='+';
		int ans=0;
		for(int i=0;i<=s.length();i++){
			
			char ch=(i==s.length()) ? '+' : s.charAt(i);

			if(Character.isDigit(ch)){
				num=num*10 + (ch-'0');
			}
			else if(ch != ' '){
			
				if(op == '+'){
					stack.push(num);
				}
				else if(op == '-'){
					stack.push(-num);
				}
				else if(op == '*'){
					stack.push(stack.pop()*num);
				}
				else if(op == '/'){
					stack.push(stack.pop()/num);
				}
			op=ch;
			num=0;
			}
			
		}
			
			while(!stack.isEmpty()){
				ans=ans+stack.pop();
			}
		System.out.println(ans);

	}	
}