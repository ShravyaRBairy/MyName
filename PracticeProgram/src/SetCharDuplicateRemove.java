import java.util.HashSet;

public class SetCharDuplicateRemove {

	public static void main(String[] args) {
		
		String x = "abcaab";
		
		HashSet<Character> carloop = new HashSet<Character>();
		
		for(int i=0;i<x.length();i++) {
			carloop.add(x.charAt(i));
		}
		
		System.out.println(carloop);

	}

}
