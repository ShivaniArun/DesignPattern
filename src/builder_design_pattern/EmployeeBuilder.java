package builder_design_pattern;

public class EmployeeBuilder {

	private int id;
	private String name;
	private String address;
	private int phone;
	private int age;
	private String department;
	
	public EmployeeBuilder setId(int id) {
		this.id = id;
		return this;
	}
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public EmployeeBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	public EmployeeBuilder setPhone(int phone) {
		this.phone = phone;
		return this;
	}
	public EmployeeBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public EmployeeBuilder setDepartment(String department) {
		this.department = department;
		return this;
	}

	public Employee build() {
		return new Employee(id, name, address, phone, age, department);
	}
}
