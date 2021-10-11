
public class StringReverse {

	public static void main(String[] args) {
		String s= "Selenium";
		char y[] = s.toCharArray();
		int size = y.length;
		
		String rev= "";
		
		for(int i=size-1; i>=0;i--) {
			rev=rev+y[i];
			
		}
		
		System.out.println(rev);

	}

}
