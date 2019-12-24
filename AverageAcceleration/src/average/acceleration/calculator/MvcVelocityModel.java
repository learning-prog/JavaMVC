/**
 * @author learning-java
 * 
 * user inputs for start velocity(v0) and end velocity(v1)
 */

package average.acceleration.calculator;

public class MvcVelocityModel {
	// class variables
	private double startVelocity;
	private double endVelocity;
	
	// to set user inputs for start velocity
	public void setStartVelocity(double startVel) {
		this.startVelocity = startVel;
	}
	// to get/retrieve user inputs for start velocity
	public double getStartVelocity() {
		return startVelocity;
	}
	
	
	// to set user inputs for end velocity
	public void setEndVelocity(double endVel) {
		this.endVelocity = endVel;
	}
	// to get/retrieve user inputs for end velocity
	public double getEndVelocity() {
		return endVelocity;
	}
		 
}
