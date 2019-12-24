/**
 * @author learning-java
 * 
 * 1. read the feet input value
 * 2. publish the result in meters
 */

package feet.to.meteer.converter;

import java.util.Scanner;

public class MvcFeetToMeeterView {
	// instantiation
	MvcFeetModel oMvcFeetModel = new MvcFeetModel();
	
	// to read the feet value from console
	public void toSetFeetValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in feet : ");
		oMvcFeetModel.setFeetValue(sc.nextDouble());
		sc.close();
	}
	
	// to return received feet value input
	public double toGetFeetValue() {
		return oMvcFeetModel.getFeetValue();
	}
	
	// to publish the result value in meeter
	public void toDisplayEquivalentMeeterValue(double res) {
		System.out.println("The equivalent result value is "+res);
	}
}
