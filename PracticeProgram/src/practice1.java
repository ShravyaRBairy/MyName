import java.util.HashSet;
import java.util.Set;

public class practice1 {

	public static void main(String args[]) {

		String s="BittyButter";
		//char y[] = s.toCharArray();
		Set<Character> set= new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		System.out.println(set);
		
	}
}
