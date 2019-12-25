/**
 * @author learning-java
 * 
 * calculate sum of digits in integer. For example :
 *		remainder = integer%10  //932%10 = 2 // 93%10 = 3 // 9%10 = 9
 *		temp = integer/10       //932/10 = 93 // 93/10 = 9 // 9/10 = 0
 *		integer = temp		
 *		sum = sum+remainder // 0+2+3+9
 */

package integer.digits.summation;

public class MvcSumOfIntegerDigitsController {
	// to add all digits of integer variable
	public int toAddValueOfIntegerDigits(MvcIntegerInputOutputView oMvcIntegerInputOutputView) {
		int mInteger = oMvcIntegerInputOutputView.toGetIntegerInputValue();
		int sum = 0;
		int rem, temp;
		
		// check whether user input exceeds allowed integer value
		//if(mInteger<=1000) {
		
			// execute the loop until integer extraction ends with zero
			do {
				// to get individual digits
				rem = mInteger%10;
		
				// to add individual digits
				sum = sum + rem;
		
				// to shorten the integer to keep extracting individual digits
				temp = mInteger/10;
				mInteger = temp;
				
			} while(mInteger!=0);
		//}
		//else{
		//	oMvcIntegerInputOutputView.toDisplayOverLimitValueOfInteger();
		//}
		
		return sum;
	}
}
