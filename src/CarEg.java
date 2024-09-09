class Car0 {
    String brand;
    int speed;

    // Constructor 1: No parameters
    Car0() {
        brand = "Unknown";
        speed = 0;
    }

    // Constructor 2: One parameter
    Car0(String brand) {
        this.brand = brand;
        speed = 0;
    }

    // Constructor 3: Two parameters
    Car0(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class CarEg {
    public static void main(String[] args) {
        Car0 car1 = new Car0();              // Calls constructor with no parameters
        Car0 car2 = new Car0("Toyota");      // Calls constructor with one parameter
        Car0 car3 = new Car0("Honda", 120);  // Calls constructor with two parameters
        
        car1.display();
        car2.display();
        car3.display();
    }
}
