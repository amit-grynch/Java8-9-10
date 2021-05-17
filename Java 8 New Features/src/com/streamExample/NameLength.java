package com.streamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("amitsharma");
		list.add("amitkumar");
		list.add("grynch");
		list.add("bangalore");
		List<String> requiredName = list.stream().filter(str -> str.length() > 8).collect(Collectors.toList());
		System.out.println(requiredName);
		List<String> upperCaseName = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseName);
		Long count = list.stream().filter(str -> str.length() > 8).count();
		System.out.println(count);
		List<String> requiredNameSorted = list.stream().filter(str -> str.length() > 8).sorted()
				.collect(Collectors.toList());
		System.out.println(requiredNameSorted);
		list.stream().forEach(s -> System.out.println(s));
		list.stream().forEach(System.out::println);
		Stream<Integer> stream = Stream.of(9, 99, 999, 9999);
		stream.forEach(System.out::println);

	}

}
