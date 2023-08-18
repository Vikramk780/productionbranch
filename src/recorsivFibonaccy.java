
public class recorsivFibonaccy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 6;
		
		System.out.println(fibonaccy(n));
		
	}

	private static long fibonaccy(int n) {
		
		if(n<=1) {
			return n;
		}
		return(fibonaccy(n-1)+fibonaccy(n-2));
		
		
	}

}
