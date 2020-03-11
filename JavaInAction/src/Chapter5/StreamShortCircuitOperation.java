package Chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Chapter4.Dishes;
import Chapter4.TYPE;
import Chapter4.TetraFunction;

public class StreamShortCircuitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes1 = (name, calories, type,
						isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
				Dishes dishObj1 = dishes1.apply("pork", 800, TYPE.MEAT, false);

				TetraFunction<String, Integer, TYPE, Boolean, Dishes> dishes6 = (name, calories, type,
						isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
				Dishes dishObj6 = dishes6.apply("season fruits", 120, TYPE.OTHERS, true);

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
				dishesList.add(dishObj6);
				dishesList.add(dishObj2);
				dishesList.add(dishObj3);
				dishesList.add(dishObj4);
				dishesList.add(dishObj5);
				dishesList.add(dishObj7);
				dishesList.add(dishObj8);
				dishesList.add(dishObj9);
				
				boolean isVegetarianAvailable=dishesList.stream().anyMatch(Dishes::isVegetrain);
				if(isVegetarianAvailable) {
					System.out.println("Vegetarian Dishes are Available");
				}else {
					System.out.println(" No Vegetarian Dishes ");
				}
				
				boolean isHealthy=dishesList.stream().allMatch(dishes->dishes.getCalories()<1000);
				if(isHealthy) {
					System.out.println("Calories are lower and healthy");
				}else {
					System.out.println(" NO Calories are lower and healthy ");
				}
				
				boolean isNotHealthy=dishesList.stream().noneMatch(dishes->dishes.getCalories()>1000);
				if(isNotHealthy) {
					System.out.println("calories are higher and unhealthy");
				}else {
					System.out.println(" No calories are higher and unhealthy");
				}
				
				Optional<Dishes> dish=dishesList.stream().filter(dishes->dishes.getCalories()>100).findAny();
				System.out.println(dish);
				
				Optional<Dishes> firstVegDish=dishesList.stream().filter(dishes->dishes.isVegetrain()).findFirst();
				System.out.println(firstVegDish);
				

	}

}
