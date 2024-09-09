class Cars1 {
    String brand;
    int speed;

    // Constructor with parameters
    Cars1(String brand, int speed) {
        this.brand = brand; // 'this.brand' refers to the class attribute
        this.speed = speed; // 'this.speed' refers to the class attribute
    }

    void showDetails() {
        System.out.println("Brand: " + this.brand + ", Speed: " + this.speed);
    }
}

public class ThisKeywordEg {
    public static void main(String[] args) {
        Cars1 car1 = new Cars1("Toyota", 180); // Creating an object with constructor parameters
        car1.showDetails(); // Output: Brand: Toyota, Speed: 180
    }
}
