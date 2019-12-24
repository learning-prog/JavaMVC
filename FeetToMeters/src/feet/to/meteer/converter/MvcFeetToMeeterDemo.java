/**
 * @author learning-java
 * 
 * to demonstrate the project
 */

package feet.to.meteer.converter;

public class MvcFeetToMeeterDemo {

	public static void main(String[] args) {
		// instantiations
		MvcFeetToMeeterView oMvcFeetToMeeterView = new MvcFeetToMeeterView();
		MvcFeetToMeeterConverter oMvcFeetToMeeterConverter = new MvcFeetToMeeterConverter();
		
		// to read user input in feet
		oMvcFeetToMeeterView.toSetFeetValue();
		
		// to convert from feet to meeter
		double result = oMvcFeetToMeeterConverter.toComputeFeetToMeeter(oMvcFeetToMeeterView);
		
		// to publish the equivalent meeter result value
		oMvcFeetToMeeterView.toDisplayEquivalentMeeterValue(result);
	}

}
