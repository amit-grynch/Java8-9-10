package Chapter13;

public class DiamondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new DDD().methodDDD();
	}

}

interface AAA{
	default void hello() {
		System.out.println(" Hello Method From Interface AAA");
	}
}

 interface BBB extends AAA{
	 
 }
 interface CCC extends AAA{
	 
 }
 
 class DDD implements BBB,CCC{
	 void methodDDD() {
		hello();
	 }
 }
