package Chapter6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.sun.activation.registries.MailcapTokenizer;

import static java.util.stream.Collectors.*;
import Chapter4.Dishes;
import Chapter4.TYPE;
import Chapter4.TetraFunction;

public class MultiLevelGrouping {

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
		Dishes dishObj7 = dishes7.apply("pizza", 150, TYPE.OTHERS, true);

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

		// Performing MultiLevel grouping on Dishes items
		Map<TYPE, Map<CalorieLevel, List<String>>> dishesBYTypeByCalorieLevel = dishesList.stream()
				.collect(groupingBy(Dishes::getType, groupingBy((Dishes d) -> {
					if (d.getCalories() <= 400)
						return CalorieLevel.DIET;
					else if (d.getCalories() > 400 && d.getCalories() <= 700)
						return CalorieLevel.NORMAL;
					else
						return CalorieLevel.FAT;
				}, mapping(Dishes::getName, toList())))

		);

		System.out.println(
				" Printing the Value of Dishes which grouped by Type and Calories : " + dishesBYTypeByCalorieLevel);

		// Counting the Number of Dish Type Each
		Map<TYPE, Long> dishTypeCount = dishesList.stream().collect(groupingBy(Dishes::getType, counting()));
		System.out.println("Printing The Number of Dishes corrosponding Type : " + dishTypeCount);

		// Counting The
		Comparator<Dishes> caloriesComparator = Comparator.comparingInt(Dishes::getCalories);
		Map<TYPE, Optional<Dishes>> maxCalorieAmongDishType = dishesList.stream()
				.collect(groupingBy(Dishes::getType, maxBy(caloriesComparator)));
		System.out.println(" Dishes Type and Max Calories of Corrosponding Dish Type : " + maxCalorieAmongDishType);
		
		maxCalorieAmongDishType.forEach((TYPE,Optional  )->System.out.println("Type= "+TYPE+" DishName ="+Optional.get().getName()+" Dish Calories"+Optional.get().getCalories()));

		// Printing the Dish type and Max calories Value in Corresponding DishType
		Map<TYPE, Optional<Integer>> dishTypeWithCorrospondingMaxCalorie = dishesList.stream()
				.collect(groupingBy(Dishes::getType,mapping(Dishes::getCalories,maxBy(Integer::max))));
		dishTypeWithCorrospondingMaxCalorie.forEach((TYPE,Optional)->System.out.println(TYPE+" "+Optional.get()));
		
	}

}
