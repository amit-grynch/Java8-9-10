package Chapter11;

import java.util.Optional;

public class OptionalWithFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();
        System.out.println(emptyGender.filter(g->g.equals("MALE")));
        System.out.println(gender.filter(g->g.equals("MALE")).get());
        gender.filter(g->g.equals("MALE")).ifPresent(x->System.out.println("Value is Persent"));
        
 
	}

}
