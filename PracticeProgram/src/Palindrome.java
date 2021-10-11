public class Palindrome {

	public static void main(String[] args) {
		String s= "Ana";
		s=s.toLowerCase();
		char y[] = s.toCharArray();
		int size=y.length;
	String rev = " ";
		for(int i=size-1;i>=0;i--) {
			rev=rev+y[i];
		}
		
		System.out.println(rev);
		if(rev.contains(s)) {
			System.out.print("Is a palindrome");
		}
		else
		System.out.print("Is not a Palindrome");
		
	}
}