/**
 * @author learning-java
 * 
 */

package mvc.celsius.to.fahrenhite;

public class MvcCelsiusToFahrenheitDemo {

	public static void main(String[] args) {
		// instantiation
		MvcCelsiusToFahrenheitView oMvcCelsiusToFahrenheitView = new MvcCelsiusToFahrenheitView();
		MvcCelsiusToFahrenheitConverter oMvcCelsiusToFahrenheitConverter = new MvcCelsiusToFahrenheitConverter();
		
		// Read Celsius input from user
		oMvcCelsiusToFahrenheitView.toSetMvcCelsiusView();
		
		// convert celsius into fahrenheit
		double fahrenheit = oMvcCelsiusToFahrenheitConverter.toConvertMvcCelsiusToFahrenheit(oMvcCelsiusToFahrenheitView);
		
		// publish equivalent fahrenheit value
		oMvcCelsiusToFahrenheitView.toDisplayMvcFahrenheitView(fahrenheit);
	}

}
