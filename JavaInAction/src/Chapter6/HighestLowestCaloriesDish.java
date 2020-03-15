package Chapter6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import static java.util.stream.Collectors.*;
import Chapter4.Dishes;
import Chapter4.TYPE;
import Chapter4.TetraFunction;

public class HighestLowestCaloriesDish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating the Dishes class Object using Java 8 Constructor References and Storing in the List
				TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes1=(name,calories,type,isVegetrain) -> new Dishes(name, calories, type, isVegetrain);
			       Dishes dishObj1=dishes1.apply("pork",800 ,TYPE.MEAT, false);
			       
			       TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes2=(name,calories,type,isVegetrain) -> new Dishes(name,calories,type,isVegetrain);
			       Dishes dishObj2=dishes2.apply("beef", 700, TYPE.MEAT, false);
			       
			       TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes3=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
			        Dishes dishObj3=dishes3.apply("chicken", 400,TYPE.MEAT, false);
			        
			        TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes4=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
			        Dishes dishObj4=dishes4.apply("french", 500,TYPE.OTHERS, true);
			        
			        TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes5=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
			        Dishes dishObj5=dishes5.apply("rice", 350,TYPE.OTHERS, true);
			        
			        TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes6=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
			        Dishes dishObj6=dishes6.apply("season fruits", 120,TYPE.OTHERS, true);
			        
			        TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes7=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
			        Dishes dishObj7=dishes7.apply("pizza", 550,TYPE.OTHERS, true);
			        
			        TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes8=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
			        Dishes dishObj8=dishes8.apply("prawns", 30,TYPE.FISH, false);
			        
			        TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes9=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
			        Dishes dishObj9=dishes9.apply("salmon", 950,TYPE.FISH, false);
			        
			        List<Dishes> dishesList=new ArrayList<Dishes>();
			          dishesList.add(dishObj1);
			          dishesList.add(dishObj2);
			          dishesList.add(dishObj3);
			          dishesList.add(dishObj4);
			          dishesList.add(dishObj5);
			          dishesList.add(dishObj6);
			          dishesList.add(dishObj7);
			          dishesList.add(dishObj8);
			          dishesList.add(dishObj9);

			//Finding the dish of Highest and Lowest Calories
			 OptionalLong highestCalories=dishesList.stream().mapToLong(Dishes::getCalories).max();
			 System.out.println(" Hightest Calories among the dishes is : "+highestCalories.getAsLong());
			long lowestCalories=dishesList.stream().mapToLong(Dishes::getCalories).min().getAsLong();
			 System.out.println(" Lowest Calories among the dishes is : "+lowestCalories);
			 //Finding the dish of Highest and Lowest Calories using Collector's Method minBy and maxBy
			 Comparator<Dishes> dishCaloriesComparator=Comparator.comparingInt(Dishes::getCalories);
			 Optional<Dishes> maxCalories=dishesList.stream().collect(maxBy(dishCaloriesComparator));
			 System.out.println(" Hightest Calories among the dishe's Name is : "+maxCalories.get().getName() +" has Calories "+maxCalories.get().getCalories());
			 Optional<Dishes> minCalories=dishesList.stream().collect(minBy(dishCaloriesComparator));
			 System.out.println(" Lowest Calories among the dishe's Name is : "+minCalories.get().getName() +" has Calories "+minCalories.get().getCalories());
	}
	

}
