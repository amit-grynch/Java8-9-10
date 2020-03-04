package Chapter3;

public class RunnableInterfaceUsingLambda {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Runnable() {
			 public void run() {
				 System.out.println("Using Anonymous Class");
			 }
		   };
		   
		   Runnable r2=()-> System.out.println("Using Lambda Expression");  
		process(r1);
		process(r2);
		process(()-> System.out.println("Passing the lambda Expression as paramter"));

	}
    public static void process(Runnable r) {
    	r.run();
    }
}
