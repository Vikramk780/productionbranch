package newpackage;

class encapsulated{
	
	private int no = 1234;
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no=no;
	}
}

public class encapsulationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		encapsulated e = new encapsulated();
		int no1 =e.getNo();
		System.out.println(no1);
		
		e.setNo(11);
		
		int no2 =e.getNo();
		System.out.println(no2);
		
	}

}
