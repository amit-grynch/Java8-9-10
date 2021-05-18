package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class Lecture3 {

  @Test
  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
		int minNumber = numbers.stream().min(Comparator.naturalOrder()).get();
		assertThat(minNumber).isEqualTo(1);
		System.out.println(minNumber);
  }

  @Test
  public void max() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    int minNumber = numbers.stream().max(Comparator.naturalOrder()).get();
		assertThat(minNumber).isEqualTo(100);
		System.out.println(minNumber);
  }
}
