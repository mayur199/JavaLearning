package Programs;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
	public static void main(String[] args) {
		Address puneAddress = new Address();
		Address kalyanAddress = new Address();
		List<Address> al = new ArrayList<>();
        List<String> punePhoneNumber = new ArrayList<>();
        for(int i=0; i<=10 ;i++) {
        	punePhoneNumber.add(String.valueOf(i));
        }
        punePhoneNumber.add("8868757575");
        punePhoneNumber.add("9687575875");

        List<String> kalyanPhoneNumber = new ArrayList<>();
        kalyanPhoneNumber.add("8976488455");
		puneAddress.setCity("Pune");
		puneAddress.setStreet("RN");
		puneAddress.setState("MH");
		puneAddress.setZipCode("123456");
		puneAddress.setPhno(punePhoneNumber);
		
		kalyanAddress.setCity("Kalyan");
		kalyanAddress.setStreet("RN");
		kalyanAddress.setState("MH");
		kalyanAddress.setZipCode("123456");
		kalyanAddress.setPhno(kalyanPhoneNumber);
		
		al.add(kalyanAddress);
		al.add(puneAddress);

		Department department = new Department();
		List<Department> dp = new ArrayList<>();
		Department dep = new Department();
		department.setdeparmentId(0);
		department.setdepartmentName("HR");
		department.setdepartmentHead("AA");
		
		dep.setdeparmentId(1);
		dep.setdepartmentName("Tech");
		dep.setdepartmentHead("DD");
		dp.add(dep);
		dp.add(department);
		Employee employee = new Employee();
		employee.setId(0);
		employee.setName("abc");
		employee.setAddress(al);
		employee.setDepartment(dp);
	
		
		System.out.println("Employee Details:");
		System.out.println(employee);
		
		
	}

}
