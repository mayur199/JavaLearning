class Animal{
	void makeSound() {
		System.out.println("The animal makes a sound");
	}
}
class Dog extends Animal{
	//@Override
	static void makeSound1() {
		System.out.println("The dog barks");
	}
}
public class inheritanceexample{
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal animal = new Animal();
		dog.makeSound();
		animal.makeSound();
		Dog.makeSound1();
	}
}