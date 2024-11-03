package singleton_design_pattern;

//Only instance creation is written in synchronized block.
public class DoubleCheckedLocking {

	private static volatile DoubleCheckedLocking obj;
	
	private DoubleCheckedLocking() {}
	
	public static DoubleCheckedLocking getObject() {
		if(obj == null) {
			synchronized (DoubleCheckedLocking.class) {
				if(obj == null) {
					obj = new DoubleCheckedLocking();
				}
			}
		}
		return obj;
	}
}
