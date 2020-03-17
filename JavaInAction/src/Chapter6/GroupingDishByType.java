package Chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
import Chapter4.Dishes;
import Chapter4.TYPE;
import Chapter4.TetraFunction;

/**
 * @author amitg
 *
 */
public class GroupingDishByType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes1 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj1 = dishes1.apply("pork", 800, TYPE.MEAT, false);

		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes2 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj2 = dishes2.apply("beef", 700, TYPE.MEAT, false);

		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes3 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj3 = dishes3.apply("chicken", 400, TYPE.MEAT, false);

		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes4 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj4 = dishes4.apply("french", 500, TYPE.OTHERS, true);

		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes5 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj5 = dishes5.apply("rice", 350, TYPE.OTHERS, true);

		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes6 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj6 = dishes6.apply("season fruits", 120, TYPE.OTHERS, true);

		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes7 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj7 = dishes7.apply("pizza", 550, TYPE.OTHERS, true);

		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes8 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj8 = dishes8.apply("prawns", 300, TYPE.FISH, false);

		TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes9 = (name, calories, type,
				isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
		Dishes dishObj9 = dishes9.apply("salmon", 450, TYPE.FISH, false);

		List<Dishes> dishesList = new ArrayList<Dishes>();
		dishesList.add(dishObj1);
		dishesList.add(dishObj2);
		dishesList.add(dishObj3);
		dishesList.add(dishObj4);
		dishesList.add(dishObj5);
		dishesList.add(dishObj6);
		dishesList.add(dishObj7);
		dishesList.add(dishObj8);
		dishesList.add(dishObj9);

		// Classifying the Dishes based on their type
		Map<TYPE, List<Dishes>> dishGroupByType = dishesList.stream().collect(groupingBy((Dishes d) -> d.getType()));
		System.out.println("Grouping the Dishes According to their Type : " + dishGroupByType);

		// Classifying the Dishes Based on their Calorie Like Diet/Normal/Fat

		Map<CalorieLevel, List<Dishes>> dishGroupedByCalorie = dishesList.stream().collect(groupingBy((Dishes d) -> {
			if (d.getCalories() <= 400)
				return CalorieLevel.DIET;
			else if (d.getCalories() > 400 && d.getCalories() <= 700)
				return CalorieLevel.NORMAL;
			else
				return CalorieLevel.FAT;
		}));

		System.out.println(" Grouping the Dishes According to their Calorie : " + dishGroupedByCalorie);

		// Grouping the Dishes Which are having calories more than 500
		Map<TYPE, List<Dishes>> dishGroupedByCalorieMoreThan500 = dishesList.stream()
				.filter((Dishes d) -> d.getCalories() >= 500).collect(groupingBy(Dishes::getType));
		System.out.println(" Grouping the Dishes According to their Calorie : " + dishGroupedByCalorieMoreThan500);

		// Grouping the Dishes Which are having calories more than 500 using overloaded
		// filtering method which takes classifier and Collector as argument

		Map<TYPE, List<Dishes>> dishGroupedByCalorieMoreThan500_1 = dishesList.stream()
				.collect(groupingBy(Dishes::getType, filtering((Dishes d) -> d.getCalories() > 500, toList())));
		System.out.println(
				" Grouping the Dishes According to their Calorie using overloaded filtering method which takes classifier and Collector as argument : "
						+ dishGroupedByCalorieMoreThan500_1);

		// Grouping the Menu List Based on Type and Using Mapping function for print the
		// name
		Map<TYPE, List<String>> dishGroupedbyTypeAndPrintName = dishesList.stream()
				.collect(groupingBy(Dishes::getType, mapping(Dishes::getName, toList())));
		System.out.println(
				"Grouping the Menu Based on Dishes Type and Showing Dishes's name :" + dishGroupedbyTypeAndPrintName);
	}

}
