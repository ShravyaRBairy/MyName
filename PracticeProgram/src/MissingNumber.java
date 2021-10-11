import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
    int a[]= {3,4,1,2,6};//6*(6+1)/2=21
    int n=a.length+1;
    int sum=0;
    int element_Sum= n*(n+1)/2;
    
    for(int i=0;i<a.length;i++)
    {
    	sum=sum+a[i];
    }
    
    int missingOne=element_Sum-sum;
    System.out.println("Missing number is =="+missingOne);
    
    
	/*
	 * Arrays.sort(a); for(int i=0;i<a.length;i++) { if(a[i]!=i+1) { int value=i+1;
	 * System.out.println("Missing number is =="+value); break; } }
	 */
	}

}
