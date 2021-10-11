import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance {

	public static void main(String[] args) {
		String x = "Shravyas is a";
		x = x.replace(" ", "");
		x = x.toLowerCase();
		char y[] =x.toCharArray();
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(char i : y) {
			if(mp.containsKey(i)) {
				mp.put(i,mp.get(i)+1);
			}
			else {
				mp.put(i, 1);
			}
			
		
		}
		
		System.out.println(mp);
	}
	
	
}
		/*Set<Map.Entry<Character, Integer>> hmap = mp.entrySet();
		for(Map.Entry<Character,Integer> data: hmap) {
			System.out.print(data.getKey()+""+data.getValue()+" ");*/
		
		
	
	
		
	


