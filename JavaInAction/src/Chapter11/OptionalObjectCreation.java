package Chapter11;

import java.util.Optional;

public class OptionalObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("A", 20);
		Person person2 = new Person("B", 30);
		Person person3 = new Person("C", 40);
		Person person4 = new Person("D", 50);
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Insurance insurance1 = new Insurance("HDFC");
		Insurance insurance2 = new Insurance("ICICI");
		Insurance insurance3 = new Insurance("AXA");
		Insurance insurance4 = new Insurance("SBI");
		Insurance insurance5 = new Insurance("AXIS");
		person1.setCar(car1);
		person2.setCar(car2);
		person3.setCar(car3);
		car1.setInsurance(insurance1);
		car2.setInsurance(insurance2);
		System.out.println(" Insurance Company Name is : "+getCarInsuranceName(person4));

	}
     public static String getCarInsuranceName(Person person) {
    	   return  person.getCar().getInsurance().getName();
     }
}
