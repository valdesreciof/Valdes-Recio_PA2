/*
 * split input by digit 
 * modify each digit
 * swap order of digits for output
 */
public class Encrypter {

	public int encrypt(int input) {
		
		int fourthDigit = (input/1000)%10;
		int thirdDigit = (input/100)%10;
		int secondDigit = (input/10)%10;
		int firstDigit = input%10;
		
		int newFirst = (firstDigit+7)%10;
		int newSecond = (secondDigit+7)%10;
		int newThird = (thirdDigit+7)%10;
		int newFourth = (fourthDigit+7)%10;			
		
		return (newSecond*1000)+(newFirst*100)+(newFourth*10)+newThird;
		
	}
}
