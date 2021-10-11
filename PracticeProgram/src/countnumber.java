import java.util.HashMap;
import java.util.Map;

public class countnumber {

	public static void main(String[] args) {
		int a[] = {1,1,2,4,2,5,1,2,4,3,5};
		
		
		Map<Integer,Integer> mp = new  HashMap<Integer,Integer>();
		
		for(int i : a)
		{
			if(mp.containsKey(i))
			{
				mp.put(i,mp.get(i)+1);
			}
			else
			{
				mp.put(i, 1);
			}
		
		}
		System.out.println(mp);
		
		
		

	}

}
