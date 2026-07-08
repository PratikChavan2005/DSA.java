class JackDays{
	public static void main(String[]args){
	String[] days = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};
	String day="wed";
	int num=25;
	int j = 0;
	for (int i = 0; i < days.length; i++) {
    		if (day.equals(days[i])) {
        		j = i;
        		break;
    		}
	}

	int firstSunday = (7 - j) % 7 + 1;

		if (firstSunday > num) {
    		System.out.println(0);
		} else {
    		int count = 1 + (num - firstSunday) / 7;
    		System.out.println(count);
		} 
	
	}
}