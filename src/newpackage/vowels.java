package newpackage;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String checkv = "vikram";
		int count =0;
		
		for(int i=checkv.length()-1; i<=0; i--) {
			
			char ch = checkv.charAt(i);
			
			if(ch=='a' | ch=='e'| ch=='i' |ch=='o'| ch=='u') {
				count++;
				System.out.println("The String contains -->this vowel"+ch+"and count is"+count);
			}
			
		}
	}

}
