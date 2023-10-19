package shuffle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ShuffleArray {
public static void main(String[]args)
{
	Integer[] intarray= {1,2,3,4,5,6,7,8};
	System.out.println("The array is:"+Arrays.toString(intarray));
	List<Integer>inlist=Arrays.asList(intarray);
	Collections.shuffle(inlist);
	inlist.toArray(intarray);
	System.out.println("The shuffleed array is:"+Arrays.toString(intarray));
	
}
}
