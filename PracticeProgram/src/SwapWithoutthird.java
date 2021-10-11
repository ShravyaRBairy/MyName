
public class SwapWithoutthird {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=6;
		System.out.printf("before a=%d b=%d",a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("after a=%d b=%d",a,b);
		// Fail if overflow
		int c,d;
		c=10;
		d=6;
		System.out.printf("before c=%d d=%d",c,d);
		c=c*d;
		d=c/d;
		c=c/d;
		System.out.printf("after c=%d d=%d",c,d);
//fail if the input is 0 and an exception may occur
	}

}
