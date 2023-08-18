package newpackage;

class rec{
	
	void add(int no) {
		
		if(no<=0) {
			return;
			
		}
		System.out.print(no+" ");
		no--;
		add(no);
	}
	
	
}

public class recorsivmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		rec r = new rec();
		
		r.add(10);
	}

}
