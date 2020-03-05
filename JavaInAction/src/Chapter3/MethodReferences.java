package Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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

		Function<Integer, AppleBean> appleBeanFun11 = (weigth) -> new AppleBean(weigth);
		AppleBean appleBean1 = appleBeanFun11.apply(200);

		Function<Integer, AppleBean> appleBeanFun22 = (weight) -> new AppleBean(weight);
		AppleBean appleBean2 = appleBeanFun22.apply(100);

		Function<Integer, AppleBean> appleBeanFun33 = (weight) -> new AppleBean(weight);
		AppleBean appleBean3 = appleBeanFun33.apply(250);

		Function<Integer, AppleBean> appleBeanFun44 = (weight) -> new AppleBean(weight);
		AppleBean appleBean4 = appleBeanFun44.apply(190);

		Function<Integer, AppleBean> appleBeanFun55 = (weight) -> new AppleBean(weight);
		AppleBean appleBean5 = appleBeanFun55.apply(290);
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
	}

}

class AppleBean {
	int weigth;

	public AppleBean(int weigth) {
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
