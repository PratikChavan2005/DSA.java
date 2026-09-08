import java.util.*;
class ExpenseHashMap{
	
	
	public static void main(String[] args){
		
		HashMap<String,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter income");
		int income=sc.nextInt();
		sc.nextLine();
		System.out.println(income);
		int total=0;
		boolean run = true;
		while(run){
	
			System.out.println("Enter Category or done for exit");
			String cat=sc.nextLine();
			//sc.nextLine();
			if(cat.equals("done")){
				run = false;
				break;
			}
			System.out.println("Enter amount");
			int expense=sc.nextInt();
			sc.nextLine();
			map.put(cat,map.getOrDefault(cat,0)+expense);
			total+=expense;
		}
		int Savings=income-total;
		System.out.println(Savings);
		for(String category : map.keySet()){
			System.out.println(category + ":" + map.get(category));	
		}
		
	}
}