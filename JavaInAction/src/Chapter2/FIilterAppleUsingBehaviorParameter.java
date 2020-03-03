package Chapter2;

import java.util.ArrayList;
import java.util.List;

public class FIilterAppleUsingBehaviorParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<AppleBean> appleList=new ArrayList<AppleBean>();
        appleList.add(new AppleBean(120,ENUMCOLOR.GREEN));
        appleList.add(new AppleBean(160,ENUMCOLOR.GREEN));
        appleList.add(new AppleBean(170,ENUMCOLOR.RED));
        appleList.add(new AppleBean(190,ENUMCOLOR.RED));
//        Implementing Behaviour Parameterization using interface
        List<AppleBean> resultAppleBean=filterApple(appleList,new AppleHeavyWieghtRedPredicate());
        for(AppleBean apple:resultAppleBean ) {
        	System.out.println(apple);
        }
        //Removing the code verbosity using Anonymous class instead of creating Concrete class of predicate interface
        List<AppleBean> resultAnonymousAppleBean=filterApple(appleList,new ApplePredicate() {
        	public boolean test(AppleBean appleBean) {
        		return appleBean.getWeight()>100 && appleBean.getColor().equals(ENUMCOLOR.GREEN);
        	}
        });
        for(AppleBean apple:resultAnonymousAppleBean ) {
        	System.out.println(apple);
        }
	}
	
	public static List<AppleBean> filterApple(List<AppleBean> apple,ApplePredicate predicate ){
		List<AppleBean> result=new ArrayList<AppleBean>();
		 for(AppleBean appleBean:apple) {
			if( predicate.test(appleBean)){
				 result.add(appleBean);
			 }
		 }
		 return result;
	}

}

enum ENUMCOLOR {
	RED, GREEN
}

class AppleBean {
	int weight;
	ENUMCOLOR color;

	public AppleBean(int weight, ENUMCOLOR color) {
		this.weight = weight;
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public ENUMCOLOR getColor() {
		return color;
	}

	public void setColor(ENUMCOLOR color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "AppleBean [weight=" + weight + ", color=" + color + "]";
	}

}

interface ApplePredicate{
	boolean test(AppleBean appleBean);
}

class AppleWieghtPredicate implements ApplePredicate{
	public boolean test(AppleBean appleBean) {
		 return appleBean.getWeight()>150;
	}
}

class AppleHeavyWieghtRedPredicate implements ApplePredicate{
	public boolean test(AppleBean appleBean) {
		 return appleBean.getWeight()>150 && appleBean.getColor().equals(ENUMCOLOR.RED);
	}
}