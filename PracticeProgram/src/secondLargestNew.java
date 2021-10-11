
public class secondLargestNew {

	public static void main(String[] args) {
		int[] a= {2,4,5,6,3,6,7,8,8,8};
		
		int largest=a[0];
		int secondLargest=0;
		for(int i=1;i<a.length;i++)
		{
			if(largest<a[i])
			{
				secondLargest=largest;
				largest=a[i];
			}
			
		}
		
		System.out.println(secondLargest);

	}

}
