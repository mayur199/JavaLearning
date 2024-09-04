interface Animals{
	void makeSound();
}
class Cat implements Animals{
	public void makeSound() {
		System.out.println("The cat meows.");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
	}
}
