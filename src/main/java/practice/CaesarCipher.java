package practice;

/**
 * Encrypt a message using the Caesar Cipher.
 * @author srollins
 *
 */
public class CaesarCipher {

	
	/**
	 * Returns the message encrypted using the given shift
	 * amount.
	 * 
	 * If the shift is greater than 26 the method returns null.
	 * If the message contains any characters that are not upper
	 * or lower case letters the method returns null.
	 * 
	 * Example: (abc, 2) -> cde
	 * 
	 * @param message
	 * @param shift
	 * @return
	 */


	public String encrypt(String message, int shift) {
        if (shift > 26){
            return  null;
        }
	    String result = "";
		for(int i = 0; i < message.length(); i++){
            if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
                result += (char)('a' + (message.charAt(i) - 'a' + shift)%26);
            }else if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z'){
                result += (char)('A' + (message.charAt(i) - 'A' + shift)%26);
            }else{
                return  null;
            }

        }
		return result;
	}
	
	
	public static void main(String[] args) {

	}
	
}
