
public class parallogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String originalname= "mosm";
		
		String reversed="";
		
		for(int i= originalname.length()-1; i>=0;i--) {
			
			
			reversed =reversed+originalname.charAt(i);
		}
		System.out.println(reversed);

		
		if(originalname.equals(reversed)) {
			
			System.out.println("The String is parallogram");
		}else {
			System.out.println("The string is not a parallologram");
		}
		
	}

}
