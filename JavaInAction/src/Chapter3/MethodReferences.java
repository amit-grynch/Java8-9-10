package Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import static java.util.Comparator.comparing;

public class MethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Commenting the creation of object using Constructor References
		 * Function<Integer,AppleBean> appleBeanFun1=AppleBean::new;
		 * Function<Integer,AppleBean> appleBeanFun2=AppleBean::new;
		 * Function<Integer,AppleBean> appleBeanFun3=AppleBean::new;
		 * Function<Integer,AppleBean> appleBeanFun4=AppleBean::new;
		 * Function<Integer,AppleBean> appleBeanFun5=AppleBean::new;
		 */
		List<AppleBean> appleList = new ArrayList<>();

		BiFunction<Integer,String, AppleBean> appleBeanFun11 = (weigth,country) -> new AppleBean(weigth,country);
		AppleBean appleBean1 = appleBeanFun11.apply(200,"India");

		BiFunction<Integer,String, AppleBean> appleBeanFun22 = (weight,country) -> new AppleBean(weight,country);
		AppleBean appleBean2 = appleBeanFun22.apply(200,"USA");

		BiFunction<Integer,String, AppleBean> appleBeanFun33 = (weight,country) -> new AppleBean(weight,country);
		AppleBean appleBean3 = appleBeanFun33.apply(250,"SriLanka");

		BiFunction<Integer,String, AppleBean> appleBeanFun44 = (weight,country) -> new AppleBean(weight,country);
		AppleBean appleBean4 = appleBeanFun44.apply(190,"China");

		BiFunction<Integer,String, AppleBean> appleBeanFun55 = (weight,String) -> new AppleBean(weight,String);
		AppleBean appleBean5 = appleBeanFun55.apply(290,"Russia");
		appleList.add(appleBean1);
		appleList.add(appleBean2);
		appleList.add(appleBean3);
		appleList.add(appleBean4);
		appleList.add(appleBean5);
		// Iterating unsorted List
		System.out.println("Printing the Apple in unsorted way");
		Iterator<AppleBean> appleItrator1 = appleList.iterator();
		while (appleItrator1.hasNext()) {
			System.out.println(appleItrator1.next());
		}

		System.out.println("Printing the Apple Using Method Reference ");
		/*
		 * Commenting the code for Lambda Expression for sorting Comparator<AppleBean>
		 * compareWeigth=( a1, a2)->a1.getWeigth()-a2.getWeigth(); Comparator<AppleBean>
		 * Comparator<AppleBean> compareWeigth =
		 * Comparator.comparing(AppleBean::getWeigth); Comparator<AppleBean>
		 * compareWeigth = Comparator.comparing((AppleBean a)->a.getWeigth());
		 * Collections.sort(appleList, compareWeigth);
		 */
		Collections.sort(appleList, Comparator.comparing(AppleBean::getWeigth));
		Iterator<AppleBean> appleItrator2 = appleList.iterator();
		while (appleItrator2.hasNext()) {
			System.out.println(appleItrator2.next());
		}
		
		 // Reverse the Order of Apple List in Descending Order
		System.out.println("Printng the AppleList in Descending Order");
		Collections.sort(appleList,(Comparator.comparing(AppleBean::getWeigth)).reversed());
		Iterator<AppleBean> appleItrator3 = appleList.iterator();
		while (appleItrator3.hasNext()) {
			System.out.println(appleItrator3.next());
		}
		
		//Sort the Apple if weight of two apples are same then sort by country
		
		System.out.println("Printng the AppleList in weight and Country Order");
		Collections.sort(appleList,(Comparator.comparing(AppleBean::getWeigth)).thenComparing(AppleBean::getCountry));
		Iterator<AppleBean> appleItrator4 = appleList.iterator();
		while (appleItrator4.hasNext()) {
			System.out.println(appleItrator4.next());
		}
	}
	
  
	

}

class AppleBean {
	int weigth;
    String country;
	public AppleBean(int weigth,String country) {
		this.weigth = weigth;
		this.country=country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Apple :weigth=" + weigth + " "+ "Country= " + country;
	}

}
