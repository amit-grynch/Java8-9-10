
package Chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * @author amitg
 * Example of Distinct() of Stream which returns the Unique number based on hashcode and equals method of stream generated
 *
 */
public class UniqueFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> listInteger=Arrays.asList(1,2,1,2,3,2,4);
     Stream<Integer> streamInteger=listInteger.stream();
     Stream<Integer> filtereUniquedNumber=streamInteger.filter(streamInteger2->streamInteger2%2==0).distinct();
     filtereUniquedNumber.forEach(System.out::println);
    		                       
    		 
	}

}
