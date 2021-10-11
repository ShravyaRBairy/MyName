
public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = {"Java","Javascript","Ruby","C","Python","Java" };
		//1.Compare each element
		for(int i=0; i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i].equals(names[j])) {
					
				
				System.out.println("duplicate element is found"+names[i]);
			}
		}
	}

}
}
