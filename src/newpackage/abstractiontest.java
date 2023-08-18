package newpackage;


interface Animal{
	
	void noise();
}

class snak implements Animal{
	
	public void noise() {
		System.out.println("fuss fuss");
	}
}

class dog implements Animal{
	
	public void noise() {
		System.out.println("bhau bhau");
	}
}

class stimulator{
	
	public static void ansim(Animal a) {
		a.noise();
	}
}

public class abstractiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		snak s = new snak();
		dog d = new dog();
		
		stimulator stim = new stimulator();
		
		stim.ansim(s);
		

	}

}
