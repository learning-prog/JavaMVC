/**
 * @author learning-java
 * 
 * calculate the average acceleration using below formula
			a = (v1 - v0)/t
 */

package average.acceleration.calculator;

public class MvcAverageAccelerationController {
	// POJO constructor
	public MvcAverageAccelerationController() {
		
	}
	
	// to compute average acceleration value
	public double toComputeAverageAcceleration(MvcAverageAccelerationView oMvcAverageAccelerationView) {
		double result = (oMvcAverageAccelerationView.toGetEndVelocity() - 
				oMvcAverageAccelerationView.toGetStartVelocity())/
				(oMvcAverageAccelerationView.toGetEndTime() - 
						oMvcAverageAccelerationView.toGetStartTime());
		return result;
	}
}
