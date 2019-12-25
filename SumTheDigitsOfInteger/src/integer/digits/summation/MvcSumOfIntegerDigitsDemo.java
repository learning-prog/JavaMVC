/**
 * @author learning-java
 * 
 * to demo the operation
 */

package integer.digits.summation;

public class MvcSumOfIntegerDigitsDemo {

	public static void main(String[] args) {
		// instantiations
		MvcSumOfIntegerDigitsController oMvcSumOfIntegerDigitsController = new MvcSumOfIntegerDigitsController();
		MvcIntegerInputOutputView oMvcIntegerInputOutputView = new MvcIntegerInputOutputView();
		
		// for user input of the integer value
		oMvcIntegerInputOutputView.toSetIntegerInputValue();
		
		// check whether user input exceeds allowed integer value
		if(oMvcIntegerInputOutputView.toGetIntegerInputValue()<=1000) {
			// to sum all digits of integer value
			int sum = oMvcSumOfIntegerDigitsController.toAddValueOfIntegerDigits(oMvcIntegerInputOutputView);		
			// to display the sum value
			oMvcIntegerInputOutputView.toDisplaySumValueOfIntegerDigits(sum);
		}
		
		else{
			oMvcIntegerInputOutputView.toDisplayOverLimitValueOfInteger();
		}
	}

}
