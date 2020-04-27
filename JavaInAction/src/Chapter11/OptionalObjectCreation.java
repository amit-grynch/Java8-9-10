package Chapter11;

import java.util.Optional;

public class OptionalObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person {
	Optional<Car> optCar;

	public Optional<Car> getCar() {
		return optCar;
	}

}

class Car {
	Optional<Insurance> optInsurance;

	public Optional<Insurance> getInsurance() {
		return optInsurance;
	}
}

class Insurance {
	String name;

	public String getName() {
		return name;
	}
}
