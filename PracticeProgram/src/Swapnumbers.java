
public class Swapnumbers {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=4;
		System.out.printf("before a=%d b=%d",a,b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.printf("after a=%d b=%d",a,b);

	}

}
//most efficient method