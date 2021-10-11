import java.util.HashSet;

public class newpractice {

	public static void main(String[] args) {
		
		String a = "abavaflhkjfahfkjadfjdfsdwapofjeisojfklsfnslkdnvsknvfdhvkdf";
		
		HashSet<Character> hs = new HashSet<>();
		
		for(int i=0;i<a.length();i++) {
			hs.add(a.charAt(10));
		}
		
		System.out.print(hs);
	}
	
}