package Chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Dishes> dishesList=new ArrayList<Dishes>();
	      
	      TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishFunc1=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
	       Dishes dishObj1=dishFunc1.apply("patoto", 100, TYPE.OTHERS, true);
	       
	       TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishFunc2=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
	       Dishes dishObj2=dishFunc2.apply("Fish", 200, TYPE.FISH, false);
	       
	       TetraFunction<String,Integer,TYPE,Boolean,Dishes> dishFunc3=(name,calories,type,isVegetrain)->new Dishes(name,calories,type,isVegetrain);
	       Dishes dishObj3=dishFunc3.apply("Mutton", 300, TYPE.MEAT, false);
	       dishesList.add(dishObj1);
	       dishesList.add(dishObj2);
	       dishesList.add(dishObj3);
	       
	       Stream<Dishes> dishStream=dishesList.stream();
	       dishStream.forEach(System.out::println);
	}

}
