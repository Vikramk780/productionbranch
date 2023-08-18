
public class reversearraywithoutsecondarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5};
		System.out.println("initial array");
		printArray(array);
		
		
	
		
		
		int start =0;
		int end=array.length-1;
		
		while(start<end) {
			
			int temp=array[start];
			
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}	System.out.println("reversed array");
		printArray(array);
		
		  

	}
	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
