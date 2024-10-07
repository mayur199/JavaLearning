package Programs;

public class Department {

	public int departmentId;
	public String departmentName;
	public String departmentHead;

	
	public int getdeparmentId() {
		return departmentId;
	}

	public void setdeparmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getdepartmentName() {
		return departmentName;
	}

	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getdepartmentHead() {
		return departmentHead;
	}

	public void setdepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentHead="
				+ departmentHead + "]";
	}
	
	
}
