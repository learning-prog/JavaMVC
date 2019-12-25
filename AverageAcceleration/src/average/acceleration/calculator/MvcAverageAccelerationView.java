/**
 * @author learning-java
 * 
 * 1. take user inputs
 * 2. publish the result average acceleration value
 */

package average.acceleration.calculator;

import java.util.Scanner;

public class MvcAverageAccelerationView {
	// instantiations
	MvcVelocityModel oMvcVelocityModel = new MvcVelocityModel();
	MvcTimeModel oMvcTimeModel = new MvcTimeModel();
	
	// POJO constructor
	public MvcAverageAccelerationView() {
		
	}
	
	// to take user inputs for start velocity
	public void toSetStartVelocity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start velocity (in m/s) of the vehicle : ");
		oMvcVelocityModel.setStartVelocity(sc.nextDouble());		
	}	
	// to retrieve user inputs for start velocity
	public double toGetStartVelocity() {
		return oMvcVelocityModel.getStartVelocity();
	}
	
	
	// to take user inputs for end velocity
	public void toSetEndVelocity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end velocity (in m/s) of the vehicle : ");
		oMvcVelocityModel.setEndVelocity(sc.nextDouble());		
	}	
	// to retrieve user inputs for end velocity
	public double toGetEndVelocity() {
		return oMvcVelocityModel.getEndVelocity();
	}	
	

	// to take user inputs for start time
	public void toSetStartTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start time (in sec) of the vehicle : ");
		oMvcTimeModel.setStartTime(sc.nextInt());		
	}	
	// to retrieve user inputs for start time
	public int toGetStartTime() {
		return oMvcTimeModel.getStartTime();
	}
	
	
	// to take user inputs for end time
	public void toSetEndTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end time (in sec) of the vehicle : ");
		oMvcTimeModel.setEndTime(sc.nextInt());		
	}	
	// to retrieve user inputs for end time
	public int toGetEndTime() {
		return oMvcTimeModel.getEndTime();
	}
	
	
	// to display average acceleration result value
	public void toDisplayAverageAccelerationValue(double res) {
		System.out.println("The calculated average acceleration (in m/s2) value is : "+res);
	}
		
}
