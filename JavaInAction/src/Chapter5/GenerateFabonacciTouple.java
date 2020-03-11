package Chapter5;

import java.util.stream.Stream;

public class GenerateFabonacciTouple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stream<int[]> integerStream=Stream.iterate(new int[] {0,1},n->new int[] {n[1],n[0]+n[1]}).limit(8);
         integerStream.forEach(number->System.out.println(number[0]+" "+number[1]));
	}

}
