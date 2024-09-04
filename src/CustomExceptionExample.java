class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class CustomExceptionExample {
	static void checkAge(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Age is not valid for voting.");

		}else {
			System.out.println("Age is valid for voting");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(16);

		}catch(InvalidAgeException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}

}
