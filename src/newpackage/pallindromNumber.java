package newpackage;

public class pallindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 15451;
		int copy=no;
		int sum=0;
		
		while(no!=0){
			
			int remainder=no%10;
			sum=remainder+(sum*10);
			
			no=no/10;
			
		}
		
		if(copy==sum) {
			System.out.println("The provided no is pallindrom");
		}else {
			System.out.println("The provided no is not a pallindrom");
		}
		
	}

}
