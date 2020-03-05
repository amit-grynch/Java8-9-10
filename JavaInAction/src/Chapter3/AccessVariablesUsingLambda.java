package Chapter3;

public class AccessVariablesUsingLambda {
   static int staticValue=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int instValue=5;
       PrintVariable printValue=()->System.out.println(instValue);
      // instValue=25;
       printValue.print();
	}

}

@FunctionalInterface
 interface PrintVariable{
	void print();
}
