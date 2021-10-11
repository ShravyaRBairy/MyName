import java.util.HashMap;
import java.util.Map;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Bitches bee";
		
		char y[]= s.toLowerCase().replaceAll(" ", "").toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char a:y) {
			
			if(map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}
			else {
				map.put(a,1);
			}
		}
			
			
		
		
	for(Map.Entry<Character,Integer> enetry:map.entrySet()) {
		if(enetry.getValue()>1) {
		System.out.print(enetry.getKey()+" : "+enetry.getValue());
		}
	}
	}
}


