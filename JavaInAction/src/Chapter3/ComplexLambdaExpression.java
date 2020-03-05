package Chapter3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class ComplexLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,String,Orange> orangeBean1=(weight,country)->new Orange(weight,country);
		Orange orange1=orangeBean1.apply(100, "India");
		BiFunction<Integer,String,Orange> orangeBean2=(weight,country)->new Orange(weight,country);
		Orange orange2=orangeBean2.apply(200, "India");
		BiFunction<Integer,String,Orange> orangeBean3=(weight,country)->new Orange(weight,country);
		Orange orange3=orangeBean3.apply(300, "India");
		BiFunction<Integer,String,Orange> orangeBean4=(weight,country)->new Orange(weight,country);
		Orange orange4=orangeBean4.apply(100, "USA");
		BiFunction<Integer,String,Orange> orangeBean5=(weight,country)->new Orange(weight,country);
		Orange orange5=orangeBean5.apply(100, "USA");
		List<Orange> orangeList=new ArrayList<Orange>();
		orangeList.add(orange1);
		orangeList.add(orange2);
		orangeList.add(orange3);
		orangeList.add(orange4);
		orangeList.add(orange5);
		
		//Printing the Orange 
		System.out.println("***Printing Ornage****");
		Iterator<Orange> orangeIterator=orangeList.iterator();
		while(orangeIterator.hasNext()) {
			System.out.println(orangeIterator.next());
		}
		
		//Filtering Orange Based on Criteria
		Predicate<Orange> weightPredicate=(Orange orange)->orange.getWeight()>=200;
		//Predicate<Orange> countryPredicate=(Orange orange)->orange.getCountry().equals("India");
		List<Orange> filterOrangeList=filterOrange(orangeList,weightPredicate.and((Orange orange)->orange.getCountry().equals("India")));
		Iterator<Orange> filterOrangeIterator=filterOrangeList.iterator();
		System.out.println("PrintingOrange Based on weigth greater than 200 and Country India ");
		while(filterOrangeIterator.hasNext()) {
			System.out.println(filterOrangeIterator.next());
		}
	}
   public static List<Orange> filterOrange(List<Orange> orangeList,Predicate<Orange> orangePredicate){
	   List<Orange> filterredOrange=new ArrayList<Orange>();
	    for(Orange orange:orangeList) {
	    	 if(orangePredicate.test(orange))
	    		 filterredOrange.add(orange);
	    }
	    return filterredOrange;
   }
}

class Orange{
	int weight;
	String country;
	
	public Orange(int weight, String country) {
		super();
		this.weight = weight;
		this.country = country;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Orange [weight=" + weight + ", country=" + country + "]";
	}
	
}


