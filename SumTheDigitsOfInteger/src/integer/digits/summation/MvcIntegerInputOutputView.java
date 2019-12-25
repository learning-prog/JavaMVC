/**
 * @author learning-java
 * 
 * 1. read an integer as user input
 * 2. publish summation result
 */

package integer.digits.summation;

import java.util.Scanner;

public class MvcIntegerInputOutputView {
	// instantiation
	MvcIntegerInputModel oMvcIntegerInputModel = new MvcIntegerInputModel();
	
	// POJO constructor
	public MvcIntegerInputOutputView() {
		
	}
	
	// to set integer input value
	public void toSetIntegerInputValue() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer value : ");
		oMvcIntegerInputModel.setIntegerValue(sc.nextInt());
		
		sc.close();
	}
	
	// to get the integer input value
	public int toGetIntegerInputValue() {
		return oMvcIntegerInputModel.getIntegerValue();
	}
	
	// to publish summation result of integer digits
	public void toDisplaySumValueOfIntegerDigits(int res) {
		System.out.println("The summation value of integer digits : "+res);
	}
	
	// to publish over limit input value from user
	public void toDisplayOverLimitValueOfInteger() {
		System.out.println("The user input integer value is beyond 1000 value");
	}
}
