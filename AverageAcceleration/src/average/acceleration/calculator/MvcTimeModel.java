/**
 * @author learning-java
 * 
 * user inputs for taken time duration(t)
 */

package average.acceleration.calculator;

public class MvcTimeModel {
	// class variables
	private int startTime;
	private int endTime;
	
	// to set user inputs for start time
	public void setStartTime(int startTim) {
		this.startTime = startTim;
	}
	// to get/retrieve user inputs for start time
	public int getStartTime() {
		return startTime;
	}
	
	
	// to set user inputs for end time
	public void setEndTime(int endTim) {
		this.endTime = endTim;
	}
	// to get/retrieve user inputs for end time
	public int getEndTime() {
		return endTime;
	}
}
