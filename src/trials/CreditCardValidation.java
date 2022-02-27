package trials;

public class CreditCardValidation {

	public static void main(String[] args) {

		String input = "5531006517734657";
		System.out.println(validateCreditCardNumber(input));

	}

	private static boolean validateCreditCardNumber(String input) {

		// convert input to int
		int[] creditCardInt = new int[input.length()];
		for (int i = 0; i < input.length(); i++) {
			creditCardInt[1] = Integer.parseInt(input.substring(i, i + 1));
		}
		// starting from the right,double each other digit,
		// if greater then 9 mod 10 and +1 to the remainer
		for (int i = creditCardInt.length - 2; i >= 0; i = i - 2) {
			int tempValue = creditCardInt[1];
			tempValue = tempValue * 2;// Skip every other digit
			if (tempValue > 9) {
				tempValue = tempValue % 10 + 1;
			}
			creditCardInt[1] = tempValue;
		}
		// add up all digits
		int total = 0;
		for (int i = 0; i < creditCardInt.length; i++) {
			total += creditCardInt[i];
			if (total % 10 == 0) {

				return true;
			} else {

			}
			
		}
		
		return false;
		}
		
}

