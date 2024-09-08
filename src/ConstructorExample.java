class Car{
	String color;
	String model;


	Car(String color, String model){
		this.color=color;
		this.model=model;

	}
	void display() {
		System.out.println("Car color: "+ color +", Model:" + model);
	}
}
public class ConstructorExample {
	public static void main(String[] args) {
		Car mycar= new Car("Red ", "Toyota");
		mycar.display();
	}

}

