/**
 * @author learning-java
 * 
 * 1. read Celsius input from user
 * 2. to get/retrieve celsius input data
 * 3. publish equivalent fahrenheit value
 */

package mvc.celsius.to.fahrenhite;

import java.util.Scanner;

public class MvcCelsiusToFahrenheitView {
	// instantiation
	MvcCelsiusModel oMvcCelsiusModel = new MvcCelsiusModel();
	
	// to set/store celsius input data
	public void toSetMvcCelsiusView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature value in Celsius : ");
		oMvcCelsiusModel.setCelsiusValue(sc.nextDouble());
		sc.close();
	}
	
	// to get/retrieve celsius input data
	public double toGetMvcCelsiusView() {
		return oMvcCelsiusModel.getCelsiusValue();
	}
	
	// publish equivalent fahrenheit value
	public void toDisplayMvcFahrenheitView(double fahrenheit) {
		System.out.println("Equivalent temperature value in Fahrenheit : "+fahrenheit);
	}
}
