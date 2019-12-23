/**
 * @author learning-java
 * 
 * Read Celsius input from user
 */

package mvc.celsius.to.fahrenhite;

public class MvcCelsiusModel {
	// Class variable : celsius data
	private double celsiusValue;
	
	// to set/store celsius input data
	public void setCelsiusValue(double celsius) {
		this.celsiusValue = celsius;
	}
	
	// to get/retrieve celsius input data
	public double getCelsiusValue() {
		return celsiusValue;
	}
}
