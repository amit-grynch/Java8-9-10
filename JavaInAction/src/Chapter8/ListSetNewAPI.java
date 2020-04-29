package Chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSetNewAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listName = new ArrayList<String>();
		listName.add("Amit");
		listName.add("Kumar");
		listName.add("Sharma");
		listName.removeIf(valueField -> valueField.equals("Sharma"));
		Iterator<String> iterator = listName.iterator();
		while (iterator.hasNext()) {
			/*
			 * if (iterator.next().equals("Sharma")) { iterator.remove(); }
			 */
			String value = iterator.next();
			System.out.println(value);

		}

		System.out.println(listName);
	}

}
