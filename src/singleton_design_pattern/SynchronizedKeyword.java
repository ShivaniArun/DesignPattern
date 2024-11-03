package singleton_design_pattern;

//synchronized : Only one thread can enter the synchronized method therefore this is thread-safe
public class SynchronizedKeyword {

	private static SynchronizedKeyword obj;

	private SynchronizedKeyword() {}

	public static synchronized SynchronizedKeyword getObject() {
		if(obj == null) {
			obj = new SynchronizedKeyword();
		}
		return obj;
	}
}
