/**
 * @author learning-java
 * 
 * read the length of cylinder
 */

package area.volume.of.cylinder;

public class MvcLengthModel {
	// class variable
	private double lengthOfCylinder;
	
	// POJO constructor
	public MvcLengthModel() {
		
	}
	
	// to set the length of cylinder
	public void setLengthOfCylinder(double length) {
		this.lengthOfCylinder = length;
	}
	
	// to get the length of cylinder
	public double getLengthOfCylinder() {
		return lengthOfCylinder;
	}
}
