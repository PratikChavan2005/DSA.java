import java.util.*;
class ExpenseManagement{
	

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income" + "->" );
		int Income = sc.nextInt();
		sc.nextLine();
		String[] cat = new String[100];
		int[] amount = new int[100];
		int count=0;
		int total=0;
		
		while(true){
			System.out.println("Enter category or done for exit " + "->");
		String cate=sc.nextLine();
		
		if(cate.equals("exit")){
			break;
		}
		
		System.out.println("Enter Expense" + "->");
		int expense = sc.nextInt();
		sc.nextLine();
		cat[count]=cate;
		amount[count]=expense;
		total+=expense;
		count++;
		}
		int Savings = Income-total;
		System.out.println("Salary is " + "->" + Income);	
		System.out.println("Total Expense" + "->" + total);
		System.out.println("Savings" + "->" + Savings);	
		System.out.println("Expense Breakdown");
		for(int i = 0;i<count;i++){
		System.out.println(cat[i] + ":" + amount[i]);
		count--;
		
		}
		if(count == 0){
			System.out.println("No Expense Remaining");
		}
		
		
	}	
}