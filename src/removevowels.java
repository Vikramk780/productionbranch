
public class removevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String input="hello";
		
		String result =removevowels(input);
		 System.out.println("Result: " + result);

	}
	
	public static String removevowels(String input) {
		
	StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if(!isvoWels(ch)) {
				
				sb.append(ch);
			}
			
			
		}
		return sb.toString();
	}
	
	public static boolean isvoWels(char ch) {
		
		ch =Character.toLowerCase(ch);
		return ch =='a'|| ch =='e'||ch =='i'|| ch =='o'||ch =='u';
	}

}
