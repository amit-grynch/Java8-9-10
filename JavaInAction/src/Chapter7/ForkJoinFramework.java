package Chapter7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] longArray = LongStream.rangeClosed(1, 1000).toArray();
		ForkJoinTask<Long> task = new ForkJoinSumCalculator(longArray);
		long sum = new ForkJoinPool().invoke(task);
		System.out.println(sum);
	}

}

class ForkJoinSumCalculator extends RecursiveTask<Long> {

	private final long[] longArray;
	private final int start;
	private final int end;
	private static final long THRESSHOLD = 100;

	public ForkJoinSumCalculator(long[] longArray) {
		this(longArray, 0, longArray.length);
	}

	private ForkJoinSumCalculator(long[] longArray, int start, int end) {
		this.longArray = longArray;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {
		// TODO Auto-generated method stub
		int length = end - start;
		if (length < THRESSHOLD) {
			computeSequencially();
		}
		ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(longArray, start, start + length / 2);
		leftTask.fork();
		ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(longArray, start + length / 2, end);
		long rightResult = rightTask.compute();
		long leftResult = leftTask.join();
		return leftResult + rightResult;

	}

	private long computeSequencially() {
		long sum = 0;
		for (int index = start; index < end; index++) {
			sum = sum + longArray[index];
		}
		return sum;
	}
}
