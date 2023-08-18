
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {10,53,3,2,50,1};
		
		int n=arr.length-1;  //5
		
		for(int j=0; j<=n; j++) {
			
			for(int i=0; i<(n-j); i++) {
				
				if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}
			}
		}
		System.out.println("The bubble sorted array is --->");
		
		for(int i=0; i<=n; i++) {
			
		System.out.println(arr[i]);
		}
	}

}
