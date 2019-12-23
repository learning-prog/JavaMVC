/**
 * @author learning-java
 * 
 * to demo area and volume of cylinder
 */

package area.volume.of.cylinder;

public class MvcCylinderDemo {

	public static void main(String[] args) {
		// instantiation
		MvcCylinderView oMvcCylinderView = new MvcCylinderView();
		MvcCylinderController oMvcCylinderController = new MvcCylinderController();
		
		// to take user inputs for radius of cylinder
		oMvcCylinderView.readRadiusOfCylinder();
		// to take user inputs for length of cylinder
		oMvcCylinderView.readLengthOfCylinder();
			
		// to calculate area of cylinder
		double area = oMvcCylinderController.toCalculateAreaOfCylinder(oMvcCylinderView);
		// to display calculated area of cylinder
		oMvcCylinderView.displayAreaOfCylinder(area);
		
		// to calculate volume of cylinder
		double volume = oMvcCylinderController.toCalculateVolumeOfCylinder(oMvcCylinderView);
		//to display calculated volume of cylinder
		oMvcCylinderView.displayVolumeOfCylinder(volume);
	}

}
