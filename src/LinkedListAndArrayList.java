import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LinkedList<String> linkedname = new LinkedList<String>();
		
		linkedname.add("vk");
		linkedname.add("kk");
		linkedname.add("dash");
		
		linkedname.add(2, "newstring");
		
		System.out.println(linkedname.get(2));
		
		ArrayList<String> arrayname = new ArrayList<>();
		arrayname.add("sadhbcha");
		
		arrayname.add("agas");
		arrayname.add("asdad");
		arrayname.add("sdaed");
		arrayname.add(2, "newstring");
		System.out.println(arrayname.get(2));
	}

}
