
public class Swapinaline {

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		a=10;
		b=5;
		c=10;
		d=5;
		e=10;
		f=9;
		
		System.out.printf("before a=%d b=%d",a,b);
		a=a+b-(b=a);
		System.out.printf("after a=%d b=%d",a,b);
		System.out.printf("before c=%d d=%d",c,d);
		c=c*d/(c=d);
		System.out.printf("after c=%d d=%d",c,d);
		System.out.printf("before e=%d f=%d",e,f);
		e=e^f^(e=f);
		System.out.printf("after e=%d f=%d",e,f);
	}

}
