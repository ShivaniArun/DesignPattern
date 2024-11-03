package singleton_design_pattern;

//Lazy Initialization : Object is created when it is required and it is not thread safe
public class LazyInitialization {
	
	private static LazyInitialization obj;

	private LazyInitialization() {}
	
	public static LazyInitialization getObject() {
		if(obj == null) {
			obj = new LazyInitialization();
		}
		return obj;
	}
}
