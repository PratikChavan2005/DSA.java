import java.util.*;

class StringProblem3 {
    public static void main(String[] args) {

        String s = "***###";
        char[] arr = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

       int star=map.getOrDefault('*',0);
	int hash=map.getOrDefault('#',0);
		System.out.println("*" + "->" + star);
		System.out.println("#" + "->" + hash);
        }
    }
}