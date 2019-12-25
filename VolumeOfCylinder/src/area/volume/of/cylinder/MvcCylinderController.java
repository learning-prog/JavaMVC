/**
 * @author learning-java
 * 
 * to calculate area and volume of cylinder
 */

package area.volume.of.cylinder;

public class MvcCylinderController {
	// class variable
	private double area; 
	
	// POJO constructor
	public MvcCylinderController() {
		
	}
	
	// to calculate area of cylinder
	public double toCalculateAreaOfCylinder(MvcCylinderView oMvcCylinderView) {
		area = oMvcCylinderView.getRadiusOfCylinder()*oMvcCylinderView.getRadiusOfCylinder()*Math.PI;
		
		return area;
	}
	
	
	// to calculate volume of cylinder
	public double toCalculateVolumeOfCylinder(MvcCylinderView oMvcCylinderView) {
		double volume = this.area*oMvcCylinderView.getLengthOfCylinder();
		
		return volume;
	}	
}
