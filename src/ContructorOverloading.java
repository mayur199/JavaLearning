class Rectangle{
	int length;
	int width;

	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}


	Rectangle(int side){
		this.length=side;
		this.width=side;
	}
	int calculateArea() {
		return length * width;
	}
}
public class ContructorOverloading {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(10,5);
		System.out.println("Area of rectangle: "+ rect1.calculateArea());

		Rectangle rect2 = new Rectangle(7);
		System.out.println("Area of square: " + rect2.calculateArea());
	}

}
