package newpackage;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Java";
		
		String reveresed="";
		
		int lengtht =name.length()-1;
		
		for(int i=lengtht; i>=0; i-- ) {
			
			reveresed =reveresed+name.charAt(i);
			

			
			
		}
		
		System.out.println(reveresed);

	}

}
