
public class SwapMoreVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		a=10;
		b=5;
		c=0;
		d=7;
		
		
		System.out.printf("before a=%d b=%d c=%d d=%d",a,b,c,d);
		a=a^b^(b=a);
		b=b^c^(c=b);
		c=c^d^(d=c);
		System.out.printf("after a=%d b=%d c=%d d=%d",a,b,c,d);
	}

}
