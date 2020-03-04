package Chapter3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortingAppleUsingLamba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple(30));
		appleList.add(new Apple(10));
		appleList.add(new Apple(40));
		appleList.add(new Apple(20));
		appleList.add(new Apple(50));
		// Iterating unsorted List
		System.out.println("Printing the Apple in unsorted way");
		Iterator<Apple> appleItrator = appleList.iterator();
		while (appleItrator.hasNext()) {
			System.out.println(appleItrator.next());
		}

		// sorting using inbuilt method and Iterating sorted List
		Collections.sort(appleList, new AppleComparator());
		Iterator<Apple> sortedAppleItrator1 = appleList.iterator();
		System.out.println("Printing the Apple in sorted way using Behavioural Paramertization");
		while (sortedAppleItrator1.hasNext()) {
			System.out.println(sortedAppleItrator1.next());
		}

		// sorting using inbuilt method and anonymous class and Iterating sorted List
		Collections.sort(appleList, new Comparator<Apple>() {
			@Override
			public int compare(Apple apple1, Apple apple2) {
				return apple1.getWeigth() - apple2.getWeigth();
			}

		});
		Iterator<Apple> sortedAppleItrator2 = appleList.iterator();
		System.out.println("Printing the Apple in sorted way using Using Anonymous class");
		while (sortedAppleItrator2.hasNext()) {
			System.out.println(sortedAppleItrator2.next());
		}

		// sorting using inbuilt method and Lambda Expression class and Iterating sorted
		// List
		Comparator<Apple> sortByWeigth=(Apple a1, Apple a2) -> a1.getWeigth() - a2.getWeigth();
		Collections.sort(appleList, sortByWeigth);
		Iterator<Apple> sortedAppleItrator3 = appleList.iterator();
		System.out.println("Printing the Apple in sorted way using Using Lambda Expression");
		while (sortedAppleItrator3.hasNext()) {
			System.out.println(sortedAppleItrator3.next());
		}
	}

}

class Apple {
	int weigth;

	public Apple(int weigth) {
		this.weigth = weigth;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Apple :weigth=" + weigth;
	}

}

class AppleComparator implements Comparator<Apple> {
	@Override
	public int compare(Apple apple1, Apple apple2) {
		// TODO Auto-generated method stub
		return apple1.getWeigth() - apple2.getWeigth();
	}

}
