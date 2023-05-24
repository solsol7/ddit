package chap05.sec07;

public enum LimitedSpeed {
	SchoolZone(30),
	Downtown(50),
	ContrySide(70);
	
	private final int value;
	
	LimitedSpeed(int value){
		this.value=value;
	}
	
	public int getValues() {
		return value;
		
		
	}
}
