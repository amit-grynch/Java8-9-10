package Chapter8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.Map.*;
/**
 * @author amitg
 *  
 */
public class ListSetMapCreationNewAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List Creation Using Java 9 API
		List<String> friendList=List.of("Amit","Kumar","Sharma","null");
		System.out.println(friendList);
		
		// Set Creation Using Java 9 API
		Set<String> setString=Set.of("Amit","Kumar","Sharma");
		System.out.println(setString);
		
		// Map Creation Using Java 9 API
		
		Map<String,String> mapObject=Map.of("Amit","4","Kumar","5","Sharma","6");
		System.out.println(mapObject);
		
		Map<String,String> mapString=Map.ofEntries(entry("Amit","10"),
				                                    entry("Kumar","20"),
				                                    entry("Sharma","30"));
		System.out.println(mapString);
	}

}
