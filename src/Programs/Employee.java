package Programs;

import java.util.List;

public class Employee {
	public int id;
	public String name;
	public List<Address> address;
	public List<Department> department;

//	public Employee(int id, String name, Address address) {
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	
	public String toString() {
		return "Employee{" + " id= " + id + ", name='" + name + '\'' + ", address=" + address + " department=" + department + '}';
	}

}
