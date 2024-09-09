class Car1 {
    private String model;  

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
public class CarExample {
    public static void main(String[] args) {
        Car1 myCar = new Car1();    
        myCar.setModel("Toyota"); 
        System.out.println(myCar.getModel()); 
    }
}
