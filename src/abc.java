class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name= name;
		this.age= age;
		
	}
	void printDetails() {
		System.out.println("Name: "+ name +", Age:"+ age);
		
	}
}
public class abc{
	public static void main(String[] args) {
		Person person1= new Person("sj",20);
		
		person1.printDetails();
		
	}
}