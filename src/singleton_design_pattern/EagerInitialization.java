package singleton_design_pattern;

//Eager Initialization : Instance is created at the time of class loading
public class EagerInitialization {
	
	private static EagerInitialization obj = new EagerInitialization();
	
	private EagerInitialization() {}
	
	public static EagerInitialization getObject() {
		return obj;
	}

}
