package newpackage;

public class StringPallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "mom";
		
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			
			char ch =s1.charAt(i);
			
			s2=s2+ch;
		}
		
		if(s1.equals(s2)) {
			System.out.println("The provided string is pallindrom"+s2);
		}else {
			System.out.println("The provided string is a not pallindrom"+s2);
		}
         
		
	}

}
