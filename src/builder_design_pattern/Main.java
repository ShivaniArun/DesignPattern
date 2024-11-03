package builder_design_pattern;

public class Main {

	public static void main(String[] args) {
		Employee emp = new EmployeeBuilder()
				.setId(1)
				.setName("Gul")
				.setPhone(1234567)
				.setAddress("Noida").build(); //age and department are not set
		System.out.println(emp);

	}

}
