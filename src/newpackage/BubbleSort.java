package newpackage;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {53,1,3,58,7,777,0,9,4};
		int n = arr.length-1;
		
		
	
		
		for(int j=0; j<=n; j++) {
			
			
			for(int i=0; i<(n-j); i++) {
				
				if(arr[i]>arr[i+1]) {
					
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}
			
			
		}
		for(int i=0; i<=n; i++) {
			System.out.print(arr[i]+" ,");
		}
	}

}
