
public class FirstLetterCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String x = "vikram vilas kamble";
		
		char[] y = x.toCharArray();
		
		int size = y.length;
		
		
		
		int i=1;
		
		y[0]= (char) (y[0]-32);
		 while(i!=size) {
				
				if(y[i] ==' ') {
					
					y[i+1]=(char) (y[i+1]-32);
					
				}
				i++;
		 }
		 
		 System.out.println(y);
		
		
	}

}
