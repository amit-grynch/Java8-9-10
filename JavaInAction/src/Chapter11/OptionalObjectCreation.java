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
		System.out.println(" Insurance Company Name is : " + getCarInsuranceNamev3(person4));

	}

	public static String getCarInsuranceNamev1(Person person) {
		return person.getCar().getInsurance().getName();
	}

	public static String getCarInsuranceNamev2(Person person) {
		if (person != null) {
			Car car = person.getCar();
			if (car != null) {
				Insurance insurance = car.getInsurance();
				if (insurance != null) {
					String name = insurance.getName();
					return name;
				}
			}
		}

		return "UnKnown";
	}

	public static String getCarInsuranceNamev3(Person person) {
		if (person == null) {
			return "UnKnown";
		}
		Car car = person.getCar();
		if (car == null) {
			return "UnKnown";
		}
		Insurance insurance = car.getInsurance();
		if (insurance == null) {
			return "UnKnown";
		}
		return (insurance.getName());
	}
}
