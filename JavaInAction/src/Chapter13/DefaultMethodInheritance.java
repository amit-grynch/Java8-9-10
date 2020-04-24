package Chapter13;

/**
 * @author amitg
 *  If Method is not implemented in Super class then sub-interface will win
 */
public class DefaultMethodInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CC().methodCC();
	}

}

interface AA {
	default void hello() {
		System.out.println(" Calling From Interface AA ");
	}
}

interface BB extends AA {
	default void hello() {
		System.out.println("Calling From Interface BB ");
	}
}

class DD implements AA {
	
}

class CC extends DD implements AA, BB {
	void methodCC() {
		new CC().hello();

	}
}