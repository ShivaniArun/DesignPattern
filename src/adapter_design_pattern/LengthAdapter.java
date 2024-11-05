package adapter_design_pattern;

public class LengthAdapter implements LengthInInch {

	LengthInFoot lengthInFoot;
	
	public LengthAdapter() {
		lengthInFoot = new LengthInFoot();
	}
	
	@Override
	public int getLengthInInch() {
		int length = lengthInFoot.getLengthInFoot();
		length = length * 12;
		return length;
	}

}
