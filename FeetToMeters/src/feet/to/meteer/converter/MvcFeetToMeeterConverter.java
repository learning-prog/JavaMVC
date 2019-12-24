/**
 * @author learning-java
 * 
 * convert the feet value into meters using below formula
		1 foot = 0.305 meter
 */

package feet.to.meteer.converter;

public class MvcFeetToMeeterConverter {
	// to compute the feet to meeter conversion
	public double toComputeFeetToMeeter(MvcFeetToMeeterView oMvcFeetToMeeterView) {
		double res = oMvcFeetToMeeterView.toGetFeetValue()*(0.305);
		
		return res;
	}
}
