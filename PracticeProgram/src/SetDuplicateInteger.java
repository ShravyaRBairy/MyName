import java.util.HashSet;
import java.util.Set;

public class SetDuplicateInteger {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,1,2,3,1,1,1,4,4,5,6,7};
	
		
		Set<Integer> lhs = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			lhs.add(arr[i]);
		}
	System.out.println(lhs);
	}

}
