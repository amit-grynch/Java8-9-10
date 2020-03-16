


package Chapter6;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import Chapter4.Dishes;
import Chapter4.TYPE;
import Chapter4.TetraFunction;

/**
 * @author amitg
 *
 */

public class DishesCaloriesSummation {

	/**
	 * @param args
	 */
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
	          
 
	          //	          Summing the Calories using maptoInt 
	          int caloriesSum=dishesList.stream().mapToInt(Dishes::getCalories).sum();
	          System.out.println("Summation of Calories of All Dishes in menu  is :"+ caloriesSum);

	          //	          Calculate the sum using Collectors's summingInt method
	          int totalCalories=dishesList.stream().collect(Collectors.summingInt(Dishes::getCalories));
	          System.out.println("Total Calories of Dishes in Menu is :"+totalCalories);
	          
             //	              Calculating  the Average of   Calories of Dishes Using Collectors Methods
	          double avgCalories=dishesList.stream().collect(Collectors.averagingInt(Dishes::getCalories));
	          System.out.println(" Average Amount of Calories in Dishes of Menu is :"+avgCalories);
	          
            //	              Calculating the Average of Calories of  Dishes Using maptoInt
	          OptionalDouble avgDishCalories=dishesList.stream().mapToInt(Dishes::getCalories).average();
	          System.out.println(" Average  Calories in Dishes of Menu is :"+avgDishCalories.getAsDouble());
	          
         //	      Calculating the  Summation,Average,Max,Min in single Operation	
	            IntSummaryStatistics  dishSummaryStatistics=dishesList.stream().collect(Collectors.summarizingInt(Dishes::getCalories));
	            System.out.println("Total Sum Of Calories Of Dishes :"+dishSummaryStatistics.getSum()+" Avarage Calories Of Dishes :"+dishSummaryStatistics.getAverage()+" Max Calories Value in Dishes "+dishSummaryStatistics.getMax()+" Min Calories Value in Dishes:"+dishSummaryStatistics.getMin()+" Total Number Of Dishes in Menu :"+ dishSummaryStatistics.getCount());
	          
	}
	

}
