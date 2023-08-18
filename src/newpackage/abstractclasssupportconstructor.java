package newpackage;


abstract class one{
	
	abstract void noise();
	
	public one(String color) {
		System.out.println("This color is from sub class through constructor"+color);
	}
}

class two extends one{
	
	public two(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	void noise() {
			
		System.out.println("The overriden method from abstract class");
	}
}



public class abstractclasssupportconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		two t = new two("color");
		t.noise();

	}

}
