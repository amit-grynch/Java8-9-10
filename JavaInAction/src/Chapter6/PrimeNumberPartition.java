package Chapter6;

import java.util.stream.IntStream;

import sun.security.x509.IssuingDistributionPointExtension;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
public class PrimeNumberPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num=10;
		Map<Boolean,List<Integer>> primeMap=parititionPrimes( num);
     System.out.println(primeMap);
	}
      public static boolean isPrime(int candidate) {
    	return   IntStream.range(2, candidate).noneMatch(i->candidate%i==0);
      }
      
      public static Map<Boolean,List<Integer>> parititionPrimes(int num){
    	  return IntStream.rangeClosed(2, num).boxed().collect(partitioningBy((i)->isPrime(i)));
      }
}


