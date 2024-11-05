package adapter_design_pattern;

public class Main {

	public static void main(String[] args) {
		LengthInInch lenght = new LengthAdapter();
		System.out.println(lenght.getLengthInInch());
	}

}
