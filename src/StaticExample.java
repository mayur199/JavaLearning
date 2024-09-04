
public class StaticExample {
	static int count=0;
	static void incrementCount() {
		count++;
	}

	public static void main(String[] args) {

		incrementCount();
		incrementCount();
		System.out.println("count: "+ count);
	}
}
