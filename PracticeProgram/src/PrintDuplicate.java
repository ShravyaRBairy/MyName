import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		String s = "Beautiful Beaches";
	char y[]=s.replace(" ", "").toLowerCase().toCharArray();
		
		Map<Character,Integer> hs= new HashMap<Character,Integer>();
		
		for(char a:y) {
			
			if(hs.containsKey(a)) {
				hs.put(a,hs.get(a)+1);
				
			}
			else {
				hs.put(a,1);
			}
			
	}
		

	for(Map.Entry<Character,Integer> entry:hs.entrySet())
	{
		System.out.print(entry.getKey());
		
		
	}
		
		
	}

}
