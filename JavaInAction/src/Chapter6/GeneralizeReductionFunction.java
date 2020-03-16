package Chapter6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import static java.util.stream.Collectors.*;
import Chapter4.Dishes;
import Chapter4.TYPE;
import Chapter4.TetraFunction;

/**  Writing Generalized Reducing function which  are general implementation of Many  reduction Process given in Collectios Class
 * @author amitg
 *
 */
public class GeneralizeReductionFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	        Dishes dishObj8=dishes8.apply("prawns", 300,TYPE.FISH, false);
	        
	        TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishes9=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
	        Dishes dishObj9=dishes9.apply("salmon", 450,TYPE.FISH, false);
	        
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
	          
	          //Calculate Min/Max Calories in The Dish Menu Using maptoInt and IntStream's Max/Min Operation
	           OptionalInt maxCalorie=dishesList.stream().mapToInt(Dishes::getCalories).max();
	           System.out.println(" Maximum Calorie Value Among the Dishes : "+maxCalorie.getAsInt());
	           OptionalInt minCalorie=dishesList.stream().mapToInt(Dishes::getCalories).min();
	           System.out.println(" Minimum Calorie Value Among the Dishes : "+minCalorie.getAsInt());
	           
	           //Calculate Min/Max Calories Collectors's minBy/maxBy and Comparator
	           Comparator<Dishes> dishComparator=Comparator.comparingInt(Dishes::getCalories);
	           Optional<Dishes> mostCalorieDish=dishesList.stream().collect(maxBy(dishComparator));
	           System.out.println(" Name of Dish of Max Calorie : "+mostCalorieDish.get().getName()+" And Its Calories amount :"+ mostCalorieDish.get().getCalories());
	           Optional<Dishes> lowestCalorieDish=dishesList.stream().collect(minBy(dishComparator));
	           System.out.println(" Name of Dish of Min Calorie : "+lowestCalorieDish.get().getName()+" And Its Calories amount :"+ lowestCalorieDish.get().getCalories());
	           
	           //Calculate Min/Max Calories Dish using reduce operation
	           Optional<Integer> maxCalorieDish=dishesList.stream().map(Dishes::getCalories).reduce((cal1,cal2)->cal1>cal2?cal1:cal2);
	           Optional<Integer> maxCalorieDish1=dishesList.stream().map(Dishes::getCalories).reduce(Integer::max);
	           System.out.println("  Maximum Calorie Value Among the Dishes Using Basic Reduce Operation : "+maxCalorieDish.get() +" Value Using Method References : " +maxCalorieDish1.get() );
	           
	           //Calculate Min/Max Calories Dish using Collectors's reducing operation
	           int totalCalories=dishesList.stream().collect(reducing(0,Dishes::getCalories,(dishCalorie1,dishCalorie2)->dishCalorie1+dishCalorie2));
	             System.out.println("Total Calories of Dishes in Menu :"+totalCalories);
	           //Calculate Min/Max Calories Dish using Collectors's reducing operation
	             Optional<Dishes> maxCaloriesDish=dishesList.stream().collect(reducing((Dishes d1,Dishes d2)->d1.getCalories()>d2.getCalories()?d1:d2));
	             System.out.println(" Name of Dish of Max Calorie : "+maxCaloriesDish.get().getName()+" And Its Calories amount :"+ maxCaloriesDish.get().getCalories());
	           
	           
	}

}
