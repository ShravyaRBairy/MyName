import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.Using Hashset
		String names[] = {"Java","Javascript","Ruby","C","Python","Java" };
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name) == false) {
				System.out.println("duplicate element found is " + name);
			
			}
		}
	}

}
