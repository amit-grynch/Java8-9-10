package Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amitg Can not Add or Remove data From List ,only Update is allowed
 *         Using set method
 */
public class ArraysAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> friendList = new ArrayList<String>();
		friendList.add("Amit");
		friendList.add("kumar");
		friendList.add("Sharma");
		System.out.println("Printing FriendList : " + friendList);

		List<String> friendsList = Arrays.asList("Amit", "Kumar", "Sharma");
		System.out.println("Printing FriendList : " + friendsList);
		friendsList.set(2, "Java Developer");
		System.out.println("Printing FriendList : " + friendsList);
		friendsList.add("science");
		System.out.println("Printing FriendList : " + friendsList);
	}

}
