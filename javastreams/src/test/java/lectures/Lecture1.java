package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class Lecture1 {

	@Test
	public void imperativeApproach() throws IOException {
		List<Person> people = MockData.getPeople();
		List<Person> personUnder18 = new ArrayList<Person>();
		final int limit = 10;
		int counter = 0;

		// 1. Find people aged less or equal 18
		// 2. Then change implementation to find first 10 people
		for (Person person : people) {
			if (person.getAge() <= 18 && counter < limit) {
				personUnder18.add(person);
				counter++;
			}
		}
		System.out.println(" Filtering Using Old Style Before Java8 ");
		for (Person young : personUnder18) {
			System.out.println(young);
		}
	}

	@Test
	public void declarativeApproachUsingStreams() throws Exception {
		ImmutableList<Person> people = MockData.getPeople();
		System.out.println(" Filtering Using Java 8 Stream API");
 people.stream().filter(peopleFilter -> peopleFilter.getAge() <= 18).limit(10)
				.collect(Collectors.toList()).forEach(System.out::println);;
	}
}
