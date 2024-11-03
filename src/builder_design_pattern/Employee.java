package builder_design_pattern;

public class Employee {

	private int id;
	private String name;
	private String address;
	private int phone;
	private int age;
	private String department;
	
	public Employee(int id, String name, String address, int phone, int age, String department) {
		this.address = address;
		this.age = age;
		this.department = department;
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age
				+ ", department=" + department + "]";
	}

	
}
