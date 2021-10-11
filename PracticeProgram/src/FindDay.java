import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class FindDay {
public static void main(String[] args) {
	
	
	  /*100 divided by 7 = 14.3
		14 x 7 = 98
				100 - 98 = 2
				Friday + 2 = Sunday*/
		
	
	Days("Monday",1000);
		
		
	
}

public static void Days(String day,int num)
{
	
	int rem=num%7;
	
	String day1=day;
	int dayActual = 0;
	
	Map<Integer,String> mp=new HashMap<Integer,String>();
	
	mp.put(1,"Sunday");
	
	mp.put(2,"Monday");
	mp.put(3,"Tuesday");
	mp.put(4,"Wednesday");
	mp.put(5,"Thursday");
	mp.put(6,"Friday");
	mp.put(7,"Saturday");
	
	for (Entry<Integer, String> entry : mp.entrySet()) {
        if (entry.getValue().equals(day1)) {
            dayActual=dayActual+entry.getKey();
        }
	}
	int addNum=rem+dayActual;
	
	if(addNum>7)
	{
		int acNum=addNum-7;
		System.out.println(mp.get(acNum));
	}
	else {
	System.out.println(mp.get(addNum));
	}
}

}
