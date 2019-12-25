/**
 * @author learning-java
 * 
 * 1. read the user inputs for radius and length of cylinder.
 * 2. publish the results, i.e. area and volume.
 */

package area.volume.of.cylinder;

import java.util.Scanner;

public class MvcCylinderView {
	// instantiations
	MvcRadiusModel oMvcRadiusModel = new MvcRadiusModel();
	MvcLengthModel oMvcLengthModel = new MvcLengthModel();
	Scanner sc = new Scanner(System.in);
	
	// POJO constructor
	public MvcCylinderView() {
		
	}
	
	// to read user input for radius of cylinder
	public void readRadiusOfCylinder() {
		System.out.println("Enter the radius of cylinder : ");
		oMvcRadiusModel.setRadiusOfCylinder(sc.nextDouble());
	}
	// to retrieve radius value of cylinder
	public double getRadiusOfCylinder() {
		return oMvcRadiusModel.getRadiusOfCylinder();
	}
	

	// to read user input for length of cylinder
	public void readLengthOfCylinder() {
		System.out.println("Enter the length of cylinder : ");
		oMvcLengthModel.setLengthOfCylinder(sc.nextDouble());
		sc.close();
	}
	
	
	// to retrieve length value of cylinder
	public double getLengthOfCylinder() {
		return oMvcLengthModel.getLengthOfCylinder();
	}
		
		
	// to publish area of cylinder
	public void displayAreaOfCylinder(double area) {
		System.out.println("Area of cylinder : "+area);
	}
	
	// to publish volume of cylinder
	public void displayVolumeOfCylinder(double volume) {
		System.out.println("Volume of cylinder : "+volume);
	}
		
}
