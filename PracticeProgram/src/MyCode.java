import java.util.HashMap;
import java.util.Map;

public class MyCode{
	
	public static void main(String args[]) {
		
		String s= "BittyButter";
		char y[] =s.toLowerCase().toCharArray();
		
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		
			for(char a:y){
				
				if(map.containsKey(a)) {
					
			map.put(a,map.get(a)+1);
			}	
				else {
					map.put(a,1);
			}
				
			}
			for(Map.Entry<Character, Integer> ent:map.entrySet()) {
				if(ent.getValue()>1) {
					System.out.println(ent.getKey()+" "+ent.getValue());
				
		}
			}
		
			}
}
