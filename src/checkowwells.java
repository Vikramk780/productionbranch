
public class checkowwells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(checkOwwell("hellO"));
		System.out.println(checkOwwell("vikram"));
		
	}
	
	public static boolean checkOwwell(String input) {
		
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
