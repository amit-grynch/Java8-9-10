package Chapter11;

import java.util.Optional;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class OptionalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Integer> value = Optional.of(5);
		value.ifPresent(System.out::println);

		if (value.isPresent()) {
			System.out.println(value.get());
		}

		String text = null;
		String name = Optional.ofNullable(text).orElseGet(() -> "Default");
		System.out.println(name);

		Optional<Integer> intValue = Optional.empty();
		System.out.println(intValue);
	}

}
