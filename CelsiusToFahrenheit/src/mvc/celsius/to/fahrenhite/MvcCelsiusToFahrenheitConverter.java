/**
 * @author learning-java
 * 
 * convert celsius into fahrenheit using below formula  
    		fahrenheit = (9 / 5) * celsius + 32
 */

package mvc.celsius.to.fahrenhite;

public class MvcCelsiusToFahrenheitConverter {	
	// POJO constructor
	public MvcCelsiusToFahrenheitConverter() {
		
	}
	
	// convert celsius into fahrenheit
	public double toConvertMvcCelsiusToFahrenheit(MvcCelsiusToFahrenheitView oMvcCelsiusToFahrenheitView) {
		double res;
		res = ((oMvcCelsiusToFahrenheitView.toGetMvcCelsiusView()*9.0)/5)+32;
		
		return res;
	}
}
