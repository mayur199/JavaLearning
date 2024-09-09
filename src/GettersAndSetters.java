

public class GettersAndSetters {
    public static void main(String[] args) {
        // Create a Person object
        Person1 person = new Person1();
        
        // Use setters to set values
        person.setName("Alice");
        person.setAge(30);

        // Use getters to retrieve values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
