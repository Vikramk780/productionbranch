import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class removeDuplicateusinghashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] duplicates= {1,1,2,2,5,4,7};

List<Integer> withoutduplicates=new ArrayList<>(new HashSet<>(Arrays.asList(duplicates)));

System.out.println(withoutduplicates);
	}

}
