
public class StringSwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "Apple";
		String y = "Orange";
		
		System.out.println("Before swaping x: "+x+" y: "+y);
		
		x = x+y;//AppleOrange//11
		y = x.substring(0,x.length()-y.length());//0,5
		x = x.substring(y.length());//5-11
		System.out.println("After swaping x: "+x+" y: "+y);
	}

}
