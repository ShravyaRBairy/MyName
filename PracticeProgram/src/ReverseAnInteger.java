
public class ReverseAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int rev = 0;
		System.out.println("before num:"+num);
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
System.out.println("reverse num:"+rev);
	}

}
