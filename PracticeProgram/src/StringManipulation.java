
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The rains have started here";
		String str1 = "The Rains have started here";
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));
	
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello"));
		
		//string comparision
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		
		System.out.println(str.substring(0, 8));
		
		//trim
		String s = "  Hello world  ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ",""));
		
		//Split
		
		String test = "Hello_World_Test_Selenium";
		String[] testval = test.split("_");
		for(int i=0;i<testval.length;i++)
		{
		System.out.print(testval[i]);
		
		}
		
	String s2 = "cares";
	System.out.println(s2.concat(s));
	
	String x = "Hello";
	String y = "World";
	int a =100;
	int b = 200;
	
	System.out.println(x+y);
	System.out.println(a+b);
	System.out.println(x+y+a+b);
	System.out.println(a+b+x+y);
System.out.println(x+y+(a+b));

		
		
		
		
		

	}

}
