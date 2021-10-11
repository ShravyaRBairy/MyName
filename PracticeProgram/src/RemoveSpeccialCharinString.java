
public class RemoveSpeccialCharinString {

	public static void main(String[] args) {
		String s = "*&^5$#4%56~~~ Str&&ING";
		//Use Regular expression [^a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		

	}

}
