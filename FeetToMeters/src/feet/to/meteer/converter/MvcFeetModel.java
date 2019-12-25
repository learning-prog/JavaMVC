/**
 * @author learning-java
 * 
 * read user inputs for feet
 */

package feet.to.meteer.converter;

public class MvcFeetModel {
	// class variable
	private double feetValue;
	
	// POJO constructor
	public MvcFeetModel() {
		
	}
	
	// to take user input for feet variable
	public void setFeetValue(double feet) {
		this.feetValue = feet;
	}
	
	// to retrieve received user input for feet variable
	public double getFeetValue() {
		return feetValue;
	}
}
