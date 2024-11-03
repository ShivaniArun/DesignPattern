package singleton_design_pattern;

public enum ByEnum {

	SINGLETON;

	public static void getValue() {
		System.out.print("Only one instance of SINGLETON is there.");
	}
}
