package Chapter13;

/**
 * @author amitg
 * More Specific Implementation will be called .In Example,Method From interface B will be called
 */
public class DefaultMethodConflict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C().methodC();

	}

}

interface A{
	default void hello() {
		System.out.println(" Calling From Interface A ");
	}
}

interface B /*extends A*/{
	default void hello() {
		System.out.println("Calling From Interface B ");
	}
}

class C implements A, B{
	void methodC() {
		System.out.println(" Calling hello() ");
	   B.super. hello();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		A.super.hello();
	}
}
