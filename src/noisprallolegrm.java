
public class noisprallolegrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int checkno = 4654;
		
		int originalcopy=checkno;
		int sum =0;
		
		while(checkno!=0) {
			
			int reminder=checkno%10;
			
			sum=(sum*10)+reminder;
			checkno=checkno/10;
		}
		
		if(sum==originalcopy) {
			
			System.out.println("the no is parallelofram");
		}else {
			
			System.out.println("The no is not parallelogram");
		}

	}

}
