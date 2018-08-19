package practice;

import java.util.HashMap;

/**
 * A class to help translate an alphanumeric 
 * "phone number" to the appropriate digits.
 * 
 *  Example:
 *   - input: CSROCKS 
 *   - output: 2776257
 * 
 * @author srollins
 *
 */
public class PhoneNumberTranslation {

	/**
	 * Translates the String alpha to a String
	 * containing the digit representation of
	 * each character in alpha.
	 * 
	 * alpha must contain exactly seven characters and the
	 * method returns null if alpha is of incorrect length.
	 * 
	 * Letters may be upper or lower case.
	 * A digit in alpha will be translated to the 
	 * same digit in the result.
	 * 
	 * The translation is as follows.	 
	 * 1 -> 1
	 * 'ABC' -> 2 
	 * 'DEF' -> 3
	 * 'GHI' -> 4
	 * 'JKL' -> 5
	 * 'MNO' -> 6
	 * 'PQRS' -> 7
	 * 'TUV' -> 8
	 * 'WXYZ' -> 9
	 * 0 -> 0
	 * 
	 * Any other characters in alpha are considered invalid
	 * and will cause the method to return null.
	 * 
	 * @param alpha
	 * @return
	 */
	public String alphaToNumber(String alpha) {
		//REPLACE WITH YOUR CODE
		if (alpha.length() != 7) {
			return null;
		}
		String alphaCopy = alpha.toUpperCase(), result = "";
		HashMap<Character, Character> mappingChar = new HashMap<>();
		mappingChar.put('A', '2');
		mappingChar.put('B', '2');
		mappingChar.put('C', '2');
		mappingChar.put('D', '3');
		mappingChar.put('E', '3');
		mappingChar.put('F', '3');
		mappingChar.put('G', '4');
		mappingChar.put('H', '4');
		mappingChar.put('I', '4');
		mappingChar.put('J', '5');
		mappingChar.put('K', '5');
		mappingChar.put('L', '5');
		mappingChar.put('M', '6');
		mappingChar.put('N', '6');
		mappingChar.put('O', '6');
		mappingChar.put('P', '7');
		mappingChar.put('Q', '7');
		mappingChar.put('R', '7');
		mappingChar.put('S', '7');
		mappingChar.put('T', '8');
		mappingChar.put('U', '8');
		mappingChar.put('V', '8');
		mappingChar.put('W', '9');
		mappingChar.put('X', '9');
		mappingChar.put('Y', '9');
		mappingChar.put('Z', '9');
		for(int i = 0; i < alphaCopy.length(); i++){
			if (alphaCopy.charAt(i) >= '0' && alphaCopy.charAt(i) <= '9') {
				result += alphaCopy.charAt(i);
			}else if(alphaCopy.charAt(i) >= 'A' && alphaCopy.charAt(i) <= 'Z') {
				result += mappingChar.get(alphaCopy.charAt(i));
			}else{
				return null;
			}
		}
		return result;


	}
	
}
