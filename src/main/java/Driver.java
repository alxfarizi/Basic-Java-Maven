package src.main.java;

public class Driver {
	public static void main(String[] args) {
		Counter counter = new Counter();

		printCount(counter);
		counter.increment();
		printCount(counter);
		counter.decrement();
		printCount(counter);
	}

	private static void printCount(Counter counter) {
		System.out.println("Count: " + counter.getCount());
	}
}
