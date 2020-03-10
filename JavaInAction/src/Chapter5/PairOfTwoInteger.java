package Chapter5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
public class PairOfTwoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInteger1= Arrays.asList(1,2,3);
		List<Integer>listInteger2= Arrays.asList(3,4);
		 List<int[]> integerPair=listInteger1.stream().flatMap(number1->listInteger2.stream().map(number2->new int[] {number1,number2})).collect(toList());
          Iterator<int[]> it=integerPair.iterator();
          while(it.hasNext()) {
        	  System.out.println(it.next()[0] + " "+it.next()[0]);
        	  
          }
	}

}
