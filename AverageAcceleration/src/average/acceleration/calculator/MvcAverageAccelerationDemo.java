/**
 * @author learning-java
 * 
 * publish the result average acceleration value
 */

package average.acceleration.calculator;

public class MvcAverageAccelerationDemo {

	public static void main(String[] args) {
		// instantiations
		MvcAverageAccelerationView oMvcAverageAccelerationView = new MvcAverageAccelerationView();
		MvcAverageAccelerationController oMvcAverageAccelerationController = new MvcAverageAccelerationController();
		
		// to take user inputs for start velocity
		oMvcAverageAccelerationView.toSetStartVelocity();
		// to take user inputs for end velocity
		oMvcAverageAccelerationView.toSetEndVelocity();
		
		// to take user inputs for start time
		oMvcAverageAccelerationView.toSetStartTime();
		// to take user inputs for end time
		oMvcAverageAccelerationView.toSetEndTime();
		
		// to calculate average acceleration value
		double res = oMvcAverageAccelerationController.toComputeAverageAcceleration(oMvcAverageAccelerationView);
		
		// to display average acceleration value
		oMvcAverageAccelerationView.toDisplayAverageAccelerationValue(res);
	}

}
