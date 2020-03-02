package Chapter2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> appleList = new ArrayList<Apple>();
		appleList.add(new Apple(100, Color.RED));
		appleList.add(new Apple(150, Color.GREEN));
		appleList.add(new Apple(200, Color.GREEN));
		//List<Apple> appleByColor = getAppleByColor(appleList,Color.RED);
		List<Apple> appleByWeight = getAppleByWeigth(appleList,150);
		Iterator<Apple> appleItrator = appleByWeight.iterator();
		while (appleItrator.hasNext()) {
			Apple apple = appleItrator.next();
			System.out.println(apple);
		}

	}

	public static List<Apple> getAppleByColor(List<Apple> appleList,Color color) {
		List<Apple> filterResult = new ArrayList<Apple>();
		for (Apple apple : appleList) {
			if (apple.getColor().equals(color)) {
				filterResult.add(apple);
			}
		}
		return filterResult;
	}
	
	public static List<Apple> getAppleByWeigth(List<Apple> appleList,int weight){
		List<Apple> filterResult = new ArrayList<Apple>();
		for (Apple apple : appleList) {
			if (apple.getWeight()>=weight) {
				filterResult.add(apple);
			}
		}
		return filterResult;
	}
}

enum Color {
	RED, GREEN
}

class Apple {
	public int weight;
	Color color;

	public Apple(int weight, Color color) {
		this.weight = weight;
		this.color = color;

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}

}
